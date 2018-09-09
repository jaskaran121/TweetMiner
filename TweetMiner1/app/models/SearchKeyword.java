package models;

import java.util.HashSet;
import java.util.Set;

import play.data.validation.Constraints;

public class SearchKeyword {

	@Constraints.Required
	private String keyword;
	
	/**
	 * 
	 * Default Constructor
	 */
	public SearchKeyword() {
		
	}
	public SearchKeyword(String keyword) {
		this.setKeyword(keyword);
	}
	/**
	 * 
	 * @return keyword the word of type String to be searched
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * 
	 * @param keyword   keyword to be set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	private static Set<SearchKeyword> keywords= new HashSet<SearchKeyword>( );;

	  public static Set<SearchKeyword> allBooks(){
	        return keywords;
	    }

	    public static void add(SearchKeyword book)
	    {
	    	keywords.add(book);
	    }
	@Override
	public String toString() {
		return "TweetData [keyword=" + keyword + "]";
	}
	



}
