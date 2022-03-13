package com.junit;

/*
 * /**
 * UC5- As a User need to follow pre-defined Password rules.
 * Rule1– minimum 8 Characters 
 * NOTE – All rules must be passed
 */

public class UserRegistration {
	public boolean checkFName(String fName) {
		return (fName.matches("[A-Z][a-z]{3,}"));

	}

	/*
	 * As a User need to enter a valid lirstName firstName starts with Cap and has
	 * minimum 3 characters
	 */
	public boolean Lname(String Lname) {
		return (Lname.matches("[A-Z][a-z]{3,}"));
	}

	/*
	 * Create method for phone number given format is Valid or Not to passing
	 * parameter
	 */
	public boolean checkPhoneNum(String phoneNum) {
		return (phoneNum.matches("91\\s[0-9]{10}"));
	}

	/*
	 * created method checkPassword and passing parameter in this it will check
	 * Password is valid or not
	 */
	public boolean checkPassword(String password) {
		return (password.matches("[a-zA-Z]{8,}"));
	}
}