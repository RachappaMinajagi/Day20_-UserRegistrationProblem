package com.junit;

/*
 * As a User need to enter a valid First Name
 * First name starts with Cap and has minimum 3 characters
 */
public class UserRegistration {
	public boolean checkFName(String fName) {
		return (fName.matches("[A-Z][a-z]{3,}"));

	}
}