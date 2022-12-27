package com.java.expetion;

public class myCustomException extends Exception {
	enum ExceptionType {
		INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_PASSWORD, INVALID_PHONE_NUMBER, INVALID_EMAIL;
	}

	ExceptionType type;

	public myCustomException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
