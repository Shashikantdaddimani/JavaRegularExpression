package com.java.expetion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * Regular expresion patterns
	 */
	private static final String firstNAME = "^[A-Z]{1}[a-z]{2,}$";
	private static final String lastNAME = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL = "^[a-z]+[.][a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2,3})*$";
	private static final String PHONE_NUMBER = "^(91)[ ]{1}[6-9]{1}[0-9]{9}$";
	private static final String PASSWORD = "((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%*]).{8,})";

	public UserRegistrationInterface firstNameValidate = new UserRegistrationInterface() {
		public boolean userEntries(String firstname) throws myCustomException {
			boolean result = Pattern.matches(firstNAME, firstname);
			if (result) {
				return result;
			} else {
				throw new myCustomException(myCustomException.ExceptionType.INVALID_FIRST_NAME, "Invalid Firsrt Name");
			}
		}
	};

	public UserRegistrationInterface lastNameValidate = new UserRegistrationInterface() {
		public boolean userEntries(String lastName) throws myCustomException {
			boolean result = Pattern.matches(lastNAME, lastName);
			if (result) {
				return result;
			} else {
				throw new myCustomException(myCustomException.ExceptionType.INVALID_LAST_NAME, "Invalid Last Name");
			}
		}
	};

	public UserRegistrationInterface emailValidate = new UserRegistrationInterface() {
		public boolean userEntries(String email) throws myCustomException {
			boolean result = Pattern.matches(EMAIL, email);
			if (result) {
				return result;
			} else {
				throw new myCustomException(myCustomException.ExceptionType.INVALID_EMAIL, "Invalid Email");
			}
		}
	};

	public UserRegistrationInterface phoneNumberValidate = new UserRegistrationInterface() {
		public boolean userEntries(String phonenumber) throws myCustomException {
			boolean result = Pattern.matches(PHONE_NUMBER, phonenumber);
			if (result) {
				return result;
			} else {
				throw new myCustomException(myCustomException.ExceptionType.INVALID_PHONE_NUMBER,
						"Invalid Phone Number");
			}
		}
	};

	public UserRegistrationInterface passwordValidate = new UserRegistrationInterface() {
		public boolean userEntries(String password) throws myCustomException {
			boolean result = Pattern.matches(PASSWORD, password);
			if (result) {
				return result;
			} else {
				throw new myCustomException(myCustomException.ExceptionType.INVALID_PASSWORD, "Invalid Password");
			}
		}
	};
}
