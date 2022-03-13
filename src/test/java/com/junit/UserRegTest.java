package com.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

/*UC5_Password
 * As a User need to follow pre-defined Password 
 * rules.Rule1– minimum 8 Characters - NOTE – All rules must be passed
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

	/*
	 * Created method for Email and its boolean type whether Email valid or not
	 */

	public boolean checkEmail(String emailID) {
		return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
	}

	public void testPhoneNumber_MustReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		/**
		 * calling checkPhoneNum method to see phoneNumber is valid
		 */
		boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 9686127142");
		Assert.assertTrue(isPhoneNumberValid);
	}

	@Test
	/**
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
		boolean isPasswordValid = userRegistration.checkPassword("abcdefghi");
		Assert.assertTrue(isPasswordValid);
	}

	@Test
	/*
	 * created testPassword_MustReturnFalse() for False condition
	 */
	public void testPassword_MustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isPasswordInValid = userRegistration.checkPassword("abcd");
		Assert.assertFalse(isPasswordInValid);
	}
}