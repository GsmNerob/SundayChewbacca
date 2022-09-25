package com.upskill.java_1;

public class Loops {

	  /* 
	    Type of Loops
	   1. For Loop
	   2. While Loop
	   3. Do While Loop 
	   4. Infinite loop
	   */
	
	public static void main(String[] args) {
	//	practiceForLoop();
	//	practiceWhileLoop();
	//	practiceDoWhileLoop(); 
	 // practiceInfiniteLoop();	
     practiceNestedLoop();
	}
    public static void practiceForLoop(){
    	int i;
    	for(i = 1; i <= 10; i++){
    		System.out.println("For Loops Number =" + i);
    	}
    	
    }
    
    public static void practiceWhileLoop(){
    	int i = 1;
    	while(i<=10){
    		System.out.println("While Loops Number =" + i);
    		i++;
    	}
    }
    
    public static void practiceDoWhileLoop(){
    	int i = 1;
    	do{
    		System.out.println("Do While Lopps Number =" + i);
    		i++;
    	}while (i<=10);
    	
    }
    
    public static void practiceInfiniteLoop(){
    	int i;
    	for (i = 1; ; i++){
    		System.out.println(" for Loops Number =" + i);
    		
    	}
    }
    
    public static void practiceNestedLoop(){              //Nested loop = loop inside another loop
    	                                                  //Initializing variable i 
    	int i;                                            //Initializing variable j
    	int j;                                            //
    	for(i = 1; i <=50; i++){
    		for(j = 1; j <= 20; j++){
    			int multipicationTable = i * j;
    			System.out.print(multipicationTable + " ");
    		}
    		System.out.println(" ");
    		}
    	}
    
    	
    }
    
    
