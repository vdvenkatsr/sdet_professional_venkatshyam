package com.devlabs.lab14; 
import java.util.*; 


public class RemovePairHashTable { 


	public static void main(String[] args) { 
	   
	 //create Hashtable object 
	Hashtable<String,String> hashtable = new Hashtable<String,String>(); 
 	        
 	//add key value pairs to Hashtable 
 	hashtable.put("1","Java Interview Questions"); 
 	hashtable.put("2","Java Interview Programs"); 
 	hashtable.put("3","Concept and example program"); 
 	hashtable.put("4","Concept and interview Questions"); 
 	hashtable.put("5","Java Quiz"); 
 	hashtable.put("6","Real time examples"); 
 	  
 	Object obj = hashtable.remove("2"); 
 	System.out.println(obj + " Removed from Hashtable"); 
 	  
 	Enumeration e=hashtable.elements(); 
 	           
 	// display search result 
 	 while (e.hasMoreElements()) { 
 	        System.out.println(e.nextElement()); 
 	}     
 

 	} 
 	  
 	} 
