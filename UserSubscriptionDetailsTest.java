package taxbuddyApiTest;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class UserSubscriptionDetailsTest extends BaseClass
{
	@Test
	public void GetUserSubscriptiinDetailsTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("mobileNumber", "9900476901")
				.when()
				.get("/itr/subscription-dashboard-new/1064");
		ValidatableResponse validateRes = response.then().assertThat().statusCode(200).log().all();

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

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :GetUserSubscriptiinDetailsTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateRes.extract().asString());

	}

}
