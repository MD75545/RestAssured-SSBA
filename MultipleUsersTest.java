package newDevAssignementApi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_Utility.ExcelUtility;

import static io.restassured.RestAssured.*;
public class MultipleUsersTest 
{
	ExcelUtility elib= new ExcelUtility();
	
  @Test(dataProvider = "taxbuddyusersTest")
  public void verifyMultilpleusersTest(String userid)
  {
	  baseURI="https://dev-api.taxbuddy.com";
	   given()
	   .queryParam("userId", userid)
	   .queryParam("assessmentYear", 2022-2023)
		.queryParam("serviceType", "ITR")
		.when()
		.get("/user/agent-assignment-new")
		.then()
		.assertThat().statusCode(200).log().all();
		
  }
  
  @DataProvider
  public Object[][] taxbuddyusersTest() throws Throwable
  {
	   Object[][] obj = new Object[2][1]; 
	   obj[0][0]=elib.GetExcelData("Sheet1", 1, 0);
	   obj[1][0]=elib.GetExcelData("Sheet1", 2, 0);
	  
	   return obj;
  }
  
}
