package Users;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CurrencySearch {
	
	@Test
	public void searchCurrency()
	{
		// To specify Base URI
		RestAssured.baseURI = "https://api.coingecko.com/api/v3/exchange_rates/";
		
		// Request Object
		RequestSpecification request = RestAssured.given();
		
		// Response Object
		Response response = request.request(Method.GET);
		
		// Response Details
		System.out.println("Response is : "+response);
		String reponseBody = response.getBody().asString();
		System.out.println("reponseBody is : "+reponseBody);
		
		System.out.println("Response as String : "+response.asString());
		
		// To get Response Code
		int code = response.getStatusCode();
		System.out.println("Response Code is : "+code);
		
		// Verification of Status Code
		Assert.assertEquals(code, 200);
		
		// To get Response Line
		String line = response.getStatusLine();
		System.out.println("Response Status Line is : "+line);
		
		// Verification of Status Line
		Assert.assertEquals(line, "HTTP/1.1 200 OK");
		
		System.out.println("*******TEST PASS*******");
	}
}
