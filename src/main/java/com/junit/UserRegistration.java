package com.junit;

/*
UC1 :-   As a User need to enter a valid First Name
 *        - First name starts with Cap and has minimum 3 characters
 
 * UC2 :-   As a User need to enter a valid Last Name
 *        - Last name starts with Cap and has minimum 3 characters
 
 * UC3 :-   As a User need to enter  a valid email
 *        - E.g. abc.xyz@bl.co.in
 *        - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
 
 * UC4 :-   As a User need to follow pre-defined Mobile Format
 *        - E.g. 91 9919819801
 *        - Country code follow by space and 10 digit number
 * 
 * UC5 :-   As a User need to follow pre-defined Password rules.
 *          Rule1- minimum 8 Characters 
 * 
 * UC6 :-  Rule2- Should have at least 1 Upper Case
 * 
 * UC7 :-  Rule3- Should have at least 1 numeric number in the password
 *  UC8- As a User need to follow pre-defined Password rules.
 * Rule1– minimum 8 Characters 
 * Rule2- Should have at least 1 Upper Case
 * Rule3- Should have at least 1 numeric number in the password
 * Rule4- Should have at Exactly 1 Special Character in the password
 * NOTE – All rules must be passed
 * 
 
 * UC9: -Should clear all email samples provided separately
 * UC10:- Write Junit Test for Happy as well as Sad test case.
 *      - Happy Test Case validates the Entry Successfully
 *      - Sad Test Cases fails the Entry
 * 
 * UC11:-  JUnit Parameterized Test to validate multiple entry for the Email Address    
 */

public class UserRegistration {
	/*
	 * created method checkFName and passing parameter in this it will check
	 * FirstName is valid or not result will be in true or false because method is
	 * boolean type
	 */
	public boolean checkFName(String fName) {
		/*
		 * regex pattern for firstName
		 */
		return (fName.matches("[A-Z][a-z]{3,}"));

	}

	/*
	 * created method LName and passing parameter in this it will check LastName is
	 * valid or not result will be in true or false because method is boolean type
	 */
	public boolean Lname(String Lname) {
		return (Lname.matches("[A-Z][a-z]{3,}"));
	}

	/*
	 * created method checkEmail and passing parameter in this it will check Email
	 * is valid or not result will be in true or false because method is boolean
	 * type
	 */
	public boolean checkEmail(String emailID) {
		return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
	}

	/*
	 * created method checkPhoneNum and passing parameter in this it will check
	 * phoneNumber is valid or not result will be in true or false because method is
	 * boolean type
	 */
	public boolean checkPhoneNum(String phoneNum) {
		return (phoneNum.matches("91\\s[0-9]{10}"));
	}

	/*
	 * created method checkPassword and passing parameter in this it will check
	 * Password is valid or not having Minimum 8 Characters and first letters should
	 * be capital result will be in true or false because method is boolean type
	 */
	public boolean checkPassword1(String password) {
		return (password.matches("^(?=.*[A-Z])(?=.*[a-z]).{8,}$"));
	}

	public boolean checkPassword(String password) {
		return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$"));
	}

	public String moodAnalyzer(String fName, String Lname, String phoneNum, String emailID, String password) {
		if (checkFName(fName) == true && Lname(Lname) == true && checkEmail(emailID) == true
				&& checkPhoneNum(phoneNum) == true && checkPassword(password) == true) {
			return "HAPPY";
		} else {
			return "SAD";
		}

	}
}
