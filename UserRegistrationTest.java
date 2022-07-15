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
			String lName = "Ashok";

			if (pattern.matcher(lName).matches()) {
				System.out.println("Last name: " + lName + " is valid.");
			} else {
				System.out.println("Last name: " + lName + " is invalid.");
			}

		}
}
