/**
 * 
 */
package user_registration_with_lambda;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author MD_AFROZ
 *
 */
public class UserRegistrationTest {

	@Test
	public void whenGivenFirstNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateFname.validate("Afroz");
			System.out.println("It is Valid");
		} catch (UserRegistrationException userRegistrationException) {
			System.out.println("It is not Valid");
			Assert.assertEquals("Enter valid FName", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenFirstNameWithInvalidFName() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateFname.validate("afroz");
			System.out.println("It is Valid");
		} catch (UserRegistrationException userRegistrationException) {
			System.out.println("It is not Valid");
			Assert.assertEquals("Enter valid FName", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenFirstNameWithEmptyValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateFname.validate("");
			System.out.println("It is Valid");
		} catch (UserRegistrationException userRegistrationException) {
			System.out.println("It is not Valid");
			Assert.assertEquals("Enter valid FName", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenFirstNameWithNullValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateFname.validate(null);
			System.out.println("It is not null");
		} catch (NullPointerException nullPointerException) {
			System.out.println("It is Null");
			Assert.assertNotEquals("valid", nullPointerException.getMessage());
		}
	}

	@Test
	public void whenGivenLastNameShouldHaveMinimum3CharWithCamelCase() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateLname.validate("Af");
			System.out.println("It is not Valid");
		} catch (UserRegistrationException userRegistrationException) {
			System.out.println("It is Valid");
			Assert.assertEquals("Enter valid lName", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenLastNameWithSmallLetter() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateLname.validate("afroz");
		} catch (UserRegistrationException userRegistrationException) {
			Assert.assertEquals("Enter valid lName", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenLastNameWithEmptyValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateLname.validate("");
		} catch (UserRegistrationException userRegistrationException) {
			Assert.assertEquals("Enter valid lName", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenLastNameWithNullValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateFname.validate(null);
		} catch (NullPointerException nullPointerException) {
			Assert.assertNotEquals("valid", nullPointerException.getMessage());
		}
	}

	@Test
	public void whenGivenEmailValid() throws UserRegistrationException {
		UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
		validator.validateEmail.validate("abc.xyz@blz.com");
		Assert.assertEquals("valid", "valid");
	}

	@Test
	public void whenGivenEmailWithoutSignShouldReturnInvalid() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateEmail.validate("abc.xyz.bl.co.in");
		} catch (UserRegistrationException userRegistrationException) {
			Assert.assertEquals("Enter valid email", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenEmailWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateEmail.validate("");
		} catch (UserRegistrationException userRegistrationException) {
			Assert.assertEquals("Enter valid email", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenEmailStartWithDotShouldReturnNullValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validateEmail.validate(null);
		} catch (NullPointerException nullPointerException) {
			Assert.assertNotEquals("valid", nullPointerException.getMessage());
		}
	}

	@Test
	public void whenGivenPhoneNumberValid() throws UserRegistrationException {
		UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
		validator.validatePhone.validate("91 7396382673");
		Assert.assertEquals("valid", "valid");
	}

	@Test
	public void whenGivenMobileNoWithoutCountryCodeShouldReturnInvalid() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validatePhone.validate("91 7396382673");
		} catch (UserRegistrationException userRegistrationException) {
			Assert.assertEquals("Enter valid Phone", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenMobileNoWithoutSpaceShouldReturnEmptyValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validatePhone.validate("");
		} catch (UserRegistrationException userRegistrationException) {
			Assert.assertEquals("Enter valid Phone", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenMobilNoStartWithDotShouldReturnNullValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validatePhone.validate(null);
		} catch (NullPointerException nullPointerException) {
			Assert.assertNotEquals("valid", nullPointerException.getMessage());
		}
	}

	@Test
	public void whenGivenPasswordValid() throws UserRegistrationException {
		UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
		validator.validatePassword.validate("Abcd@123");
		Assert.assertEquals("valid", "valid");
	}

	@Test
	public void whenGivenPasswordWithoutIntegerCaseShouldReturnInvalid() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validatePassword.validate("nckdf.fdike3");
		} catch (UserRegistrationException userRegistrationException) {
			Assert.assertEquals("Enter valid password", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenPasswordWithoutSignShouldReturnEmptyValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validatePassword.validate("nc");
		} catch (UserRegistrationException userRegistrationException) {
			Assert.assertEquals("Enter valid Password", userRegistrationException.message);
		}
	}

	@Test
	public void whenGivenPasswordStartWithDotShouldReturnNullValue() throws UserRegistrationException {
		try {
			UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
			validator.validatePassword.validate(null);
		} catch (NullPointerException nullPointerException) {
			Assert.assertNotEquals("valid", nullPointerException.getMessage());
		}
	}
}
