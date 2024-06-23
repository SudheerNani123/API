package DELETE;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class ID_10 {
	@Test(priority = 0)
	  void Del() {
			
		given()
		
		.when()
		.delete("https://reqres.in/api/users/10")
	 
		.then()
		     .statusCode(204)
		     .log().all();
	}
	@Test(priority = 1 )
	  void Del1() {
			
		given()
		
		.when()
		.delete("https://reqres.in/api/users/11")
	 
		.then()
		     .statusCode(204)
		     .log().all();
	}
	@Test(priority = 2 )
	  void get() {
			
		given()
		
		.when()
		.get("https://reqres.in/api/users")
	 
		.then()
		     .statusCode(200)
		     .log().all();
	}
	@Test(priority = 3 )
	  void get1() {
			
		given()
		
		.when()
		.get("https://reqres.in/api/users/4")
	 
		.then()
		     .statusCode(200)
		     .log().all();
	}
	@Test(priority = 4 )
	void post()
	{
		HashMap H = new HashMap();
		H.put("id", "15");
		H.put("email", "nani157.gmail.com");
		H.put("first_name", "V");
		H.put("last_name", "SudheerNani");
		String courses[] = {"python","java","c++"};
		H.put("courses_completed", courses);
		
		
		
		given()
			.contentType("application/json")
			.body(H)
		.when()
			.post("https://reqres.in/api/users")
		.then()
			.statusCode(201)
			.body("id",equalTo("15"))
			.body("email",equalTo("nani157.gmail.com"))
			.body("first_name",equalTo("V"))
			.body("last_name",equalTo("SudheerNani"))
			.body("courses_completed[0]",equalTo("python"))
			.body("courses_completed[2]",equalTo("c++"))
			.body("courses_completed[1]",equalTo("java"))
			.log().all();
	}
	@Test(priority = 5 )
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
