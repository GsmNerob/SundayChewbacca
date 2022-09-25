package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		// Array store multipul data using index
		
		int age = 30;
		int[] ageChewbacca = new int[]{24, 45, 29, 35, 33, 28};
		//Array Index                   0  1    2   3   4   5
		
		System.out.println("Student Age : " + ageChewbacca[1]);
	
  String[] nameChewbacca = new String[]{"joy", "Fariyan", "Mamun", "Jahid", "Nerob", "Forhad"};
 // Array Index                            0        1         2        3        4
 
 System.out.println("Student Name : " + nameChewbacca[4]);
 System.out.println("Total Student : " + nameChewbacca.length);
 
    // Multi-Dimentional Array
 
  int[][] ageChewbacca2D = {{24, 45, 29, 35, 33, 28},     //[0][0]  [0][1]  [0][2]  [0][3]  [0][4]  [0][5] 
		                   {24, 45, 29}};                // [1][0]  [1][0]  [1][2]
  
    System.out.println("Stundent Age 2D: " + ageChewbacca2D[1][2]);
    
    
    // Hashmap store multipul data using key-value pair Implementation of Map interface
    
    HashMap<String, Integer> Student = new HashMap<String, Integer>();
    Student.put("Joy", 24);
    Student.put("Fariyan", 45);
    Student.put("Alex", 29);
    Student.put("Mamu", 35);
    Student.put("Jahid", 33);
    System.out.println("Student Age: "+ Student.get("Alex"));
     
     
    HashMap<String, String> Capital = new HashMap<String, String>();
    Capital.put("BD", "Dhaka");
    Capital.put("USA", "Washington DC");
    System.out.println("Capital City :" + Capital.get("BD"));
    System.out.println("Capital City :" + Capital.get("USA"));
    
    
    // Hashset store unordered collection containing unique value Implementation of Set interface
    
    HashSet<String> car = new HashSet<String>();
    car.add("BMW");
    car.add("Audi");
    car.add("Toyota");
    System.out.println("Car : " + car);
    
    
//HashTable store multipul data using key-value pair, but is synchronized (only one thread can be modified)
    
    Hashtable<String, String> Region = new Hashtable<String, String>();
    Region.put("BD", "Asia");
    Region.put("USA", "North America");
    System.out.println("Region :" + Region.get("USA"));
    
    
  }
	}
