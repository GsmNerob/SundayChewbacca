package com.upskill.java_4;

import com.upskill.java_3.MethodType;

public class polymorphism_1 extends MethodType{


	public static void main(String[] args) {
		car();
		car(2);
		car(2, 4);
		car("Black");
		
		MethodType obj = new MethodType();	
		obj.annualIncomVoid();

		System.out.println ("My Mothly Income = " + obj.mothlyIncomeReturn());
		
		WeeklyIncomStatic();
	   
		 //Method Overriding - Runtime Polymorphism - Dynamic binding
		//Same method name from Parent class to override
			
 	
		//Method Overloading - Compile time Polymorphism - Static binding
		//Same method name with different signature

	}public static void car(){
		System.out.println("My car is Honda !");
		
	}
	public static void car(int door){
		System.out.println("My car is Honda, it has door :" + door);
		
	}
	public static void car (int door, int wheel){
		System.out.println("My car is Honda, it has door :" + "it has wheel : " + wheel);
		
	}
		public static void car(String color){
			System.out.println("My car is Audi, it has color : " + color);	
			
		}
		// void method
		public void annualIncomVoid(){
			int annualIncom = hourlyIncome * 2000+500;
			System.out.println ("My Annual Income = " + annualIncom);
				
	}
		// Return Type Method
		public int mothlyIncomeReturn(){
			int mothlyIncome = hourlyIncome * 180+1000;
			return mothlyIncome;
		}

		//void method 
		public static void WeeklyIncomStatic(){
			int WeeklyIncome = hourlyIncome * 40+200;
			System.out.println ("My Weekly Income = " + WeeklyIncome);
		}	
}
