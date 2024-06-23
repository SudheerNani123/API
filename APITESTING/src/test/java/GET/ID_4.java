package GET;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class ID_4 {
	@Test
	  void get() {
			
		given()
		
		.when()
		.get("https://reqres.in/api/users/4")
	 
		.then()
		     .statusCode(200)
		     .log().all();
	}

}
