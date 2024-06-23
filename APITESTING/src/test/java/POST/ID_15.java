package POST;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class ID_15 {
	@Test
	void post()
	{
		HashMap H = new HashMap();
		H.put("id", "15");
		H.put("email", "nani157.gmail.com");
		H.put("first name", "V");
		H.put("ilast name", "SudheerNani");
		
		
		
		given()
			.contentType("application/json")
			.body(H)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.log().all();
	}

}
