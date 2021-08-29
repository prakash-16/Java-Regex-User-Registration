package com.bridgelabz.javaregexuserregistration;

import java.util.*;

public class UserProfileRunner {

	public static void main(String[] args) {
		int i = 1;
		UserProfile profile1 = new UserProfile();
		Scanner sc = new Scanner(System.in);
		switch (i) {
		case 1:
			System.out.println("Enter your first name :- ");
			String firstName = sc.nextLine();
			if (profile1.validateName(firstName) != true) {
				System.out.println("Name is invalid.");
				break;
			}
			System.out.println("First name is valid.");

		case 2:
			System.out.println("Enter your last name :- ");
			String secondName = sc.nextLine();
			if (profile1.validateName(secondName) != true) {
				System.out.println("Name is invalid.");
				break;
			}
			System.out.println("Last name is valid.");

		case 3:
			System.out.println("Enter your Email-Id :- ");
			String email = sc.nextLine();
			if (profile1.validateEmail(email) != true) {
				System.out.println("Email-Id is invalid");
			} 
			else {
				System.out.println("Email-Id is valid");
			}

		}

	}
}
