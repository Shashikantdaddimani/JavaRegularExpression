package com.java.expetion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * Regular expresion patterns
	 */
	    static Pattern firstName = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	    static Pattern lastName = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
	    static Pattern email = Pattern.compile("^[a-z]+[.][a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2,3})*$");
	    static Pattern mobileNumber = Pattern.compile("^(91)[ ]{1}[6-9]{1}[0-9]{9}$");
	    static Pattern password = Pattern.compile("^((?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%*]).{8,})$");
	   
	    
	    public static boolean firstName() throws myCustomException {
	        Matcher firstNameTest = firstName.matcher("SHashikant");

	        if (firstNameTest.matches() == true)
	            return true;
	        else
	            throw new myCustomException(" first name is invalied");
	    }

	    public static boolean lastName() throws myCustomException {
	        Matcher lastNameTest = lastName.matcher("DAddimani");
	        if (lastNameTest.matches() == true)
	            return true;
	        else
	            throw new myCustomException(" last name is inValied");
	    }

	    public static boolean email() throws myCustomException {
	        
	        Matcher emailTest = email.matcher("100abc.xy@gamil.com");
	        if (emailTest.matches() == true)
	            return true;
	        else
	            throw new myCustomException(" emailId is Invalied");
	    }

	    public static boolean mobileNumber() throws myCustomException {
	        Matcher mobileNumberTest = mobileNumber.matcher("91 5698742315");
	        if (mobileNumberTest.matches() == true)
	            return true;
	        else
	            throw new myCustomException(" mobileNumber is inValied");
	    }

	    public static boolean password() throws myCustomException {
	        Matcher passwordTest = password.matcher("12abc@$");
	        if (passwordTest.matches() == true)
	            return true;
	        else
	            throw new myCustomException(" Password is Invalid");
	    }
	    

	    public static void main(String[] args) throws myCustomException {
	        try {
	            UserRegistration.firstName();
	        } catch (myCustomException firstName) {
	            System.out.println("Exception - " + firstName);
	        }
	        try {
	            UserRegistration.lastName();

	        } catch (myCustomException lastName) {
	            System.out.println("Exception - " + lastName);
	        }
	        try {
	            UserRegistration.email();
	        } catch (myCustomException emaild) {
	            System.out.println("Exception - " + emaild);
	        }
	        try {
	            UserRegistration.mobileNumber();
	        } catch (myCustomException mobileNumBer) {
	            System.out.println("Exception - " + mobileNumBer);
	        }
	        try {
	            UserRegistration.password();
	        } catch (myCustomException password) {
	            System.out.println("Exception - " + password);
	        }

	    }
	  
}
