package com.jbpark.json;

public class Employee {
	// Defining properties
	String 이름;
	int 월급;
	Boolean is경영진;

	// creating main() method of teh Employee class
	public static void main(String args[]) {
		// Creating object of Employee class
		Employee emp = new Employee();
		
		emp.이름 = "임성혜";
		emp.월급 = 400_0000;
		emp.is경영진 = false;
		
		// Printing values of the object
		System.out.println(emp.이름);
		System.out.printf("%,d\n",emp.월급);
		System.out.println(emp.is경영진);
	}
}
