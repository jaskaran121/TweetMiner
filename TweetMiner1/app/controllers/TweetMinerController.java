package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TooManyListenersException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.function.Function;
import models.AuthorModel;
import javax.inject.Inject;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import models.TweetModel;
import javassist.compiler.ast.Keyword;
import models.SearchKeyword;
import play.Logger.ALogger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import twitter4j.Twitter.*;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.*;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;

/**
 * This TweetMinerController program contains multiple actions to 
 * handle HTTP requests to the application's search page.
 * @version 1.0
 * @author Jaskaran Singh
 * @author Gagandeep Singh
 */
public class TweetMinerController extends Controller {
	@Inject
	FormFactory formfactory;
	Config config;
	Twitter twitter;
	private static ALogger logger = play.Logger.of(TweetMinerController.class);
	private final LinkedHashMap<String,List<TweetModel>> tweets;
	private final LinkedHashMap<String,List<TweetModel>> tweetsFull;
	
	/**
	 * This Default Constructor loads configuration to create  
	 * twitter instance for authorization of Twitter4J API.
	 */
	public TweetMinerController() {
		config = ConfigFactory.load();
		tweets = new LinkedHashMap<>();
		tweetsFull=new LinkedHashMap<>();
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(config.getString("CONSUMER_KEY"))
				.setOAuthConsumerSecret(config.getString("CONSUMER_SECRET"))
				.setOAuthAccessToken(config.getString("ACCESS_TOKEN"))
				.setOAuthAccessTokenSecret(config.getString("ACCESS_TOKEN_SECRET"))
				.setTweetModeExtended(true);
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter = tf.getInstance();

	}
	/**
	 * Renders home page.
	 * 
	 * This method declares Form Factory for managing UI forms.
	 * Then, if the list of tweets is not empty, 
	 * clears this list.
	 * 
	 * @return promise of a result to a rendered search home page.
	 * @author Gagandeep
	 */
	public CompletionStage<Result> index() {
		Form<SearchKeyword> form= formfactory.form(SearchKeyword.class);
		if(!tweets.isEmpty())tweets.clear();
		return CompletableFuture.completedFuture(ok(views.html.listresult.render(form,tweets)));
		   
    }
	
	/**
	 * Renders the page containg the tweets list.
	 * 
	 * This method declares Form Factory for managing UI forms.
	 * 
	 * @return promise of a result to a rendered search home page.
	 * @author Gagandeep
	 */
	public CompletionStage<Result> tweetrouter() {
		Form<SearchKeyword> form= formfactory.form(SearchKeyword.class);
		return CompletableFuture.completedFuture(ok(views.html.listresult.render(form,tweets)));
		   
    }
	
	/**
	 * Handles tweet search based on keywords entered by client.
	 * 
	 * Retrieves a search string from a UI form. 
	 * Then, creates instance of Query by calling Twitter4j API,sends this
	 * instance to method getQueryResult. 
	 * 
	 * @return promise of a result with redirection to tweetrouter.
	 * @author Gagandeep
	 */
	
	public CompletionStage<Result> search()
    {
		CompletableFuture<List<TweetModel>> futureTweet = null;
	
		Form<SearchKeyword> form = formfactory.form( SearchKeyword.class ).bindFromRequest(  );
        SearchKeyword keyword = form.get();
        
        String word = keyword.getKeyword();
        Query searchString = new Query(word);
        searchString.setCount(100);
        form = formfactory.form( SearchKeyword.class );
        futureTweet = CompletableFuture.supplyAsync(() -> getQueryResult(searchString));
        return futureTweet.thenCombine(futureTweet.thenApply((tweets)->setEmotioncount(tweets)),
        											(tweets,emotion)->{this.tweetsFull.put(word+" "+emotion, tweets); return this.tweets.put( word+" "+emotion,tweets.stream().limit(10).collect(Collectors.toList()));}).thenApply(tweets -> {
        												
        												return redirect(routes.TweetMinerController.tweetrouter());
        									        });	
        
       
    }
	
	/**
	 * Determines sentiments of a search query.
	 * 
	 * Calculates happytweet,sadtweet,neutral tweet count. 
	 * 
	 * @param  list of tweets
	 * @return string of emotion with highest count.
	 * @author Prabhleen
	 */
	public String setEmotioncount(List<TweetModel> tweets) {
		
		Long happycount = tweets.stream().map(TweetModel::getTweet).filter(st->(st.contains(":-)")||st.contains(":)")) && !(st.contains(":-(")||st.contains(":("))).count();
		Long sadcount = tweets.stream().map(TweetModel::getTweet).filter(st->(st.contains(":-(")||st.contains(":(")) && !(st.contains(":-)")||st.contains(":)"))).count();
		Long neutralcount =tweets.stream().map(TweetModel::getTweet).filter(st->!(st.contains(":-(")||st.contains(":(")) && !(st.contains(":-)")||st.contains(":)"))).count();
		
		Long total=happycount+sadcount+neutralcount;
		if(total!=0) {
		if(((happycount*100)/total)>70) {
			return ":-)";
		}
		else if(((sadcount*100)/total)>70) {
			return ":-(";
		}
		else {
			return ":-|";
		}
		}
		else {return ":-|";}
			
		}
	/**
	 * Queries the TwitterAPI to fetch tweet data.
	 * 
	 * Adds this tweet data to a list.
	 * 
	 * @param  searchString instance of type Query.          
	 * @return list of type TweetModel
	 * @author Jaskaran
	 * @throws TwitterException It throws a TwitterException
	 */

	public List<TweetModel> getQueryResult(Query searchString)
	{
		List<TweetModel> resultTweets = null;
		try {
		QueryResult getResult = twitter.search(searchString);

		List<Status> tweets = getResult.getTweets();
		AuthorModel author;
		TweetModel tweetModel;
		resultTweets = new ArrayList<>();
		for (Status s : tweets) {
			author = new AuthorModel();
			author.setName(s.getUser().getName());
			author.setScreenName(s.getUser().getScreenName());
			tweetModel = new TweetModel();
			tweetModel.setAuthor(author);
			tweetModel.setTweet(s.getText());
			tweetModel.setHashtags(Arrays.asList(s.getHashtagEntities()));
			if(s.getGeoLocation()!=null) {
				tweetModel.setGeoLocation(s.getGeoLocation().toString());
			tweetModel.setLatitude(s.getGeoLocation().getLatitude());
			tweetModel.setLongitude(s.getGeoLocation().getLongitude());}
			if(s.getUser().getLocation()!=null) tweetModel.setLocation(s.getUser().getLocation());
			resultTweets.add(tweetModel);
		}
		
		} catch (TwitterException exp) {
			
		}
		
		return resultTweets;
	}
	
	/**
	 * Renders User Data page.
	 * 
	 * Queries Twitter4j API to fetch personal data of tweet owner.
	 * 
	 * @param  screenName of owner of type String.      
	 * @return promise of a result to a rendered user profile page.
	 * @author Gagandeep
	 * @throws TwitterException It throws a TwitterException
	 */
	public CompletableFuture<Result> getUserData(String screenName) throws TwitterException
	{

		CompletableFuture<User> futureUser = CompletableFuture.supplyAsync(() -> {
			User user = null;
			try {
				
				user = twitter.showUser(screenName);
			} catch (TwitterException exp) {
				
			}
			return user;
		});
		CompletableFuture<ResponseList<Status>> futureRecentPost = CompletableFuture.supplyAsync(() -> {
			ResponseList<Status> recentPost = null;
			try {
				recentPost = twitter.getUserTimeline(screenName);
			} catch (TwitterException exp) {
				
			}
			return recentPost;
		});
		return futureUser.thenCombine(futureRecentPost, (user,recentPost)->ok(views.html.UserData.render(user, recentPost)));
	}
	
	
	/**
	 * Renders WordLevelStatistics page.
	 * 
	 * Calculates count of each word,mapping of 
	 * word with its count.
	 * Sorting this Map in descending order.
	 * 
	 * @param  searchKeyword location to be searched of type String.      
	 * @return promise of a result to a rendered WordLevelStatistics page.
	 * @author Gurdip
	 */
	
	public CompletionStage<Result> appendString(String searchKeyword)
	{
        List<TweetModel> l=this.tweetsFull.get(searchKeyword);
        String str=l.stream().map(TweetModel::getTweet).reduce("",(String t1,String t2)->t1+t2);
        String words = str.replaceAll("[^\\w\\s]", ""); 
		String formatted = words.trim().replaceAll(" +", " ");
		List<String> words1 = Arrays.asList(formatted.split("\\s"));
		 Map<String, Long> result =
	                words1.stream().map(String::toLowerCase).collect(
	                        Collectors.groupingBy(
	                                Function.identity(), Collectors.counting()));
		 
		 
		 Map<String, Long> secondMap = new LinkedHashMap<>();
		 
		 result.entrySet().stream()
         .sorted(Map.Entry.<String, Long>comparingByValue()
                 .reversed()).forEachOrdered(e -> secondMap.put(e.getKey(), e.getValue()));
		 
		return  CompletableFuture.completedFuture( ok(views.html.WordLevelStatistics.render(secondMap)));
	}
	
	
	
	
	
	
	
	
	/**
	 * Renders hashTaglistresult page.
	 * 
	 * Queries Twitter API for hashtagkeywords.
	 * 
	 * @param searchKeyword of Type String.      
	 * @return promise of a result to a rendered hashTaglistresult page.
	 * @author Jaskaran
	 */
	
	public CompletionStage<Result> searchHashTag(String searchKeyword)
	{
		CompletableFuture<List<TweetModel>> futureTweet = null;
		Query searchString = new Query("#"+searchKeyword);
        searchString.setCount(10);
     
        futureTweet = CompletableFuture.supplyAsync(() -> getQueryResult(searchString));
        
        return futureTweet.thenApply(tweets -> {
			
			return ok(views.html.hashTaglistresult.render("#"+searchKeyword,tweets));
	});
	
	}
	
	/**
	 * Renders locationTweets page.
	 * 
	 * Queries Twitter API to fetch tweets by location.
	 * 
	 * @param keyword of Type String.      
	 * @return list of tweets,coordinates of Location.
	 * @author Amankirat
	 * @throws TwitterException It throws a API Error exception
	 */

	public Result getLatLongPositions(String address) throws Exception
	  {
int responseCode = 0;
 
String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8") + "&sensor=true";
	    URL url = new URL(api);
	    HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
	    httpConnection.connect();
	    responseCode = httpConnection.getResponseCode();
	    String latitude="";
	      String longitude ="";
	    if(responseCode == 200)
	    {
	      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();;
	      Document document = builder.parse(httpConnection.getInputStream());
	      XPathFactory xPathfactory = XPathFactory.newInstance();
	      XPath xpath = xPathfactory.newXPath();
	      XPathExpression expr = xpath.compile("/GeocodeResponse/status");
	      String status = (String)expr.evaluate(document, XPathConstants.STRING);
	      
	      if(status.equals("OK"))
	      {
	         expr = xpath.compile("//geometry/location/lat");
	         latitude = (String)expr.evaluate(document, XPathConstants.STRING);
	         expr = xpath.compile("//geometry/location/lng");
	         longitude = (String)expr.evaluate(document, XPathConstants.STRING);
	        
	      }
	      else
	      {
	         throw new Exception("Error from the API - response status: "+status);
	      }
	    }
	    
	     GeoLocation geo = new GeoLocation(Double.parseDouble(latitude),Double.parseDouble(longitude));
	   
	    List<String> final_one = new ArrayList<>();
	    QueryResult getResult = twitter.search(new Query().geoCode(geo, 50, "1km"));
	    List<Status> tweets = getResult.getTweets();
	    for(Status s:tweets)
	    {
	    	final_one.add(s.getText());
	    	if(final_one.size()==10)
	    		break;
	    }
	    return ok(views.html.locationTweets.render(final_one,latitude,longitude));
	  }
	
	
	
}
