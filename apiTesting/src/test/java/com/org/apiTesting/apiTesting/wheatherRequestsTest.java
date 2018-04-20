package com.org.apiTesting.apiTesting;

import org.testng.annotations.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import static com.jayway.restassured.RestAssured.*;

public class wheatherRequestsTest extends Base {
	Logger log = Logger.getLogger("wheatherRequestsTest");

	// simple get request with param for getting wheather request
	@Test
	public void Test_01() {
		PropertyConfigurator.configure("log4j.properties");
		given().param("q", "London").param("appid", "b6907d289e10d714a6e88b30761fae22")
				.get("http://samples.openweathermap.org/data/2.5/weather").then().assertThat().statusCode(200);
		log.info("Status code succfully validatied for this test..");
		
		// link to check different status codes:
		// https://en.wikipedia.org/wiki/List_of_HTTP_status_codes
	}
}