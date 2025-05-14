package com.api.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class SignUpApiTest {
	@Test(description ="verify if user signUp API is working")
	public void signUptest() {
		
		 SignUpRequest signUpRequest= new SignUpRequest.Builder().userName("dj1511")
		.email("dj15@gmail.com")
		.password("deep1234")
		.firstName("deepak")
		.lastName("jjjjj")
		.mobileNumber("2344665667").build(); 

		 
	AuthService service = new AuthService();
	Response response = service.signUp(signUpRequest);
	assertEquals(200, response.getStatusCode());
	System.out.println(response.asPrettyString());
	}
}
