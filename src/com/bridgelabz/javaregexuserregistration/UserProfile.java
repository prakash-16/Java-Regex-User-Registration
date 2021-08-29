package com.bridgelabz.javaregexuserregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserProfile {

	public String firstName;

	public boolean validateName(String name) {
		String nameRegex = "^[A-Z]{1}[a-z]{3,}$";
		Pattern p = Pattern.compile(nameRegex);
		Matcher m = p.matcher(name);
		return m.matches();
	}

	public boolean validateEmail(String email) {
		String emailRegex = "^[a-z]{3,8}+(\\.[a-z]{2,8}?)@[a-z]{2,8}+\\.[a-z]{2,8}+(\\.[a-z]{2,4}?)$";
		Pattern p = Pattern.compile(emailRegex);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public boolean validateMobileNumber(String mobileNumber) {
		String mobileNumberRegex = "^(91)( )([7-9]{1})([0-9]{9})$";
		Pattern p = Pattern.compile(mobileNumberRegex);
		Matcher m = p.matcher(mobileNumber);
		return m.matches();
	}

	public boolean validatePassword(String password) {
		String passwordRegex = "^([A-Z([a-z]{8,12})]{1,12})$";
		Pattern p = Pattern.compile(passwordRegex);
		Matcher m = p.matcher(password);
		System.out.println(m.matches());
		return m.matches();
	}
	
}
