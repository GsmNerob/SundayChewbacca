package com.upskill.java_2;

public class Variable {

	//  Variable in Java
	
	public String country ="USA";   //Instance OR global Variables - Variables declared in Class level, outside method
	
    public static String region = "America";   //static variable - variable belong to class and don't required creating object

    public static void main1 (String[] args){
   
    	String city = "NYC";
    	myMethod2("Queens");		
    	
    }                                          // Local variable - variable declared in methods
    	
    public void myMethod(String county){    // Method parameter - variable used as method parameter, pass value 
    }                                         
	public static void main(String[] args) {
	
	}
		public static void myMethod2(String county){        // Local variables -variable declared in methods
		
	    String city = "Bloomfild";
	    System.out.println("Method Parameter ::" + county);
	
	}
    
}
