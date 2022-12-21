package com.java.regex;

/**
 * imports all  the class of the java.util package
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {

	/*
	 * Logic for checking given regex is Valied or not
	 */
	private static boolean isValied(String regex, String input) {

		return Pattern.compile(regex).matcher(input).matches();
	}

	/*
	 * Program execution is start from main method
	 */
	public static void main(String[] args) {
		/*
		 * taking user input using scanner class
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Java Regular Expressions programs");
		/*
		 * regular expression for Validate the FirstName
		 */
		String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter the FirstName");
		String firstName = input.next();
		System.out.println(isValied(firstNamePattern, firstName));
		/*
		 * Regular Expression for validate the LastName
		 */
		String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter the LastName");
		String lastName = input.next();
		System.out.println(isValied(lastNamePattern, lastName));
		/*
		 * Regular Expression for validate the  EmailId
		 */
		String emailIdPattern = "^[a-z]+[.][a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2,3})*$";
		System.out.println("Enter the EmeilId");
		String emailId =input.next();
		System.out.println(isValied(emailIdPattern, emailId));
		/*
		 * Regular Expression for Validate the MobileNumber
		 */
	    String mobileNumberPattern = "^(91)[ ]{1}[6-9]{1}[0-9]{9}$";
	    System.out.println("91 9113274303");
		String mobileNumber = "91 9113274303";
		System.out.println(isValied(mobileNumberPattern,mobileNumber));
		/*
		 * Regular Expression for validate the Pre-Defined password  at minimum 8 charcters
		 */
		String passwordPattern1 = "^[a-zA-Z0-9]{8,}$";
		System.out.println("Enter Password: ");
		String password = input.next();
		System.out.println(isValied(passwordPattern1,password));
		/*
		 * Regular Expression for validate the Pre-Defined password  at atleast 1 Upper Case
		 */
		String passwordPattern2 = "((?=.*[A-Z]).{8,})*";
		System.out.println("Enter Password: ");
		String password2 = input.next();
		System.out.println(isValied(passwordPattern2,password2));
		/*
		 * Regular Expression for validate the Pre-Defined password  at Atleast 1 Numeric Number
		 */
		String passwordPattern3 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$";
		System.out.println("Enter Password: ");
		String password3 = input.next();
		System.out.println(isValied(passwordPattern3,password3));

	}

}
