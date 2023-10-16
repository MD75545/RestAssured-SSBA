package day4;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class parsingJasonResponseData {
	@Test
	public void getuserdetails() {
		String ExpectedStatuscode="application/json";
		baseURI="https://uat-api.taxbuddy.com";
		Response response = given()
				.queryParam("userId",13462 )
				.queryParam("assessmentYear",2023-2024 )
				.queryParam("serviceType","ITR" )
				.auth().oauth2("eyJraWQiOiJHVHdqQ3RJXC9mOEg0R25YM1FWMU1VaE1hZWNFUFhSY1N5eFY1bWFUemJaST0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJmMGQ4MjdhOC0xNWM5LTRmMjctOGRlMy02ODZlMDM2Mzk1YmYiLCJldmVudF9pZCI6ImYxN2ZkY2RiLTZiOTctNGM4Ny04ODc5LTljODQxZjJjNTBjMSIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2OTcxODc4NzUsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfN0dIRVNoOXJiIiwiZXhwIjoxNjk3Mjc0Mjc2LCJpYXQiOjE2OTcxODc4NzYsImp0aSI6IjI2MDAxZDA4LTNmNzUtNDlkYS1iOGJmLTBmNTM2ZGYwN2UyYyIsImNsaWVudF9pZCI6InBkdHBlb2duOGEydmlpbW9uZDF1MGRlYmkiLCJ1c2VybmFtZSI6ImYwZDgyN2E4LTE1YzktNGYyNy04ZGUzLTY4NmUwMzYzOTViZiJ9.fAR3deu_SC_N8rvxiaYtIdaZtOmOpdTbBp_OcrppErvrpflFLl6WvCPWpUE2ZMiJ_nuwzPw2St7cEnsd4VkrCUSuZVDoMZ3dZ3B1PV9x77ZCb4OI3lm0L5k3-kInFS03dTrrxPyI-nQ4EzFN7tUA6VnaqH_w5ZBoYRgI45HcLSIvwuenAiytpohIGWIPZVLXyYZ9qUZyeMrEuXVesk2teQgXSjH8wXwVM8l7LtdK_53vEInr2y3d2ibPs4ggfhsl_vL3Dc5TbUPYcM6G4ZYnZAp9NgpceWYNnai8KFwuqG3e_X6LTcmHIlklNFyVdltOEpzLdnZen3_qnZWTgpntNQ")
				.when()
				.get("/user/agent-assignment-new");
		response.then().assertThat().statusCode(200).log().all();
		String actualStatuscode=response.getContentType();
		System.out.println(actualStatuscode);
		if (actualStatuscode.equals(ExpectedStatuscode)) {
			System.out.println("Test case is passed");
			boolean Actual=true;
		}
		else {
			System.out.println("Test case failed");
		}
	}
}