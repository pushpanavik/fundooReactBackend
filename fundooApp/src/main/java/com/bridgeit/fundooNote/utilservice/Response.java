package com.bridgeit.fundooNote.utilservice;

import com.bridgeit.fundooNote.userservice.model.User;

public class Response {
private String message;
private int status;
private User user;

public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getMsg() {
	return message;
}
public void setMsg(String msg) {
	this.message = msg;
}
public Response(String message, int status) {
	
	this.message = message;
	this.status = status;
}
public Response() {}

public Response( String msg) {
	this.message=msg;
	
}
 

}
