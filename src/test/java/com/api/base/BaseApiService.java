package com.api.base;

import com.api.filters.LoggingFilters;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseApiService { // basically it is the wrraper for rest assured

	// this class will be having the base uri

	// it is also responsible for creating request specification

	// handling the response

	private static final String BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification reqSpec;
	
	static{
		RestAssured.filters(new LoggingFilters());
	}

	public BaseApiService() {

		reqSpec = RestAssured.given().baseUri(BASE_URL);

	}

	protected void setAuthToken(String token) {
		reqSpec.header("Authorization", "Bearer " + token);
	}

	protected Response postRequest(Object payload, String endpoint) {
		return reqSpec.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

	protected Response signUp(Object payload, String endpoint) {
		return reqSpec.contentType(ContentType.JSON).body(payload).post(endpoint);
	}

	protected Response getRequest(String endpoint) {

		return reqSpec.get(endpoint);
	}

	protected Response updateRequest(Object payload, String endpoint) {
		return reqSpec.contentType(ContentType.JSON).body(payload).put(endpoint);
	}

}
