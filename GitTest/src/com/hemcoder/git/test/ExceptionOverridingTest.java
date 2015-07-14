package com.hemcoder.git.test;

import java.io.IOException;

public class ExceptionOverridingTest {

	public void parentMethod() throws Exception{
		System.out.println("Parent method.");
	}
}

class ChildTest extends ExceptionOverridingTest{
	public void parentMethod() throws IOException{
		System.out.println("Parent method.");
	}
}
