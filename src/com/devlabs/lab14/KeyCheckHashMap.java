package com.devlabs.lab14; 
import java.util.*; 
import java.util.Map.Entry; 


public class KeyCheckHashMap { 


	public static void main(String[] args) { 
	   
	//create an Hashmap object 
 	HashMap<String, String> hashmap = new HashMap(); 
 	        
 	//Add key values pairs to hashmap 
 	         
 	hashmap.put("1","One"); 
 	hashmap.put("2","Two"); 
 	hashmap.put("3","Three"); 
 	hashmap.put("4","Four"); 
 	hashmap.put("5","Five"); 
 	hashmap.put("6","Six");        
 	  
 	 /* 
 	  To check whether a particular key exists in HashMap use 
 	   boolean containsKey(Object key) method of HashMap class. 
 	  containsKey(Object key) returns true if the HashMap contains mapping for specified key 
 	  otherwise false. 
 	 */ 
 	  
 	boolean isExists = hashmap.containsKey("4"); 
 	System.out.println("4 exists in HashMap ? : " + isExists); 
 	  
 	if(!hashmap.isEmpty()){ 
 	  
 	Iterator it=hashmap.entrySet().iterator(); 
 	              
 	while(it.hasNext()){ 
 

 		Map.Entry obj=(Entry)it.next(); 
 	System.out.print(obj.getKey()+" "); 
 	System.out.println(obj.getValue()); 
 	              
 	}            
 	}    
 	  
 	} 
 	  
 	} 
