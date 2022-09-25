package com.upskill.java_6;

public class Singleton {

   // Singleton is class that can have only one object
	
   // private constructor, it prevents any other class from initiating
	
	private Singleton(){
		
	}
	// private static of the class
	private static Singleton SingletonObj = new Singleton();
	
	// static instance method
	public static Singleton getInstance(){
		return SingletonObj;
		
	}
	 
	protected static void upskill(){
		System.out.println("Upskill method from Singleton Class");
	}

}