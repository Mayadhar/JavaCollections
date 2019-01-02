package com.model;

public class Student {
	private int roll;
	private int age;
	private String fname;
	private String lname;

	public Student(int roll, int age, String fname, String lname) {
		super();
		this.roll = roll;
		this.age = age;
		this.fname = fname;
		this.lname = lname;
	}

	public Student() {
		super();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", age=" + age + ", fname=" + fname + ", lname=" + lname + "]";
	}

}
