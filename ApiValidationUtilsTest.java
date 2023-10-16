package taxbuddyApiTest;

import io.restassured.response.Response;
import org.hamcrest.Matchers;

import com.relevantcodes.extentreports.LogStatus;

import generic_Utility.ExtentTestManagerExtent;
public class ApiValidationUtilsTest
{

	public static void validateResponseTime(Response response, long minTimeMs, long maxTimeMs) 
	{
		long responseTimeMs = response.getTime();
		System.out.println("Response time is in ms: " + responseTimeMs);

		try {
			Matchers.both(Matchers.greaterThanOrEqualTo(minTimeMs)).and(Matchers.lessThanOrEqualTo(maxTimeMs));
			ExtentTestManagerExtent.getTest().log(LogStatus.PASS, "API response time is within the expected range and which comes under Non-critical and Intermediate");
		} catch (AssertionError e) 
		{
			ExtentTestManagerExtent.getTest().log(LogStatus.FAIL, "Api response time is above as expected its comes under critical");
			throw e;
		}
	}

	/*public static void validateResponseTimeForIntermediate(Response response, long minTimeMs, long maxTimeMs)
	{

		try {
			Matchers.both(Matchers.greaterThanOrEqualTo(minTimeMs)).and(Matchers.lessThanOrEqualTo(maxTimeMs));
			System.out.println("Based on response time, the API comes under Intermediate.");
		} catch (AssertionError e) {
			System.out.println("Api response time is above as expected its comes under critical");
			throw e;
		}
	}


	public static void validateResponseTime(Response response, long minResponseTime, long maxResponseTime) 
		{
			try {
				response.then().time(Matchers.both(Matchers.greaterThanOrEqualTo(minResponseTime)).and(Matchers.lessThanOrEqualTo(maxResponseTime)));
				System.out.println("Based on response time Api comes under Non- critical and Intermediate ");

			} catch (AssertionError e) {
				// TODO: handle exception
				System.out.println("Based on response time Api comes under Critical ");
			}
		}	
	 */
}