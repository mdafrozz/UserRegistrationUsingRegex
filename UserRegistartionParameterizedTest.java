/**
 * 
 */
package com.bridgelabz.main;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
/**
 * @author MD_AFROZ
 *
 */
@RunWith(Parameterized.class)
public class UserRegistartionParameterizedTest {
	
	private String actualResult;
	private String expectedResult;
	// Constructor
	public UserRegistartionParameterizedTest(String actualResult, String expectedResult) {
		this.actualResult = actualResult;
		this.expectedResult = expectedResult;
	}

	@Before
	public void init() {
		new UserRegistrationRegex();
	}

	@Parameterized.Parameters
	public static Collection<Object[]> emailInput() {
		return Arrays
				.asList(new Object[][] { { "afroz@@yahoo.com", "InValid" }, { "abc.xyz@bl.co.india", "InValid" },
						{ "abc.xyz$bl.co.in", "InValid" }, { "abc.xyz@bl.co.in", "Valid" } });
	}

	@Parameterized.Parameters
	public static Collection<Object[]> passwordInput() {
		return Arrays.asList(new Object[][] { { "Abccc@123", "InValid" }, { "abccc@@@123", "InValid" },
				{ "Ac@123", "InValid" }, { "AAAAAA@123A", "InValid" } });
	}

	@Test
	public void testEmail() {
		assertEquals(expectedResult, UserRegistrationRegex.email(actualResult));
	}

	@Test
	public void testPassword() {
		assertEquals(expectedResult, UserRegistrationRegex.password(actualResult));
	}
}
