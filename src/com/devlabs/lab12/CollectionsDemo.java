package com.devlabs.lab12; 


import java.util.*; 


public class CollectionsDemo { 


	 public static void main(String a[]){          
	        List<String> list = new ArrayList<String>();   
	        list.add("dog");   
 	        list.add("cat");   
 	        list.add("tiger");   
 	        list.add("bull");   
 	         
 	        List<String> list2 = new ArrayList<String>(); 
 	        list2.add("camel"); 
 	        list2.add("jaguar"); 
 	         
 	        System.out.println("Value of maximum element from the collection: "+Collections.max(list));   
 	        System.out.println("Value of minimum element from the collection: "+Collections.min(list));  
 	         
 	        //addAll 
 	        Collections.addAll(list,"elephant","whale"); 
 	        System.out.println("The list2 after addAll is "+list);  
 	         
 	        Collections.sort(list);  
 	        System.out.println("The sorted list is: "+list);  
 	         
 	        Collections.copy(list,list2); //first the destination 
 	        System.out.println("The copied list is: "+list);  
 	         
 	         
 	         
 	    }   
 

 } 
