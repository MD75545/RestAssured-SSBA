/*package practiceTaxbbuddyApiTest;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
public class ITRUserStatusTest
{
	 @Test
	   public void userStatusTest()
	   {
		   RequestSpecification reqspec = RestAssured.given();
		   
		   //Base URL
		   reqspec.baseUri("https://api.taxbuddy.com");
		   
		   //path parameter
		   reqspec.pathParam("User", "user");
		   reqspec.pathParam("status", "itr-status");
		
		   //query parameters in the form of key and value
		   reqspec.queryParam("userId", 721169);
		   reqspec.queryParam("assessmentYear", 2022-2023);
		   reqspec.queryParam("serviceType", "ITR");
		   
		   // sending the request 
		  Response res = reqspec.when().get("/{User}/{status}");
		  
		  // validating response
		  ValidatableResponse validateRes = res.then();
		  validateRes.assertThat().statusCode(200).log().all();
	   }
}
*/