/*package taxbuddyApiTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class BOGetSmeDetailsApiTest 
{
	@Test
	public void GetAllSmeDetailsApiTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("owner", true)
				.when()
				.get("/user/sme-details-new/1064");
		ValidatableResponse validateresponse = response.then().assertThat().statusCode(200).log().all();

		if (response.jsonPath().getBoolean("success")==true) 
		{
			System.out.println("Testcase is pass");
		}
		else
		{
			System.out.println("Testcase is failed");
		}
	}
}
*/