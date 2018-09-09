import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.AbstractAssert;
import org.junit.Before;
import org.junit.Test;

import controllers.TweetMinerController;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

import models.SearchKeyword;
import models.TweetModel;
import play.mvc.Result;
import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.Place;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.RateLimitStatus;
import twitter4j.Scopes;
import twitter4j.Status;
import twitter4j.SymbolEntity;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.contentAsString;

public class TweetMinerControllerTest {

	Twitter twitter = mock(Twitter.class);
	TwitterFactory tf=mock(TwitterFactory.class);
	QueryResult qr= mock(QueryResult.class);
	TweetMinerController tmc;
	@Before
	public void setUp() {
		when(tf.getInstance()).thenReturn(null);
		when(twitter.search()).thenReturn(null);
		Status s= new Status() {
			
			@Override
			public UserMentionEntity[] getUserMentionEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public URLEntity[] getURLEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public SymbolEntity[] getSymbolEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public MediaEntity[] getMediaEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public HashtagEntity[] getHashtagEntities() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public RateLimitStatus getRateLimitStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAccessLevel() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int compareTo(Status o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean isTruncated() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isRetweetedByMe() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isRetweeted() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isRetweet() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isPossiblySensitive() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isFavorited() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String[] getWithheldInCountries() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public User getUser() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return "Hello";
			}
			
			@Override
			public String getSource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Scopes getScopes() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Status getRetweetedStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getRetweetCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getQuotedStatusId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Status getQuotedStatus() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Place getPlace() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLang() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getInReplyToUserId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getInReplyToStatusId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getInReplyToScreenName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public GeoLocation getGeoLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getFavoriteCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getDisplayTextRangeStart() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getDisplayTextRangeEnd() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getCurrentUserRetweetId() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Date getCreatedAt() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long[] getContributors() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		when(qr.getTweets()).thenReturn(Arrays.asList(s,s,s));
	 tmc= new TweetMinerController();
    }
	
	
	
	@Test
	public  void testSetEmotionHappy()  {
		TweetModel t1= new TweetModel();
		t1.setTweet("Happy :-)");
		TweetModel t2= new TweetModel();
		 t2.setTweet("hello :-)");
		TweetModel t3= new TweetModel();
		 t3.setTweet("hello :-)");
		TweetModel t4= new TweetModel();
		 t4.setTweet("Hi :-(");
		List<TweetModel> ls= Arrays.asList(t1, t2,t3,t4);
		assertThat(tmc.setEmotioncount(ls)).isEqualTo(":-)");;
	}
	@Test
	public  void testSetEmotionSad() {
		TweetModel t1= new TweetModel();
		t1.setTweet("Happy :-(");
		TweetModel t2= new TweetModel();
		 t2.setTweet("hello :-(");
		TweetModel t3= new TweetModel();
		 t3.setTweet("Hi :-("); 
		TweetModel t4= new TweetModel();
		 t4.setTweet("Hi :-)");
		List<TweetModel> ls= Arrays.asList(t1, t2,t3,t4);
		assertThat(tmc.setEmotioncount(ls)).isEqualTo(":-(");;
	}
	@Test
	public  void testSetEmotionNeutral() {
		TweetModel t1= new TweetModel();
		t1.setTweet("Happy :-|");
		TweetModel t2= new TweetModel();
		 t2.setTweet("hello :-(");
		TweetModel t3= new TweetModel();
		 t3.setTweet("Hi :-)");
		List<TweetModel> ls= Arrays.asList(t1, t2,t3);
		assertThat(tmc.setEmotioncount(ls)).isEqualTo(":-|");;
	}
	
}
