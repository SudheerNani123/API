package PUT;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class ID_12 {
	@Test
	void put()
	{
		HashMap H = new HashMap();
		H.put("id", "12");
		H.put("email", "sudheer157.gmail.com");
		H.put("first name", "V");
		H.put("last name", "Sudheer");
		
		
		
		given()
			.contentType("application/json")
			.body(H)
		.when()
			.put("https://reqres.in/api/users/12")
		.then()
			.statusCode(200)
			.log().all();
	}

}
