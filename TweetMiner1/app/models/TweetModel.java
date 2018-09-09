package models;

import java.util.List;

import play.api.mvc.QueryStringBindable;
import twitter4j.GeoLocation;

import twitter4j.HashtagEntity;

/**
 * Defines parameters of tweet.
 *
 * @author Jaskaran Singh
 * @author Gagandeep Singh
 */


public class TweetModel {

	
	private AuthorModel author;
	private String tweet;
	private List<HashtagEntity> hashtags;
	private double latitude;
	private String geoLocation;
	
	/**
     * Gets geoLocation of the tweet.
     *
     * @return geoLocation of type String
     */
	public String getGeoLocation() {
		return geoLocation;
	}
	
	/**
     * Sets geoLocation of the tweet.
     *
     * @param geoLocation of type String
     */
	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}

	/**
     * Gets latitude of geolocation.
     *
     * @return latitude of double
     */
	public double getLatitude() {
		return latitude;
	}
	
	/**
     * Sets latitude of geolocation.
     *
     * @param latitude of double
     */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
     * Gets longitude of geolocation.
     *
     * @return longitude of type double
     */
	public double getLongitude() {
		return longitude;
	}

	/**
     * Sets longitude of geolocation.
     *
     * @param longitude of type double
     */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	private double longitude;
	
	
	/**
     * Gets Hashtags associated with tweet.
     *
     * @return hashtags of type List<HashtagEntity>
     */
	public List<HashtagEntity> getHashtags() {
		return hashtags;
	}

	/**
     * Sets Hashtags associated with tweet.
     *
     * @param hashtags of type List<HashtagEntity>
     */
	public void setHashtags(List<HashtagEntity> hashtags) {
		this.hashtags = hashtags;
	}

	private String location;
	
	/**
     * Sets Location of the user.
     *
     * @param string of type String
     */
	public void setLocation(String string) {
		this.location = string;
	}

	/**
     * Gets Author of the tweet.
     *
     * @return author of type AuthorModel
     */
	public AuthorModel getAuthor()
	{
		return author;
	}
	
	/**
     * Gets text of Tweet.
     *
     * @return tweet of type String
     */
	public String getTweet()
	{
		return tweet;
	}
	
	/**
     * Gets Location of the user.
     *
     * @return location of type String
     */
	public String getLocation()
	{
		return location;
	}
	
	/**
     * Sets Author of the tweet.
     *
     * @param author of type AuthorModel
     */
	public void setAuthor(AuthorModel author) {
		this.author = author;
	}
	
	/**
     * Sets text of Tweet.
     *
     * @param tweet of type String
     */
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
}
