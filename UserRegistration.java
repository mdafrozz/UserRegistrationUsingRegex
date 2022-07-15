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
	}
}
