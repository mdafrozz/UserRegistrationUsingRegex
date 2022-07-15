/**
 * 
 */
package com.bridgelabz.main;

import java.util.regex.Pattern;

import org.junit.Test;

/**
 * @author MD_AFROZ
 *
 */
public class UserRegistrationTest {
	// UC1 - First name starts with caps and has minimum 3 characters.
		@Test
		public void validateFirstNameTest() {
			String regex = "^[A-Z][a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			String fName = "Afroz";

			if (pattern.matcher(fName).matches()) {
				System.out.println("First name: " + fName + " is valid.");
			} else {
				System.out.println("First name: " + fName + " is invalid.");
			}

		}
		
		// UC2 - Last name starts with caps and has minimum 3 characters.
		@Test
		public void validateLastNameTest() {
			String regex = "^[A-Z][a-zA-Z]{2,}$";
			Pattern pattern = Pattern.compile(regex);
			String lName = "Mulla";

			if (pattern.matcher(lName).matches()) {
				System.out.println("Last name: " + lName + " is valid.");
			} else {
				System.out.println("Last name: " + lName + " is invalid.");
			}

		}
		// UC3 - validate email
		@Test
		public void validateEmailTest() {
			String regex = "^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";
			Pattern pattern = Pattern.compile(regex);
			String email = "mdafroz.gm@gmail.com";

			if (pattern.matcher(email).matches()) {
				System.out.println("Email: " + email + " is valid.");
			} else {
				System.out.println("Email: " + email + " is invalid.");
			}

		}
		// UC4 - Need to validate mobile number example: 91 9919819801.
		@Test
		public void validateMobileNumberTest() {
			String regex = "^(91[ ])?[6-9]\\d{9}$";
			Pattern pattern = Pattern.compile(regex);
			String mobile = "91 8553304009";

			if (pattern.matcher(mobile).matches()) {
				System.out.println("Mobile No: " + mobile + " is valid.");
			} else {
				System.out.println("Mobile No: " + mobile + " is invalid.");
			}

		}
}
