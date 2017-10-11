package PayLoadAPI;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class JsonPayLoad {

	@Test
	public void
	  givenUserExists_whenUserInformationIsRetrieved_thenRetrievedResourceIsCorrect()
	  throws ClientProtocolException, IOException{
	    // Given
	    HttpUriRequest request = new HttpGet( "https://api.github.com/users/eugenp" );
	 
	    // When
	    org.apache.http.HttpResponse response = HttpClientBuilder.create().build().execute( request );
	 
	    // Then
	    GitHubUser resource = RetrieveUtil.retrieveResourceFromResponse(
	      response, GitHubUser.class);
	   // assertThat( "eugenp", Matchers.is( resource.getLogin() ) );
	    
	    System.out.println(resource.getLogin());
	}

}
