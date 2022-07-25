/**
 * 
 */
package user_registration_with_lambda;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * @author MD_AFROZ
 *
 */
@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {

	public String emailId;
	public boolean expectedResult;

	public UserRegistrationParameterizedTest(String emailId, boolean expectedResult) {
		this.emailId = emailId;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> ExpectedResult() {
		return Arrays.asList(new Object[][] { { "abc.xyz@blz.com.in", true }, { "abc.xyz@blzin.com", true },
				{ "abc@blz.com", true }, { "abc@xyz@gmail.com", false }, { "abc@gmail.com", true }, { "abc", false },
				{ "abc@blz", false },

		});
	}

	@Test
	public void givenEmailId_WithEmailId_ShouldPassedAllTest() throws UserRegistrationException {
		UserRegistrationUsingLambdaFunctions validator = new UserRegistrationUsingLambdaFunctions();
		validator.validateFname.validate(this.emailId);
		String expectedResult = "valid";
		Assert.assertEquals(expectedResult, true);
	}
}
