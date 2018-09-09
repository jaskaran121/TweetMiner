package models;
	

/**
 * Defines parameters of Author.
 *
 * @author Jaskaran Singh
 * @author Gagandeep Singh
 */


public class AuthorModel {
	private String name;
	private String screenName;
	/**
     * Gets name of the user profile.
     *
     * @return name of type String
     */
	public String getName() {
		return name;
	}
	/**
     * Sets name of the user profile.
     *
     * @param name of type String
     */
	public void setName(String name) {
		this.name = name;
	}
	/**
     * Gets Screen name of the user profile.
     *
     * @return screenName of type String
     */
	public String getScreenName() {
		return screenName;
	}
	
	/**
     * Sets screen name of the user profile.
     *
     * @param screenName of type String
     */
	
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	
	
}
