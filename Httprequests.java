package Day3;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Httprequests {
	@Test
	public void getUserDetails() {
		String payload="{\r\n"
				+ "  \"firstName\": \"snape\",\r\n"
				+ "  \"lastName\": \"sevrus\",\r\n"
				+ "  \"email\": \"mohammed.obaray@taxbuddy.com\",\r\n"
				+ "  \"mobile\": \"9423382106\",\r\n"
				+ "  \"langKey\": \"en\",\r\n"
				+ "  \"authorities\": [\r\n"
				+ "    \"ROLE_USER\"\r\n"
				+ "  ],\r\n"
				+ "  \"cognitoId\": \"5149d794-7fd6-4eb8-b10f-e017eac22bd3\",\r\n"
				+ "  \"source\": \"WEB\",\r\n"
				+ "  \"initialData\": \"\",\r\n"
				+ "  \"serviceType\": \"ITR\",\r\n"
				+ "  \"countryCode\": \"+91\",\r\n"
				+ "  \"language\": \"English\"\r\n"
				+ "}";
		
		baseURI="https://uat-api.taxbuddy.com";
		given()
		.header("Content-Type","application/json")
		.body(payload)
		.auth().oauth2("eyJraWQiOiJHVHdqQ3RJXC9mOEg0R25YM1FWMU1VaE1hZWNFUFhSY1N5eFY1bWFUemJaST0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiI1MTQ5ZDc5NC03ZmQ2LTRlYjgtYjEwZi1lMDE3ZWFjMjJiZDMiLCJldmVudF9pZCI6IjM1ZTU3MzRiLWY5MTAtNGQ0Yy05YzcyLTFmYmNjNDZmOGMxZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2OTcxMDIxMjQsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfN0dIRVNoOXJiIiwiZXhwIjoxNjk3MTg4NTI0LCJpYXQiOjE2OTcxMDIxMjQsImp0aSI6Ijc5MmNjZWUzLTNlMTEtNDc2OS1hNTI0LWU0YTA5MDcxODZhOSIsImNsaWVudF9pZCI6InBkdHBlb2duOGEydmlpbW9uZDF1MGRlYmkiLCJ1c2VybmFtZSI6IjUxNDlkNzk0LTdmZDYtNGViOC1iMTBmLWUwMTdlYWMyMmJkMyJ9.aWznkICy7v3ssbAbtj-blsx_CmniILXWZxFrDg34PW6BHXATQLkn9bo2ZRKaIdiebNPjrT-rMAuicLVS3Hdclgp9HTyVf0krAcf7exwQvrNYkiWVsKlNPxkkSyvqitPJGf6jyOk19eom1buV7wt4CB4-WpmXdOe2kxmkesaydwTs_uYq-ftiIDaWka_hLkw-MuvCE-9Y4zUbhMocOqclsmg6tuoo0nJ8N_Q4eA3PkJ4coDnncSl_0lEvTpV-UofxJV9qYGR1kgvRxkoTHqr_LrVCzoKLe1mThQAQssjBrwWWM3d-eR0K0dXujFngYPlc8vHB5E8hceMWCsJZPsl9yg")
		 .when()
		.post("/user/user_account")
		.then().assertThat().statusCode(201).log().all();
	}
	
	@Test
	public void LoginTestApp() {
		String payload="{\r\n"
				+ "  \"userId\": 13470,\r\n"
				+ "  \"tbPlatform\": \"website\",\r\n"
				+ "  \"uniqueId\": \"GA1.1.87452782.1696831659\"\r\n"
				+ "}";
		
		baseURI="https://uat-api.taxbuddy.com";
		given()
		.header("Content-Type","application/json")
		.body(payload)
		.auth().oauth2("eyJraWQiOiJHVHdqQ3RJXC9mOEg0R25YM1FWMU1VaE1hZWNFUFhSY1N5eFY1bWFUemJaST0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiI1MTQ5ZDc5NC03ZmQ2LTRlYjgtYjEwZi1lMDE3ZWFjMjJiZDMiLCJldmVudF9pZCI6IjM1ZTU3MzRiLWY5MTAtNGQ0Yy05YzcyLTFmYmNjNDZmOGMxZiIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2OTcxMDIxMjQsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfN0dIRVNoOXJiIiwiZXhwIjoxNjk3MTg4NTI0LCJpYXQiOjE2OTcxMDIxMjQsImp0aSI6Ijc5MmNjZWUzLTNlMTEtNDc2OS1hNTI0LWU0YTA5MDcxODZhOSIsImNsaWVudF9pZCI6InBkdHBlb2duOGEydmlpbW9uZDF1MGRlYmkiLCJ1c2VybmFtZSI6IjUxNDlkNzk0LTdmZDYtNGViOC1iMTBmLWUwMTdlYWMyMmJkMyJ9.aWznkICy7v3ssbAbtj-blsx_CmniILXWZxFrDg34PW6BHXATQLkn9bo2ZRKaIdiebNPjrT-rMAuicLVS3Hdclgp9HTyVf0krAcf7exwQvrNYkiWVsKlNPxkkSyvqitPJGf6jyOk19eom1buV7wt4CB4-WpmXdOe2kxmkesaydwTs_uYq-ftiIDaWka_hLkw-MuvCE-9Y4zUbhMocOqclsmg6tuoo0nJ8N_Q4eA3PkJ4coDnncSl_0lEvTpV-UofxJV9qYGR1kgvRxkoTHqr_LrVCzoKLe1mThQAQssjBrwWWM3d-eR0K0dXujFngYPlc8vHB5E8hceMWCsJZPsl9yg")
		.when()
		.post("/user/user-login-details")
		.then().assertThat().statusCode(200).log().all();
	}
	
    @Test
	public void UpdateUser() {
		String payload="{\r\n"
				+ "  \"createdDate\": \"2023-10-05T07:11:09.527Z\",\r\n"
				+ "  \"id\": \"651e618d6272750ef4c97501\",\r\n"
				+ "  \"userId\": 13273,\r\n"
				+ "  \"fName\": \"Mohammed\",\r\n"
				+ "  \"mName\": \"RRIiyaz\",\r\n"
				+ "  \"lName\": \"Obare\",\r\n"
				+ "  \"fatherName\": null,\r\n"
				+ "  \"gender\": null,\r\n"
				+ "  \"dateOfBirth\": null,\r\n"
				+ "  \"maritalStatus\": null,\r\n"
				+ "  \"emailAddress\": \"mohammed.obaray@taxbuddy.com\",\r\n"
				+ "  \"aadharNumber\": null,\r\n"
				+ "  \"panNumber\": null,\r\n"
				+ "  \"imageURL\": null,\r\n"
				+ "  \"mobileNumber\": \"7304373810\",\r\n"
				+ "  \"residentialStatus\": null,\r\n"
				+ "  \"zohoDeskId\": null,\r\n"
				+ "  \"address\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": null,\r\n"
				+ "      \"addressType\": null,\r\n"
				+ "      \"flatNo\": null,\r\n"
				+ "      \"premisesName\": \"panvel Navi Mumbai \",\r\n"
				+ "      \"road\": \"\",\r\n"
				+ "      \"area\": \"410206\",\r\n"
				+ "      \"city\": \"Raigarh(mh)\",\r\n"
				+ "      \"state\": \"19\",\r\n"
				+ "      \"country\": null,\r\n"
				+ "      \"pinCode\": \"410206\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"whatsAppNumber\": \"917304373810\",\r\n"
				+ "  \"optinDate\": null,\r\n"
				+ "  \"optoutDate\": null,\r\n"
				+ "  \"isUserOpted\": true,\r\n"
				+ "  \"isWhatsAppMsgAllowed\": \"true\",\r\n"
				+ "  \"bankDetails\": [],\r\n"
				+ "  \"gstDetails\": null,\r\n"
				+ "  \"messageSentCount\": 0,\r\n"
				+ "  \"countryCode\": \"+91\",\r\n"
				+ "  \"theFlyLink\": null,\r\n"
				+ "  \"language\": \"English\",\r\n"
				+ "  \"eriClientValidUpto\": null,\r\n"
				+ "  \"eriClientotpSourceFlag\": null,\r\n"
				+ "  \"reviewGiven\": false,\r\n"
				+ "  \"userNRI\": false,\r\n"
				+ "  \"assesseeType\": \"\"\r\n"
				+ "}";
		baseURI="https://uat-api.taxbuddy.com";
		given()
		.header("Content-Type","application/json")
		.body(payload)
		.auth().oauth2("eyJraWQiOiJHVHdqQ3RJXC9mOEg0R25YM1FWMU1VaE1hZWNFUFhSY1N5eFY1bWFUemJaST0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiI2YmMzOTRkYi02M2VlLTQyODQtYmEzMC04NmE3MTZkMDBkZWYiLCJldmVudF9pZCI6ImJmOGI3MDU2LWVlMTctNGQzYy1iNTY1LWM4NzQxZDQ4NDQ2MCIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2OTcxMDU1NzIsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfN0dIRVNoOXJiIiwiZXhwIjoxNjk3MTkxOTczLCJpYXQiOjE2OTcxMDU1NzMsImp0aSI6Ijg4YWU2M2Y1LWJkM2YtNDdmMC1hNjJhLWYzNjM2NjNjY2U0MyIsImNsaWVudF9pZCI6InBkdHBlb2duOGEydmlpbW9uZDF1MGRlYmkiLCJ1c2VybmFtZSI6IjZiYzM5NGRiLTYzZWUtNDI4NC1iYTMwLTg2YTcxNmQwMGRlZiJ9.Q4LKs7MNrN3IVer4wnWUsIQEDyRGTZ1Nx8gpwofKE-duRPzZGWSeY34hOTyWn3f9pG4059eka0gbl-aeNph8ZmycZb5ne7NqTLrw7N8zr2Xe2lS0YDNQhl242vNHup2NB588sEGDXULN4_X1WFTv4vOVIe2rzsNowcBasZ6UeKx1mgeQXzeqTcV-jo3b9NPijZsM-RTGFu94MA0KiW56ERuxcW1IXVecwMYJetF6lR0x6CkEivCjH6Kp39fb20YDmT2LnZd75Lce4tb7J3pX-GORn2edzWXxq86ZPLqQ2JcNNY9rNxyOpkod5oTFVdH0_UJo-GSbbLsjdTWMIiM9hw")
		.when()
		.put("/user/profile/13273")
		.then().assertThat().statusCode(200).log().all();
	}
}
