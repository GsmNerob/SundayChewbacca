package com.upskill.java_5;

import org.omg.Messaging.SyncScopeHelper;

public class Encapsulation {
	
	// Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";             // write & read
	private int ssn = 23876157;                 // write only
	private String username = "Gsmnerob";       // read only
	
	
//Setter Method - name 
	public void setName(String value){       // set the data write
		name = value;
	}
	 
// Getter Merthod - name
	public String getName(){                   // get the data read
		return name;
	}
	
//Setter Method - SSN
	public void setSSN(int value){             // set the data write
		ssn = value;
	}
// Getter Merthod - username
		public String getUserName(){             // get the data read
			return username;
	
		}	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Nerob");
		System.out.println(obj.getName());
		obj.setSSN(462621278);
		System.out.println(obj.getUserName());
		
	
		

	}

}
