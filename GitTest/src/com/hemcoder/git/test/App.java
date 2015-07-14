package com.hemcoder.git.test;

public class App {

	public static void main(String[] args) {
		System.out.println("Creating employee.....");
		Employee emp1=new Employee(102,"Hem");
		Employee emp2=new Employee(103,"Kailash");
		emp1.display();
		emp2.display();
	}

}
