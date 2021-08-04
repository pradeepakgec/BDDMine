package restRequests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.stringContainsInOrder;

public class POST {
	
	public void postWeatherDetails() {
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
