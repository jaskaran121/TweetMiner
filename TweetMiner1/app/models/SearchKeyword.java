package models;

import java.util.HashSet;
import java.util.Set;

import play.data.validation.Constraints;


public class SearchKeyword {

	
	private String keyword;
	
	/**
	 * Default Constructor
	 */
	public SearchKeyword() {
		
	}
	
	/**
	 * Parameterized Constructor
	 * 
	 * @param keyword the word to be searched of type String 
	 */
	
	public SearchKeyword(String keyword) {
		this.setKeyword(keyword);
	}
	
	
	/**
	 * Gets keyword to be searched.
	 * 
	 * @return keyword type String
	 */
	
	public String getKeyword() {
		return keyword;
	}
	
	/**
	 * Sets keyword to be searched.
	 * 
	 * @param keyword of type String
	 */
	
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
