package assignment2;
//LFMM
import java.util.Scanner;
//Q1: Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
public class A2E1 {
	public static void main(String[] args) {
		System.out.println("This program calculates the area of a rectangle.");
		System.out.println("Please enter the length of the rectangle: ");
		Scanner s = new Scanner(System.in);
		int l = (int)s.nextDouble();
		System.out.println("Please enter the width of the rectangle: ");
		Scanner x = new Scanner(System.in);
		int w = (int)x.nextDouble();
		
		System.out.println("The area is: "+ w*l);
	}
	
	
}
