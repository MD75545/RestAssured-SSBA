/*package crudOperationRest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetUserByNameTest {


	@Test
	public void getuserTest()
	{
		//get resource
		RequestSpecification req = RestAssured.given();
		Response response = req.when().get("https://petstore.swagger.io/v2/user/use1test");

		//validate response
		ValidatableResponse validateres = response.then();
		validateres.assertThat().contentType(ContentType.JSON);
		validateres.assertThat().statusCode(200).log().all();
	}
}
*/