import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import models.AuthorModel;
public class AuthorModelTest1 {
	
	
	
	@Test
	public void testSetAndGetName() {
		 AuthorModel a= new AuthorModel(); 
		 a.setName("Gagan");
        assertThat(a.getName()).isEqualTo("Gagan");
    }
	@Test
	public void testSetAndGetScreenName() {
		 AuthorModel a= new AuthorModel(); 
		 a.setScreenName("Gagan");
        assertThat(a.getScreenName()).isEqualTo("Gagan");
    }
	

}
