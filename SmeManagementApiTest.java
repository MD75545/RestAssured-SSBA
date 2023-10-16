package taxbuddyApiTest;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class SmeManagementApiTest extends BaseClass
{
	@Test
	public void SmeManagementAssignedSmeTest() 
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("page", 0)
				.queryParam("pageSize", 30)
				.queryParam("assigned", true)
				.when()
				.get("/user/sme-details-new/1064");

		ValidatableResponse validateresponse = response.then().assertThat().statusCode(200).log().all();

		// Validate response time
		ApiValidationUtilsTest.validateResponseTime(response, 1000L, 7000L);

		if (response.jsonPath().getBoolean("success")==true) 
		{
			System.out.println("Testcase is pass");
		}
		else
		{
			System.out.println("Testcase is failed");
		}    

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :SmeManagementAssignedSmeTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateresponse.extract().asString());

	}
}
