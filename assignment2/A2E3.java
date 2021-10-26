package assignment2;

import java.util.Scanner;

//Q3: Print the average of three numbers entered by user by creating a class named 'Average' 
//having a method to calculate and print the average.
public class A2E3 {
	//designed just for 3 numbers
	static float average(float a, float b, float c) { 
	return (a+b+c)/3;
}
	public static void main(String[] args) {
		System.out.println("This program calculates the average of three numbers");
		System.out.println("Enter first number: ");
		Scanner s = new Scanner(System.in);
		float a = s.nextFloat();
		System.out.println("Enter second number: ");
		s = new Scanner(System.in);
		float b = s.nextFloat();
		System.out.println("Enter third number: ");
		s = new Scanner(System.in);
		float c = s.nextFloat();
		System.out.println("The average is: "+average(a,b,c));

	}

}
