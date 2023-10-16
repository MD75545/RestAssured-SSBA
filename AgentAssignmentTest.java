package taxbuddyApiTest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManagerExtent;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;

public class AgentAssignmentTest extends BaseClass
{

	@Test
	public void AgentAssignapiITRTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "ITR")
				.when()
				.get("/user/sme/agent-assignment");
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

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :AgentAssignmentITRTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateresponse.extract().asString());

	}

	@Test
	public void AgentAssignapiGSTTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "GST")
				.when()
				.get("/user/sme/agent-assignment");

		ValidatableResponse validateResponse = response.then().assertThat().statusCode(200).log().all(); 

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

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name :AgentAssigmentGSTTest ");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateResponse.extract().asString());

	}

	@Test
	public void AgentAssignapiNoticeTest()
	{
		baseURI="https://api.taxbuddy.com";
		Response response = given()
				.queryParam("userId", 619930)
				.queryParam("assessmentYear", 2022-2023)
				.queryParam("serviceType", "NOTICE")
				.when()
				.get("/user/sme/agent-assignment");
		ValidatableResponse validateResponse = response.then().assertThat().statusCode(200).log().all();

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

		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Test Case Name : AgentAssignmentNoticeTest");
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response time is in Ms : " + response.getTime());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Status code is : " + response.getStatusCode());
		ExtentTestManagerExtent.getTest().log(LogStatus.INFO, "Response is : " + validateResponse.extract().asString());


	}

}
