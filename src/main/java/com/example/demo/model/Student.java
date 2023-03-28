package com.example.demo.model;

public class Student {
	
	int roll;
	String Name;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		Name = name;
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
