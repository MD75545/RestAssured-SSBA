/*package crudOperationRest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class DeleteUserTest 
{
	@Test
	public void deleteUserDetailsTest()
	{
		//delete user request
		RequestSpecification reqsp = RestAssured.given();
		Response resp = reqsp.when().delete("https://petstore.swagger.io/v2/user/sampletest");

		//validate response
		ValidatableResponse validateResp = resp.then();
		validateResp.assertThat().statusCode(204).log().all();

	}
}
*/