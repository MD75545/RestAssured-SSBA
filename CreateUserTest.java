/*package crudOperationRest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest 
{
	 @Test
	  public void createuserTest()
	  {  
		  //creating resource inside the server
		  JSONObject js= new JSONObject();
		  js.put("id", 4);
		  js.put("username", "use1test");
		  js.put("firstName", "guru");
		  js.put("lastName", "prasad");
		  js.put("email", "gurupr@123.com");
		  js.put("password", "guru@123");
		  js.put("phone", "9900476901");
		  js.put("userStatus",4);
		  
		 RequestSpecification reqsp = RestAssured.given();
		 reqsp.body(js);
		 reqsp.contentType(ContentType.JSON);
		 
		 //sending Req
		Response resp = reqsp.post("https://petstore.swagger.io/v2/user");
		
		//validate
		ValidatableResponse validateResp = resp.then();
	    validateResp.assertThat().contentType(ContentType.JSON);
		validateResp.assertThat().statusCode(200).log().all();
		
	  }
}
*/