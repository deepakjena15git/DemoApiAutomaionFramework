package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileUpdateRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class ProfileUpdateTest {

	@Test(description = "verify that user profile update api is working")
	public void profileUpdateApiTest() {
		ProfileUpdateRequest profileUpdateRequest = new ProfileUpdateRequest.Builder().setEmail("deepakjena15@gmail.com").setFirstName("Ishu")
														.setLastName("jj").setMobileNumber("9922334455").build();
		
		AuthService authService = new AuthService();
		
		Response response =authService.login(new LoginRequest("deepakjena", "ishu1234"));
		
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		UserManagementService managementService =  new UserManagementService();
		
		 response = managementService.updateUserProfile(loginResponse.getToken(), profileUpdateRequest);
		 
		 System.out.println(response.asPrettyString());
		
		
	}
}
