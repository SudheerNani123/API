package GET;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class EntirePage {
	@Test
	  void get() {
			
		given()
		
		.when()
		.get("https://reqres.in/api/users")
	 
		.then()
		     .statusCode(200)
		     .log().all();
	}

}
