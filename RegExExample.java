package com.bridgeLabz.regularExpression;

import java.util.regex.*;

public class RegExExample {
	
	public static void main(String args[]) {
		
		String regularExp="^[A-Z][A-Za-z]{2,}$";
		String firstName="Noor";
		Pattern pattern=Pattern.compile(regularExp);
		Matcher matcher=pattern.matcher(firstName);
		if (matcher.matches()==true)
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");
		
		String lastName="Fatma";
		Matcher matcher2=pattern.matcher(lastName);
		if (matcher2.matches()==true)
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name");
	}
	
}
