package PayLoadAPI;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class StatusCode {

	@Test
	public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
	      throws ClientProtocolException, IOException{
	   // Given
	   String name = RandomStringUtils.randomAlphabetic( 8 );
	   HttpUriRequest request = new HttpGet( "https://api.github.com/users/" + name );
	 
	   // When
	   org.apache.http.HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
	 
	   // Then
	   assertThat(httpResponse.getStatusLine().getStatusCode(), equals(HttpStatus.SC_NOT_FOUND));
	}

	private void assertThat(int statusCode, boolean equals) {
		// TODO Auto-generated method stub
		
	}

}
