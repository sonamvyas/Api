
package Apiautomation.api;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.methods.HttpGet;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class Get200 {
public static final String baseStrin="http://api.github.com";
	
	HttpClient client=  HttpClientBuilder.create().build();// create a client
	
	
	@Test
	public void baseurlReturns200() throws ClientProtocolException, IOException
	{
	
	HttpGet get = new HttpGet(baseStrin);
	//client will call the
	HttpResponse response= client.execute(get);
	int actualstatus = response.getStatusLine().getStatusCode();
	
	
	Assert.assertEquals(actualstatus, 200);// will pass
//	Assert.assertEquals(actualstatus, 400);// will fail 
	
	}

}
