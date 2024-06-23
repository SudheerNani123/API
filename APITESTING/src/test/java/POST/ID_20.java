package POST;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
public class ID_20 {
	@Test
	void post()
	{
		HashMap H = new HashMap();
		H.put("id", "20");
		H.put("email", "Sudheer.gmail.com");
		H.put("first name", "V");
		H.put("ilast name", "Sudheer");
		
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
