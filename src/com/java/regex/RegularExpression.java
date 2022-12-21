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
		/*
		 * Regular Expression for validate the LastName
		 */
		String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter the LastName");
		String lastName = input.next();
		/*
		 * Regular Expression for validate the  EmailId
		 */
		String emailIdPattern = "^[a-z]+[.][a-zA-Z]+[@][a-zA-Z]+[.][a-z]{2,3}([.][a-zA-Z]{2,3})*$";
		System.out.println("Enter the EmeilId");
		String emailId =input.next();

		System.out.println(isValied(firstNamePattern, firstName));

	}

}
