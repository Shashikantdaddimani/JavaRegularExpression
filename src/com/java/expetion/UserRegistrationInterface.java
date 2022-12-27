package com.java.expetion;

@FunctionalInterface
public interface UserRegistrationInterface {
	public abstract boolean userEntries(String value) throws myCustomException;
}
