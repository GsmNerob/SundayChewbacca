package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class P_Array_1 {

	public static void main(String[] args) {
		
		int age = 50;
		int[] GsmNerob = new int[]{10, 20, 30, 40, 50, 60};
		    // Array Index          0   1   2   3   4   5
		
		System.out.println("Student Age : " + GsmNerob[4]);
		
		String[] nameGsmNerob = new String[]{"Joy", "Mamun", "Jahid", "Forhad", "Nerob"};
		  // Array Index                       0       1        2         3        4
		System.out.println("Student Name : " + nameGsmNerob[2]);
        System.out.println("Total Student : " + nameGsmNerob.length);
        
        
        // Hashmap store multipul data using key-value pair Implementation of Map interface
        
        HashMap<String, Integer> Student = new HashMap<String, Integer>();
        Student.put("Joy", 10);
        Student.put("Mamun", 20);
        Student.put("Jahid", 30);
        Student.put("Forhad", 40);
        Student.put("Nerob", 50);
        System.out.println("Student Age :" +Student.get("Nerob"));
        
     // Hashset store unordered collection containing unique value Implementation of Set interface
         
        HashSet<String> car = new HashSet<String>();
        car.add("BMW");
        car.add("Audi");
        car.add("Toyota");
        System.out.println("Car name is :" + car);
        
        
      //HashTable store multipul data using key-value pair, but is synchronized (only one thread can be modified)
        

        Hashtable<String, String> Region = new Hashtable<String, String>();
        Region.put("GSM", "Nerob");
        Region.put("USA", "North America");
        System.out.println("Region :" + Region.get("GSM"));
	}

}
