package com.bridgeit.fundooNote.exceptionservice;

public class EmailAlreadyExistException  extends Exception{
	
	
	private static final long serialVersionUID = 1L;
	public EmailAlreadyExistException (String message)
	{
		super(message);
		
	}
	
}