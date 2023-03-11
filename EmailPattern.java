package aneesh;

import java.util.Scanner;

public class EmailPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
String emailregex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
String phoneregex="(0/91)?[7-9][0-9]{9}";

//sreelakshmi1      @ghhfg.hgjhj
 
//[a-zA-Z0-9+_.-] + @ [a-zA-Z0-9.-]
//sreelakshmi?  @ ghg?

System.out.println("Enter email id");
String email=scanner.next();

System.out.println("Enter phone ");

String phn=scanner.next();

boolean maching=email.matches(emailregex);
boolean phnmaching=phn.matches(phoneregex);

if(maching && phnmaching)
{
	System.out.println("Valid");
}

else {
	System.out.println("Invalid ");

}
		//Or
		if (maching) {
			//System.out.println("Valid email");
		} else {
			System.out.println("Enter a valid email id ");

		}

		if (phnmaching) {
			//System.out.println("Valid phone number");

		} else {
			System.out.println("Enter a valid phone number ");

		}
	}

}
