/*package crudOperationRest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateUserDetailsTest 
{
	@Test
	  public void updateuserTest()
	  {
		  //update the the resource 
		  JSONObject js= new JSONObject();
		  js.put("id", 1);
		  js.put("username", "gurupr");
		  js.put("firstName", "ssba");
		  js.put("lastName", "innnovations");
		  js.put("email", "guruprasad.n@123.com");
		  js.put("password", "guru@123");
		  js.put("phone", "9900476901");
		  js.put("userStatus",5);
		  
		 RequestSpecification reqsp = RestAssured.given();
		 reqsp.body(js);
		 reqsp.contentType(ContentType.JSON);
		 
		 //send Req
		Response resp = reqsp.when().put("https://petstore.swagger.io/v2/user/sampletest");
		
		//validate response
		ValidatableResponse validateResp = resp.then();
	    validateResp.assertThat().contentType(ContentType.JSON);
		validateResp.assertThat().statusCode(200).log().all();
	  }
	  
}
*/