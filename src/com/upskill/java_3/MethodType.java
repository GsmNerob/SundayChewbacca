package com.upskill.java_3;

public class MethodType {
 /*  Types of Method
    1. Void Method
	2. Static Method
	3 Return Type Method */
	
	public static int hourlyIncome = 80;
   
		public static void main(String[] args){
			MethodType obj = new MethodType();
			
			obj.annualIncomVoid();
			obj.mothlyIncomeReturn();
			WeeklyIncomStatic();
			
			System.out.println ("My Mothly Income = " + obj.mothlyIncomeReturn());  
			
	 }	
  // void method
	public void annualIncomVoid(){                     // void method we don't have to return anything
		int annualIncom = hourlyIncome * 2000;
		System.out.println ("My Annual Income = " + annualIncom);
		
	}	
 // Static Void method
	public static void WeeklyIncomStatic(){         // Static method we don't need to caeate any obj
	    int WeeklyIncome = hourlyIncome * 40;
	    System.out.println ("My Weekly Income = " + WeeklyIncome);
				
     }
 // Return Type Method                             // return type method we have to must return something 
	public int mothlyIncomeReturn(){
		int mothlyIncome = hourlyIncome * 180;
		return mothlyIncome; 
	}   
}    

