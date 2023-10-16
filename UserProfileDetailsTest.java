/*package practiceTaxbbuddyApiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UserProfileDetailsTest 
{
	 @Test
	   public void userDetailsTest()
	   {
		   RequestSpecification reqspec = RestAssured.given();
		   
		   //Base URL
		   reqspec.baseUri("https://api.taxbuddy.com");
		   
		   //path parameter
		   reqspec.pathParam("User", "user");
		   reqspec.pathParam("profile", "profile");
		   reqspec.pathParam("userId", 721169);
		   
		   // sending the request 
		  Response res = reqspec.when().get("/{User}/{profile}/{userId}");
		  
		  // validating response
		  ValidatableResponse validateRes = res.then();
		  validateRes.assertThat().statusCode(200).log().all();
	   }
}
*/