/**
 * 
 */
package com.bridgelabz.main;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author MD_AFROZ
 *
 */
public class UserRegistrationTestRegex {

	@Test
	public void givenTextWhenItContainsFirstCapsInFnameAndMinThreeAlphabetsShouldReturnTrue() {
		String actual = UserRegistrationRegex.fName("Afroz");
		String expected = "Valid";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void givenTextWhenItDoesNotContainsFirstCapsInFnameShouldReturnTrue() {
		String actual = UserRegistrationRegex.fName("afroz");
		String expected = "InValid";
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void givenTextWhenItContainsFirstCapsInFnameButNotMinThreeCharShouldReturnTrue() {
		String actualResult = UserRegistrationRegex.fName("Af");
		String expectedResult = "InValid";
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void givenTextWhenItDoesNotContainsFirstCapsInlnameShouldReturnTrue() {
		String actualResult = UserRegistrationRegex.lName("mulla");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenTextWhenItContainsFirstCapsInlnameButNotMinThreeCharShouldReturnTrue() {
		String actualResult = UserRegistrationRegex.lName("mu");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenDoesNotContainsAtTheRateShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.email("abc.yahoo.com");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenDoesNotContainsabcShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.email("xyz.yahoo.co.in");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsMoreThanThreeCharAtLastShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.email("xyz.yahoo.co.india");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsMoreThanTwoTLDShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.email("xyz.yahoo.co.in.co");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsOneCharInTLDShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.email("xyz.yahoo.co.i");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsDoubleDotsShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.email("xyz..yahoo.co.i");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsSpecialCharacterShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.email("xyz.yahoo.c@.i");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenItContainsDigitsInTLDShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.email("xyz.yahoo.c1.i");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenEmailWhenAccordingToProperReqShouldReturnTrue() {
		String actualResult = UserRegistrationRegex.email("abc.xyz@bl.co.in");
		String expectedRes = "Valid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithSpaceAndProperNumberShouldReturnTrue() {
		String actualResult = UserRegistrationRegex.mobile("91 8123434456");
		String expectedRes = "Valid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithoutSpaceAndProperNumberShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.mobile("918123434456");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenMobileNumberWithSpaceButNotProperCountryCodeShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.mobile("348123434456");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutAnUpperCaseShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.password("abccc@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutASpecialCharShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.password("abccc123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutALowerCaseShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.password("AAAAAAA@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithoutMinNumOfCharShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.password("Ac@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithMultipleSpecCharShouldReturnFalse() {
		String actualResult = UserRegistrationRegex.password("abccc@@@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}

	@Test
	public void givenPasswordWithProperRequirementsShouldReturnTrue() {
		String actualResult = UserRegistrationRegex.password("Abccc@123");
		String expectedRes = "InValid";
		Assert.assertEquals(actualResult, expectedRes);
	}
}
