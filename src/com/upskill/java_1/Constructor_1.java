package com.upskill.java_1;

public class Constructor_1 {

	String studentName;
	int studentage;

	public void Constructor(String name, int age){
		studentName=name;
		studentage=age;
		
	}

	public static void main(String[] args) {
		
		Constructor obj = new Constructor("Nerob ", 50);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		
		}
	

	}
