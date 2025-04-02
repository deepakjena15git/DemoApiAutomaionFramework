package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListeners.class)
public class LoginApiTest {

	@Test(description = "verify if user login API is working")
	public void testUserLogin() {

		/*
		 * Response resp = given().baseUri("http://64.227.160.186:8080")
		 * .header("Content-Type", "application/json")
		 * .body("{\"username\": \"deepakjena\", \"password\": \"ishu1234\"}").
		 * post("/api/auth/login"); System.out.println(resp.asPrettyString());
		 * System.out.println("Status code :: " +resp.getStatusCode());
		 */
		AuthService authServ = new AuthService();
		LoginRequest loginRequest = new LoginRequest("deepakjena", "ishu1234");
		Response resp = authServ.login(loginRequest);

		// System.out.println(resp.asPrettyString());
		// System.out.println("status code ::"+ resp.getStatusCode());

		LoginResponse lrsp = resp.as(LoginResponse.class);

		System.out.println(lrsp.getEmail());
		System.out.println(lrsp.getUsername());

	}
}
