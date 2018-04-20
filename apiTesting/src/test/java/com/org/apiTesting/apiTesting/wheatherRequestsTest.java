package com.org.apiTesting.apiTesting;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
//import com.jayway.restassured.response.ResponseBody;

import static com.jayway.restassured.RestAssured.*;

public class wheatherRequestsTest extends Base {
	// simple get request for getting wheather request
	@Test
	public void Test_01() {
		given().param("q", "London").param("appid", "b6907d289e10d714a6e88b30761fae22")
				.get("http://samples.openweathermap.org/data/2.5/weather").then().assertThat().statusCode(200);
		System.out.println("Status code succfully validatied for this test..");
	}
}