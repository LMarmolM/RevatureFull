package assignment2;

//Q4: We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
//by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an 
//abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same 
//name which returns the percentage of the students. 
//The constructor of student A takes the marks in three subjects as its 
//parameters and the marks in four subjects as its parameters for student B. 
//Create an object for each of the two classes and print the
//percentage of marks for both the students.
abstract class Marks {
	abstract float getPercentage();
}

class A extends Marks{
	//Three grades for student A
	int math;
	int science;
	int history;
	
	A(int a, int b, int c){
	math = a;
	science =b;
	history=c;
	}
	
	public float getPercentage() {
		return (math+science+history)/3;
	}
}

class B extends Marks{
	//Four grades for student B
	int math;
	int science;
	int history;
	int art;
	
	B(int a, int b, int c, int d){
	math = a;
	science =b;
	history=c;
	art=d;
	}
	
	public float getPercentage() {
		return (math+science+history+art)/4;
	}
}

public class A2E4 {

	public static void main(String[] args) {
		A studentA = new A(80,85,100);
		B studentB = new B(80,85,100,95);
		System.out.println("Student A average is: "+ studentA.getPercentage());
		System.out.println("Student B average is: "+ studentB.getPercentage());
		
		
	}

}
