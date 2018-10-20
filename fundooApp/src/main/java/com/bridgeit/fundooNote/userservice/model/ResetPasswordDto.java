package com.bridgeit.fundooNote.userservice.model;

public class ResetPasswordDto {
	private String newPassword;
	
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	@Override
	public String toString() {
		return "ResetPasswordDto [newPassword=" + newPassword + "]";
	}
	
}
