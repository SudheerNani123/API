package GET;

import static io.restassured.RestAssured.given;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class page1 {
	@Test
	  void get() {
			
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=1")
	 
		.then()
		     .statusCode(200)
		     .log().all();
	}

}
