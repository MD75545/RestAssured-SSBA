/*package practiceTaxbbuddyApiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PricingPlansGST_ITRTest 
{
	 @Test
	   public void pricingPlansTest()
	   {
		   RequestSpecification reqspec = RestAssured.given();
		   
		   //Base URL
		   reqspec.baseUri("https://api.taxbuddy.com");
		   
		   //path parameter
		   reqspec.pathParam("serviceType", "itr");
		   reqspec.pathParam("plans", "plans-master");
		
		   // sending the request to get all the pricing plans GST,ITR
		  Response res = reqspec.when().get("/{serviceType}/{plans}");
		  
		  // validating response
		  ValidatableResponse validateRes = res.then();
		  validateRes.assertThat().statusCode(200).log().all();
	   }
}
*/