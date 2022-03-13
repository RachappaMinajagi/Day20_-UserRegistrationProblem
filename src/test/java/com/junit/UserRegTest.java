package com.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

/**
 * testCases for validating lastName
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
		boolean isLnameValid = userRegistration.Lname("Advani");
		Assert.assertTrue(isLnameValid);
	}

	/*
	 * created method testLastNameInvalidMustReturnFalse for false condition
	 */
	@Test
	public void testLastNameValidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isLnameINValid = userRegistration.Lname("advani");
		Assert.assertFalse(isLnameINValid);
	}
}