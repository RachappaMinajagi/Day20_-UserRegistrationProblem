package com.junit;

import org.junit.Assert;
import org.junit.Test;
/*
 * UC1_TestCase Validation for firstName
 */

public class UserRegTest {

	@Test
	/*
	 * created method testingFirstName() to check firstName is valid or not
	 */

	public void testingFirstName() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFNameValid = userRegistration.checkFName("Rachoti");
		Assert.assertTrue(isFNameValid);
	}
	/*
	 * created method testingLastName() to check lastName is valid or not
	 */

	@Test
	public void testFirstNameInvalidMustReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isFnameValid = userRegistration.checkFName("rachoti");
		Assert.assertFalse(isFnameValid);
	}
}