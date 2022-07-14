package com.example.entities;


public class ErrorClazz {
private String message;
private int code;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public ErrorClazz(String message, int code) {
	super();
	this.message = message;
	this.code = code;
}

}


