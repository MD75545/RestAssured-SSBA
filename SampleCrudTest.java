package day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class SampleCrudTest {
	
	@Test
		public void getUsers() {
			baseURI="https://api.taxbuddy.com/";
			given()
			.queryParam("userId", 941953)
			.queryParam("assessmentYear", 2023-2024)
			.queryParam("serviceType", "ITR")
			.auth().oauth2("eyJraWQiOiJQcDloM0VtcjY5V09SdlByVWpuQXJZckxiaVVqXC9BUm5iM0pUdTIramRYVT0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiI3ZjMzZjkxOC01YzIyLTQwZDgtOGUxNy02NGYwNDc1NmU4ODIiLCJldmVudF9pZCI6IjgwOWQyMTJlLWU2NDAtNDVmNi04YjliLTRjOTJiZjhkMjM4YyIsInRva2VuX3VzZSI6ImFjY2VzcyIsInNjb3BlIjoiYXdzLmNvZ25pdG8uc2lnbmluLnVzZXIuYWRtaW4iLCJhdXRoX3RpbWUiOjE2OTcwOTExMDIsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5hcC1zb3V0aC0xLmFtYXpvbmF3cy5jb21cL2FwLXNvdXRoLTFfczQySGdZemFZIiwiZXhwIjoxNjk3MDk0NzAyLCJpYXQiOjE2OTcwOTExMDIsImp0aSI6IjlkODg4YTYyLTNmMzktNDIyYS1iYTYwLWMxZmQwYjYyMzZlMSIsImNsaWVudF9pZCI6IjI4OWYwZnJoNG9qOXJwNXJoNnE5b3BvNHFuIiwidXNlcm5hbWUiOiI3ZjMzZjkxOC01YzIyLTQwZDgtOGUxNy02NGYwNDc1NmU4ODIifQ.bxcnZCa1ALisB26PVuxxz2YlonzdvDi0w9Oo6e6vDVe6m-0h4zFdQ9Insk28KbPOK-euLGr21gCr2rCZfQOidXrHLKuNgj3g6dsEgc6SncJneVvTlWacLtpMjimyzgd4nmlD4pznN62Xu1zC0YA-TjCChSBWstuly3tiBxxn_fflm55rEoQ4NMiTU4iWDMsXM5LqJtOnBluRCoeyLYrb7TZts4Z55Xa-1UMUtRwtBYsFmy9usbd1SJAO53Ox5rAuAPaiyEVnCIjC37ZZ15XFVigK_Kll-xtuWaJtC6RmTMOmFl27HM-RmZiJjRnfql-aUHxRGUPeS0p_AtdJ3GeNfQ")
			.when()
			.post("/user/agent-assignment-new")
			
			.then().assertThat().statusCode(200).log().all();
        	
}
}
