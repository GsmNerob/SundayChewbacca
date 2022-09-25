package com.upskill.java_1;

public class Constructor {

	String studentName;
	int studentAge;
	public Constructor(String name, int age){
		studentName=name;
		studentAge=age;
	}
	public static void main(String[] args) {
		
    	Constructor obj = new Constructor("Nerob", 30);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);   
		
	}
}
