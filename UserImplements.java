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

}
