package com.hemcoder.git.test;

public class Employee {

	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		System.out.println("ID:"+id+"\tName:"+name);
	}
}
