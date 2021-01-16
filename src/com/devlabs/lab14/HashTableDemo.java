package com.devlabs.lab14; 
import java.util.*; 


public class HashTableDemo { 


	public static void main(String args[]) {   
		  Hashtable<Integer,String> map=new Hashtable<Integer,String>();       //key-value pairs //no order maintained  
		     map.put(100,"Meena");    //add an entry : a key-value pair 
		     map.put(102,"Deepa");    
 		     map.put(111,"Deepa");     
 		     map.put(103,"Sheela");     
 		      
 		    Set<Integer> keys =  map.keySet(); 
 		     
 		     for(int i:keys) 
 		     { 
 		    	 System.out.println("For key" +i + ", the value is: " +map.get(i)); 
 		    	  
 		     } 
 		      
 		    // Entry is an interface inside Map interface : Nested Interface that gives you a set of entries :  
 		     //one entry has both the key and the value 
 		   /*  for(Map.Entry<Integer,String> m: map.entrySet()) //set of entries : key-value pair 
 		      {     
 		       System.out.println(m.getKey()+"- "+m.getValue());     
 		      }  
 		      
 		      
 		     System.out.println("Before remove: "+ map);  
 		     System.out.println("" + map.get(103)); //get() used for getting the value corresponding to the key 
 		       // Remove the entry for key 102   
 		       map.remove(102); 
 		        
 		     // map.remove(102, "Seema"); 
 		       System.out.println("After remove: "+ map);   
 		        
 		     //Here, we specify the if and else statement as arguments of the method   
 		       
 		          System.out.println(map.getOrDefault(105, "Not Found"));  
 		        
 		     //Inserts, as the specified pair is unique   
 		       map.putIfAbsent(104,"Reena");   
 		       System.out.println("Updated Map: "+map);   
 		       //Returns the current value, as the specified pair already exist   
 		       map.putIfAbsent(101,"Deepa");   
 		       System.out.println("Updated Map: "+map);   
 		        
 		       System.out.println(map.getOrDefault(105, "Not Found"));  
 		   }      */ 
 		}   
 } 
