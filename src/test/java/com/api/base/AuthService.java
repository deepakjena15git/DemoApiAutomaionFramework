package com.api.base;

import java.util.HashMap;

import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseApiService {

	private static final String BASE_PATH = "/api/auth/";

	public Response login(LoginRequest body) {

		return postRequest(body, BASE_PATH + "login");

	}

	public Response signUp(SignUpRequest body) {

		return postRequest(body, BASE_PATH + "signup");

	}

	public Response forgotPassword(String emailAddress) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailAddress);

		return postRequest(payload, BASE_PATH + "forgot-password");

	}

}
