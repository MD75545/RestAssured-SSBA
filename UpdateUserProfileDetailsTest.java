/*package taxbuddyApiTest;

import generic_Utility.BaseClass;
import generic_Utility.ExtentTestManager;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
public class UpdateUserProfileDetailsTest 

{
	@Test
	public void userProfileUpadteTest()
	{
		String payload="{\"userId\":8526,\r\n"
				+"\"fName\":\"Guruprasad\","
				+ "\"mName\":\"ssba\","	
				+ "\"lName\":\"Test\","
				+ "\"fatherName\":\"innovations\","
				+ "\"gender\":\"Male\","
				+ "\"dateOfBirth\":null,\r\n"
				+ "\"maritalStatus\":\"single\","
				+ "\"emailAddress\":\"guruprasad.n@ssbainnovations.com\","
				+ "\"aadharNumber\":null,\r\n"
				+ "\"panNumber\":null,\r\n"
				+ "\"mobileNumber\":\"9900476901\","
				+ "\"residentialStatus\":\"Non Resident\","
				+ "\"whatsAppNumber\":\"919900476901\","
				+ "\"countryCode\":\"+91\","
				+ "\"language\":\"English\","
				+ "\"gstDetails\": {\r\n"
				+ "\"gstPortalUserName\": \"Gurupr\","
				+ "\"gstPortalPassword\": \"Guru@123456\","
				+ "\"gstinNumber\": \"Rcb123366915\","
				+ "\"tradeName\": \"Rcb Bengaluru\","
				+ "\"legalName\": \"vk17\","
				+ "\"gstinRegisteredMobileNumber\": \"9900476901\","
				+ "\"salesInvoicePrefix\": \"taxbuddy\","
				+ "\"gstr1Type\": \"Monthly\","
				+ "\"gstType\": \"Regular\""
				+ " }"
				+ "}";
		baseURI="https://uat-api.taxbuddy.com";
		ValidatableResponse response = given()
				.auth().oauth2("eyJraWQiOiJHVHdqQ3RJXC9mOEg0R25YM1FWMU1VaE1hZWNFUFhSY1N5eFY1bWFUemJaST0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiI5MWU2ZTUwYS0zMjMxLTQ0MGMtOTgzNy0xNTQ3ZWQxOWE5OWEiLCJldmVudF9pZCI6IjUxODFiZTk0LTA5YTQtNGJhNy1hZGI1LTc1ZGZkOGQxMzY0YyIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2Nzc1NzYxMTUsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfN0dIRVNoOXJiIiwiZXhwIjoxNjc3NjYyNTE3LCJpYXQiOjE2Nzc1NzYxMTcsImp0aSI6IjgzNWQ4YmYwLTk0MjItNDdiOC1iYzQwLThkOTE1YTYzZjAzNSIsImNsaWVudF9pZCI6InBkdHBlb2duOGEydmlpbW9uZDF1MGRlYmkiLCJ1c2VybmFtZSI6IjkxZTZlNTBhLTMyMzEtNDQwYy05ODM3LTE1NDdlZDE5YTk5YSJ9.eXzcZYn5wKl8YvHAtylwRvslQ3A85MFrtGZHrtXShx_paeJtsb9b_3Fvti0D3LrAZeHIcb4oaul4EOkszTtIKXE5O84n7ZJcu3W51_0xtNgDdjssy_UDR8mztV0GbPANsxpZl1nJbFEZrNjqArzetT07Recl5OZdbzewGCIZvCYIytOck6UySbjusobXzrDkteVUavIeI0uHePihEKdHXA7oXwYIegdwqESMOYbnO3ddPfPapFWrBCdmvd_J84F-Bl8E-ZoiufyNesagH89ffst8OyvFRaTkQiwQ5PQUrvsgEiOM8e-wb4cS1G6yR0hyB0PC_ilwrGqqmTgzCHAHCQ")
				.header("content-type","application/json").body(payload)
				.when()
				.put("/user/profile/8526")
				.then()
				.assertThat().statusCode(200).log().all();

		//ExtentTestManager.getTest().log(LogStatus.INFO, "Test Case Name : UpdateUserProfileDetailsTest");
		//ExtentTestManager.getTest().log(LogStatus.INFO, "Response is : " + response.extract().asString());




	}
}
*/