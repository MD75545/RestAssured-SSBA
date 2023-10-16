package practiceTaxbbuddyApiTest;
/*package taxbuddyApiTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class UpdateGSTProfileDetailsTest 
{
	@Test
	public void userGSTprofileUpdateTest()
	{
		String payload="{"
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
		given()
		.auth().oauth2("eyJraWQiOiJHVHdqQ3RJXC9mOEg0R25YM1FWMU1VaE1hZWNFUFhSY1N5eFY1bWFUemJaST0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJlYWUwMTM5OS00Y2RjLTRhZTgtYmYxZC0yZTIzMmM1ODM0OGIiLCJldmVudF9pZCI6ImU5NzhmYTQxLTYwYTMtNDcyNy05MzhkLTgzNTQzMjk3MTY5OSIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2NzcyMjk5NjYsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfN0dIRVNoOXJiIiwiZXhwIjoxNjc3MzE2MzY4LCJpYXQiOjE2NzcyMjk5NjgsImp0aSI6IjA2MDkwYTAxLWM3YzEtNDhmZC1iZmY5LTgxNTgzODg4MjllOCIsImNsaWVudF9pZCI6InBkdHBlb2duOGEydmlpbW9uZDF1MGRlYmkiLCJ1c2VybmFtZSI6ImVhZTAxMzk5LTRjZGMtNGFlOC1iZjFkLTJlMjMyYzU4MzQ4YiJ9.OLVmOr8zk10BLGCoH8TxX7fJVALl_m-cpUmKr1m_R4X9CumL0ja9WzozPHpExa7T25ZZFvG3YtYIS375fGpjtGI4DlIO-iNG4ph4h9XDvT-SCHlTSG0YXF8z4X2tlOYvXPMsV9nF0wW0YUYoRAKEG_y4Dg3jud692tQPpyKiid4wfA8qyrFTP-qQSolRSWwsdgOG_IoAvFHMv-0HA_UMqq_a2TckHBq219LhieYTkQjqSlbb_2GRrsHpVxA3rB-YKqkyXEXUw6xn2dmixx8QdB_r6z5L_XvGmt1Y0DYSaELZYjaxfLasqAh-bu7DeH653liGHcTyB9Kzjg6rVh9qWw")
		.header("content-type","application/json").body(payload)
		.when()
		.put("/user/profile/8526")
		.then()
		.assertThat().statusCode(200).log().all();

	}
}
*/