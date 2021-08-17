package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Please enter password: ");
	    String password = in.nextLine();


	    while (!validPassword(password)) {
	    	System.out.println("This password is invalid");
	    	System.out.print("Re-enter password: ");
	    	String Password = in.nextLine();
	    	if (validPassword(Password)) {
	    		System.out.println("This password2 is accepted");
			}
		}
	    if (validPassword(password)) {
	    	System.out.println("This password is accepted");
		}
    }

	public static boolean validPassword(String password) {
    	Boolean upperCase = false;
    	Boolean lowerCase = false;
    	Boolean digit = false;

    	if (password.length() <8) {
    		return false;
		}
    	for (int i=0; i < password.length(); i++) {
    		if (Character.isUpperCase(password.charAt(i))) {
    			upperCase = true;
			}
    		else if (Character.isLowerCase(password.charAt(i))) {
    			lowerCase = true;
			}
    		else if (Character.isDigit(password.charAt(i))) {
    			digit = true;
			}
		}

    	return (upperCase || lowerCase || digit);
	}




}
