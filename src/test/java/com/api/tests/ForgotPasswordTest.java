package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;


import io.restassured.response.Response;

public class ForgotPasswordTest {

	
	
	@Test(description ="verify if forgot-password API is working")
	public void forgotPasswordtest() {
		
	AuthService service= new AuthService();
	
	Response response = service.forgotPassword("deepakjena15@gmail.com");
	
	System.out.println(response.asPrettyString());
	}
	
}
