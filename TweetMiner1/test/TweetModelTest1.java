import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;


import org.junit.Test;

import models.AuthorModel;
import models.TweetModel;
import twitter4j.HashtagEntity;;
public class TweetModelTest1 {
	
	@Test
	public void testSetAndGetTweet() {
		 TweetModel a= new TweetModel(); 
		 a.setTweet("Gagan");
        assertThat(a.getTweet()).isEqualTo("Gagan");
    }
	
	@Test
	public void testSetAndGetAuthor() {
		 TweetModel a= new TweetModel(); 
		 AuthorModel b= new AuthorModel();
		 a.setAuthor(b);
        assertThat(a.getAuthor()).isEqualTo(b);
    }
	
	@Test
	public void testSetAndGetLocation() {
		 TweetModel a= new TweetModel(); 
		 a.setLocation("Montreal");
        assertThat(a.getLocation()).isEqualTo("Montreal");
    }
	
	@Test
	public void testSetAndGetGeoLocation() {
		 TweetModel a= new TweetModel(); 
		 a.setGeoLocation("Montreal");
        assertThat(a.getGeoLocation()).isEqualTo("Montreal");
    }
	
	@Test
	public void testSetAndGetLongitude() {
		 TweetModel a= new TweetModel(); 
		 a.setLongitude(1.23);
        assertThat(a.getLongitude()).isEqualTo(1.23);
    }
	
	@Test
	public void testSetAndGetLattitude() {
		 TweetModel a= new TweetModel(); 
		 a.setLatitude(1.23);
        assertThat(a.getLatitude()).isEqualTo(1.23);
    }
	
	@Test
	public void testSetAndGetHashTagList() {
		 TweetModel a= new TweetModel();
		 List<HashtagEntity> hashtags= Arrays.asList(new HashtagEntity() {
			
			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getStart() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getEnd() {
				// TODO Auto-generated method stub
				return 0;
			}
		}, new HashtagEntity() {
			
			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getStart() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getEnd() {
				// TODO Auto-generated method stub
				return 0;
			}
		} );
		 a.setHashtags(hashtags);;
        assertThat(a.getHashtags()).isEqualTo(hashtags);
    }
}
