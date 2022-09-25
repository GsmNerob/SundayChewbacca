package com.upskill.java_1;

public class NestedLoop {

	public static void main(String[] args) {
		//practiceNestedLoop();
		practiceNestedLoopOne();
		

	}public static void practiceNestedLoop(){
		int i;
    	int j;                                            
    	for(i = 1; i <=12; i++){
    		for(j = 1; j <= 12; j++){
    			int multipicationTable = i * j;
    			System.out.print(multipicationTable + "");
    		}
    		System.out.println("");
    		
	   }
   } 
	public static void practiceNestedLoopOne(){
		int i;
    	int j;
    	for(i = 1; i >=12; i--){
    		for(j = 1; j >= 12; j--){
    			int multipicationTable = i * j;
    			System.out.print(multipicationTable + "");
    		}
    		System.out.println("");
    	}
		
	}
 }
