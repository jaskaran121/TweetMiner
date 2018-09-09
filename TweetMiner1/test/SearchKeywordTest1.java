import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


import models.SearchKeyword;

public class SearchKeywordTest1 {
	@Test
	public void testSetAndGetName() {
		SearchKeyword a= new SearchKeyword(); 
		 a.setKeyword("Gagan");
        assertThat(a.getKeyword()).isEqualTo("Gagan");
    }
	
	@Test
	public void testConstructor() {
		SearchKeyword a= new SearchKeyword("Gagan"); 
		 
        assertThat(a.getKeyword()).isEqualTo("Gagan");
    }
}

