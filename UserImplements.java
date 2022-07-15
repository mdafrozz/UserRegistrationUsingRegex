/**
 * 
 */
package com.bridgelabz.main;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author MD_AFROZ
 *
 */
public class UserImplements implements IUser {
	
	Scanner fNameInput = new Scanner(System.in);
	Scanner lNameInput = new Scanner(System.in);
	Scanner emailInput = new Scanner(System.in);
	Scanner mobileInput = new Scanner(System.in);


	// UC1 - First name starts with caps and has minimum 3 characters.
	public void validateFirstName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String fName = input.nextLine();

		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(fName).matches()) {
			System.out.println("First name: " + fName + " is valid.");
		} else {
			System.out.println("First name: " + fName + " is invalid.");
		}

		input.close();

	}
	// UC2 - Last name starts with caps and has minimum 3 characters.
		public void validateLastName() {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Enter last name: ");
			String lName = input.nextLine();

			String regex = "^[A-Z][a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(regex);

			if (pattern.matcher(lName).matches()) {
				System.out.println("Last name: " + lName + " is valid.");
			} else {
				System.out.println("Last name: " + lName + " is invalid.");
			}

		}	
		
		// UC3 - Need to validate email.
		public void validateEmail() {
			System.out.println("Enter email: ");
			String email = emailInput.nextLine();

			String regex = "^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
			Pattern pattern = Pattern.compile(regex);
			if (pattern.matcher(email).matches()) {
				System.out.println("Email: " + email + " is valid.");
			} else {
				System.out.println("Email: " + email + " is invalid.");
			}

		}
		
		// UC4 - Need to validate mobile number example: 91 9919819801.
		public void validateMobileNumber() {
			System.out.println("Enter mobile no: ");
			String mobile = mobileInput.nextLine();

			String regex = "^(91[ ])?[6-9]\\d{9}$";
			Pattern pattern = Pattern.compile(regex);
			if (pattern.matcher(mobile).matches()) {
				System.out.println("Mobile No: " + mobile + " is valid.");
			} else {
				System.out.println("Mobile No: " + mobile + " is invalid.");
			}

		}
}
