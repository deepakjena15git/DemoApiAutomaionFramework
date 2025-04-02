package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;



public class GetUserProfileRequestTest {

	@Test(description ="verify if get user profile API is working")
	public void getUserProfileTest() {
		AuthService authService = new AuthService();
		Response response= authService.login(new LoginRequest("deepakjena", "ishu1234"));
		LoginResponse loginResponse= response.as(LoginResponse.class);
		//String token = loginResponse.getToken();
		//System.out.println(token);
		
		UserManagementService userManagementService = new UserManagementService();
		
		 response = userManagementService.getUserProfile(loginResponse.getToken());
		//System.out.println(userProfileResponse.asPrettyString());
		
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println("username: "+userProfileResponse.getUsername());
	
	
	}
	
}
