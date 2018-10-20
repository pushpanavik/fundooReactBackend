package com.bridgeit.fundooNote.userservice.model;

public class UserDto {

	private int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private String firstname;
	private String lastname;
	private String email;
	private String image;
	private String token;
	
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
	public UserDto() {	
	}
	public UserDto(User obj ) {
		this.setEmail(obj.getEmail());
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDto [User Id=" +userId +", firstname=" + firstname + ", lastname=" + lastname + ", emailId=" + email + "], image=" +image + "]";
	}
	
	
}
