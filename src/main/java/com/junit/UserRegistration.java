package com.junit;

/*
 * UC4- As a User need to follow pre-defined Mobile Format  
 * -E.g. 91 9919819801 - Country code follow by space and 10 digit number.
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
}