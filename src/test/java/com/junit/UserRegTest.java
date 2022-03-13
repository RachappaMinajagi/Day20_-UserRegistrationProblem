package com.junit;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

/**
 * TestCases for validating FirstName TestCases for validating LastName
 * TestCases for validating EmailID TestCases for validating PhoneNumber
 * TestCases for validating Password for rule 1-Having minimum 8 characters
 * TestCases for validating Password for rule 2-Should have at least 1 Upper
 * Case TestCases for validating Password for rule 3-Should have at least 1
 * numeric number in the password TestCases for validating Password for rule
 * 4-Should have Exactly 1 Special Character TestCases for validating all email
 * samples provided separately
 * 
 */
public class UserRegTest {

	@Test
	/*
	 * created method testingFirstName() to check firstname is valid or not
	 */
	public void testingFirstName() {
		/*
		 * Creating Object for UserRegistration class
		 */
		UserRegistration userRegistration = new UserRegistration();
		/*
		 * calling checkFName method to see firstname is valid
		 */
		boolean isFNameValid = userRegistration.checkFName("Rachoti");
		Assert.assertTrue(isFNameValid);
	}

	@Test
	/*
	 * created method testFirstNameInvalidMustReturnFalse for false condition
	 */
	public void testFirstNameInvalidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFnameValid = userRegistration.checkFName("rachoti");
		Assert.assertFalse(isFnameValid);
	}

	/*
	 * created method testingLastName() to check lastname is valid or not
	 */
	@Test
	public void testLastNameValidMustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		/*
		 * calling Lname method to see LastName is valid
		 */
		boolean isLnameValid = userRegistration.Lname("Minajagi");
		Assert.assertTrue(isLnameValid);
	}

	/*
	 * created method testLastNameInvalidMustReturnFalse for false condition
	 */
	@Test
	public void testLastNameValidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isLnameINValid = userRegistration.Lname("minajagi");
		Assert.assertFalse(isLnameINValid);
	}

	@Test
	/*
	 * created method testEmailId_MustReturnTrue() for true condition
	 */
	public void testEmailId_MustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		/*
		 * calling checkEmail method to see mailId is valid
		 */
		boolean isEmailValid = userRegistration.checkEmail("rachoti.ab@gmail.com");
		Assert.assertTrue(isEmailValid);
	}

	@Test
	/*
	 * created method testEmailId_MustReturnFalse() for false condition
	 */

	public void testEmailId_MustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isEmailInvalid = userRegistration.checkEmail("rachoti@.com");
		Assert.assertFalse(isEmailInvalid);
	}

	@Test
	/*
	 * created testPhoneNumber_MustReturnTrue() for True condition
	 */
	public void testPhoneNumber_MustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		/*
		 * calling checkPhoneNum method to see phoneNumber is valid
		 */
		boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 9686127142");
		Assert.assertTrue(isPhoneNumberValid);
	}

	@Test
	/*
	 * created testPhoneNumber_MustReturnFalse() for False condition
	 */
	public void testPhoneNumber_MustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPhoneNumberInValid = userRegistration.checkPhoneNum("9686127142");
		Assert.assertFalse(isPhoneNumberInValid);
	}

	@Test
	/*
	 * created testPassword_MustReturnTrue() for True condition
	 */
	public void testPassword_MustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		/**
		 * calling checkPassword method to see Password is valid
		 */
		boolean isPasswordValid = userRegistration.checkPassword("Abc@123gjyg");
		Assert.assertTrue(isPasswordValid);
	}

	@Test
	/*
	 * created testPassword_MustReturnFalse() for False condition
	 */
	public void testPassword_MustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPasswordInValid = userRegistration.checkPassword("abcdefghi");
		Assert.assertFalse(isPasswordInValid);
	}

	@Test
	/**
	 * created method mood_Analyser_Test_Sad() as Sad Test Cases fails the Entry
	 */
	public void mood_Analyser_Test_Sad() {
		UserRegistration userRegistration = new UserRegistration();
		String isMoodSad = userRegistration.moodAnalyzer("rachoti", "Minajagi", "9686127142", "rachoti006@.com", "5821201");
		Assert.assertEquals("SAD", isMoodSad);
	}

}
