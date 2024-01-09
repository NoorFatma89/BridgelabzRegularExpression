package com.bridgeLabz.regularExpression;

import java.util.regex.*;

public class RegExExample {
	
	public static void main(String args[]) {
		
		//UC1-Checking FirstName is valid or not
		String regularExp="^[A-Z][A-Za-z]{2,}$";
		String firstName="Noor";
		Pattern pattern=Pattern.compile(regularExp);
		Matcher matcher=pattern.matcher(firstName);
		if (matcher.matches()==true)
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");
		
		//UC2-Checking LastName is valid or not
		String lastName="Fatma";
		Matcher matcher2=pattern.matcher(lastName);
		if (matcher2.matches()==true)
			System.out.println("Valid Last Name");
		else
			System.out.println("Invalid Last Name");
		
		//UC3-Checking email is valid or not
		String regularExp2="^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*@[a-zA-Z]+([.][a-zA-Z]+)+$";
		String email="abc.xyz@bl.co.in";
		Pattern pattern3=Pattern.compile(regularExp2);
		Matcher matcher3=pattern3.matcher(email);
		if (matcher3.matches()==true)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		
		//UC4-Checking mobile number is valid or not
		String regularExp4="^\\d{2} \\d{10}$";
		String mobNumber= "91 8989898989"; 
		Pattern pattern4=Pattern.compile(regularExp4);
		Matcher matcher4=pattern4.matcher(mobNumber);
		if(matcher4.matches()==true)
			System.out.println("Mobile Number is valid");
		else
			System.out.println("Mobile Number is not valid");
		
		//UC5-Verifying Password according to Rule 1
		String regularExp5="^.{8,}$";
		String passwordRule1="asdfghjkhgfh";
		Pattern pattern5=Pattern.compile(regularExp5);
		Matcher matcher5=pattern5.matcher(passwordRule1);
		if(matcher5.matches()==true)
			System.out.println("Password is valid according to Rule 1");
		else
			System.out.println("Password is not valid according to Rule 1");
		
		//UC6-Verifying Password according to Rule 2
		String regularExp6 = "^(?=.*[A-Z]).{8,}$";         //(?=.*[A-Z]): Positive lookahead assertion
		String passwordRule2="asdfgHjk";
		Pattern pattern6=Pattern.compile(regularExp6);
		Matcher matcher6=pattern6.matcher(passwordRule2);
		if(matcher6.matches()==true)
			System.out.println("Password is valid according to Rule 2");
		else
			System.out.println("Password is not valid according to Rule 2");
		
	}
	
}
