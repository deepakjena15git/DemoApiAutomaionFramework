package com.api.base;

import com.api.models.request.ProfileUpdateRequest;

import io.restassured.response.Response;

public class UserManagementService extends BaseApiService {

	public static final String BASE_PATH = "/api/users";

	public Response getUserProfile(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH + "/profile");
	}

	public Response updateUserProfile(String token, ProfileUpdateRequest profileUpdateRequest) {
		setAuthToken(token);
		return updateRequest(profileUpdateRequest, BASE_PATH + "/profile");
	}
}
