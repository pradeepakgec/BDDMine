package restRequests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET {
	
	@Test
	public void getWeatherDetails()
	{		
		given()
		.when()
			.get("http://demoqa.com/utilities/weather/city/Hyderabad")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("City", equalToIgnoringCase("Hyderabad"))
			.header("Content-Type", stringContainsInOrder("application/json"));

	}
}
