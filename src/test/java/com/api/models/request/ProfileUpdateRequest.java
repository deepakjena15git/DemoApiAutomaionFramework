package com.api.models.request;

public class ProfileUpdateRequest {
	
	private String firstName;
	private String lastName;
	private String  email;
	private String mobileNumber;
	
	public ProfileUpdateRequest(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "ProfileUpdateRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	public static class Builder{
		
		private String firstName;
		private String lastName;
		private String  email;
		private String mobileNumber;
		
		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}		
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}		
		public Builder setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}
		
		public ProfileUpdateRequest build() {
			
			ProfileUpdateRequest profileUpdateRequest = new ProfileUpdateRequest(firstName, lastName, email, mobileNumber);
			return profileUpdateRequest;
		}
		
	}
	

}
