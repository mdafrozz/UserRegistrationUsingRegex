/**
 * 
 */
package com.bridgelabz.main;

/**
 * @author MD_AFROZ
 *
 */
public interface IUser {

	public void validateFirstName();
	public void validateLastName();
	public void validateEmail();
	public void validateMobileNumber();
	public void validatePassword();
	public boolean clearAllEmailSamples(String parameters);
}
