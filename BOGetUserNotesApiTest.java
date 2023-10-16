/*package taxbuddyApiTest;

import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class BOGetUserNotesApiTest
 {
  @Test
  public void BackOfficeGetUserNotesDetailsTest()
  {
	  baseURI="https://api.taxbuddy.com";
		 ValidatableResponse response = given()
				.when()
				.get("/itr/note/734794")
		.then().assertThat().statusCode(200).log().all();

	
  }
}
*/