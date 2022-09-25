package com.upskill.java_1;

public class SwitchCase {
	
 public static int day = 7;

	public static void main(String[] args) {
		weekday();
	}
     public static void weekday(){
    	 switch (day){
    	 case 1:
    		 System.out.println("Monday");
    		 break;
    	 case 2:
    		 System.out.println("Tuesday");
    		 break;
    	 case 3:
    		 System.out.println("Wednesday");
    		 break;
    		 
    	 case 4:
    		 System.out.println("Thursday");
    		 break;
    	 case 5:
    		 System.out.println("Friday");
    		 break;
         case 6:
		 System.out.println("Saturday");
		 break;
         case 7:
    		 System.out.println("Sunday");
    		 break;
    	 }
    
     }
}
