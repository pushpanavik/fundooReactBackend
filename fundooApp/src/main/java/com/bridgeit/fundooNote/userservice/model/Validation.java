package com.bridgeit.fundooNote.userservice.model;
import java.util.regex.Pattern;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Validation extends HandlerInterceptorAdapter{
	
	private static String emailValidation = "[a-z0-9+_.-]+@{1}[a-z](.+){1}[a-z]";
	
	
		public static String userValidation(String emailId) {
			
			if(!Pattern.matches(emailValidation, emailId)) {
			String	msg="enter email correct";
			System.out.println("Invalid user email");
				
			}
			return emailId;
		}	
				
		}
