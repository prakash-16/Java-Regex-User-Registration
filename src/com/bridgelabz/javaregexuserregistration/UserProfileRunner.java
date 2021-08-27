package com.bridgelabz.javaregexuserregistration;

import java.util.*;

public class UserProfileRunner {

	public static void main(String[] args) {
		int i = 1;
		UserProfile profile1 = new UserProfile();
		Scanner sc = new Scanner(System.in);
		while (i < 2) {
			switch (i) {
			case 1:
				System.out.println("Enter your first name :- ");
				String firstName = sc.nextLine();
				boolean check = profile1.validateName(firstName);
				if (check != true) {
					System.out.println("Name is invalid.");
					break;
				}
				System.out.println("Name is valid.");
			}
			i++;
		}
	}
}
