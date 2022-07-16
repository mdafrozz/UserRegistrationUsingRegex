/**
 * 
 */
package com.bridgelabz.main;

/**
 * @author MD_AFROZ
 *
 */
public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("*********Welcome to user registration with regex***********");
		
		UserImplements user = new UserImplements();
		user.validateFirstName();
		System.out.println("<--------------------------------------->");
		user.validateLastName();
		System.out.println("<--------------------------------------->");
		user.validateEmail();
		System.out.println("<--------------------------------------->");
		user.validateMobileNumber();
		System.out.println("<--------------------------------------->");
		user.validatePassword();
		System.out.println("<--------------------------------------->");
		System.out.println("**********All valid emails*********");
		System.out.println(user.clearAllEmailSamples("abc@yahoo.com"));
		System.out.println(user.clearAllEmailSamples("abc-100@yahoo.com"));
		System.out.println(user.clearAllEmailSamples("abc.100@yahoo.com"));
		System.out.println(user.clearAllEmailSamples("abc111@abc.com"));
		System.out.println(user.clearAllEmailSamples("abc-100@abc.net"));
		System.out.println(user.clearAllEmailSamples("abc.100@abc.com.au"));
		System.out.println(user.clearAllEmailSamples("abc@1.com"));
		System.out.println(user.clearAllEmailSamples("abc+100@yahoo.com"));
		
		System.out.println("**********All invalid emails*********");
		System.out.println(user.clearAllEmailSamples("abc@.com"));
		System.out.println(user.clearAllEmailSamples("abc123@.com.co"));
		System.out.println(user.clearAllEmailSamples("abc@yahoo.com.com"));
	}
}
