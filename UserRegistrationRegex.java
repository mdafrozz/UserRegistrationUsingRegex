/**
 * 
 */
package com.bridgelabz.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author MD_AFROZ
 *
 */
public class UserRegistrationRegex {
	public static String fName(String fName) {

		String regex = "^[A-Z][a-zA-Z]{2,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fName);

		if (matcher.matches())
			return "Valid";
		else
			return "InValid";

	}

	public static String lName(String lName) {

		String regex = "^[A-Z][a-zA-Z]{2,}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lName);

		if (matcher.matches())
			return "Valid";

		return "InValid";
	}

	public static String email(String email) {

		String regex = "^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches())
			return "Valid";

		return "InValid";
	}

	public static String mobile(String mobile) {

		String regex = "^(91[ ])?[6-9]\\d{9}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobile);

		if (matcher.matches())
			return "Valid";

		return "InValid";
	}

	public static String password(String password) {

		String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]{1})(?=\\\\S+$).{8,20}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);

		if (matcher.matches())
			return "Valid";

		return "InValid";
	}
}
