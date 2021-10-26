package assignment2;

import java.util.Scanner;

//LFMM
//Q2: Take name, roll number and field of interest from user and print in the format below :
//    Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.



public class A2E2 {
	static void prt(String name,String roll,String interest) {
	System.out.println("Hey, my name is "+ name +" and my roll number is "+ roll+". My field of interest is "+interest+".");		
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name: ");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println("Enter roll number: ");
		s = new Scanner(System.in);
		String roll = s.next();
		System.out.println("Enter field of interest: ");
		s = new Scanner(System.in);
		String interest = s.next();
		prt(name,roll,interest);
	}

}
