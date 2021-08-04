package Users;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUser {
	
	@Test
	public void createUser()
	{
		// To specify Base URI
		RestAssured.baseURI = "https://gorest.co.in/public-api/users";
		
		// Request Object
		RequestSpecification request = RestAssured.given();
		
				
		// Request Payload with JSON Details
		JSONObject js = new JSONObject();	
		
		// JSON
		//js.put("id", "2000");
		js.put("name", "TestName1");
		js.put("email", "TestName1@TestName");
		js.put("gender", "Male");
		js.put("status", "Active");
		
		// Header Details
		request.header("Content-Type","application/json");
		
		// To Attach Details To Request
		request.body(js.toJSONString());
				
		// Response Object
		Response response = request.request(Method.POST);
		
		// Response Details
		System.out.println("Response is : "+response);
		String reponseBody = response.getBody().asString();
		System.out.println("reponseBody is : "+reponseBody);
		
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
		
		System.out.println("*******TEST Create User PASS*******");
	}
}
