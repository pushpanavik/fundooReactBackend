package com.bridgeit.fundooNote.utilservice;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgeit.fundooNote.userservice.model.User;

public class ValidateUser {
	
	private static final Pattern emailValidation = Pattern.compile("[a-z0-9+_.-]+@{1}[a-z](.+){1}[a-z]",Pattern.CASE_INSENSITIVE); 

	public static String validateUser(User user)
	{
		if(user.getFirstname()==null ||user.getFirstname().trim().length()<6){
			return "firstname is too short";
		}
			else if(user.getLastname()==null ||user.getLastname().trim().length()<3){
				return "lastname is too short";
			}
				
				else if(user.getEmail()==null || !(isEmailValid(user.getEmail()))){
					return "not a valid email address";
				}							
							else if(user.getPassword()==null || user.getPassword().length()<5){
								return "password is too weak";
							}else
							{
								return "success";
							}
						}
					

	private static boolean isEmailValid(String email) {
		
		Matcher matches=emailValidation.matcher(email);
		return matches.find();
	}
}