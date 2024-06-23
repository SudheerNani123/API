package GET;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ID_6 {
	@Test
	  void get() {
			
		given()
		
		.when()
		.get("https://reqres.in/api/users/6")
	 
		.then()
		     .statusCode(200)
		     .log().all();
	}

}
