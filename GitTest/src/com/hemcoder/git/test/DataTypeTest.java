package com.hemcoder.git.test;

public class DataTypeTest {

	public void testMethod(int i){
		System.out.println("called int method");
	}
	
	public void testMethod(Double i){
		System.out.println("called double method");
	}
	
	public void testMethod(Object i){
		System.out.println("called object method");
	}
	
	public static void main(String[] args) {
		DataTypeTest test=new DataTypeTest();
		test.testMethod(102);
		//test.testMethod(11.05);
		test.testMethod(new Integer(110));
		
	}

}
