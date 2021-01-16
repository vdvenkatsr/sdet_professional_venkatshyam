package com.devlabs.lab13; 
import java.util.*; 


public class ConvertTreeSetToArray { 


	public static void main(String args[]) { 
	//create TreeSet object 
	 TreeSet<Integer> treeSet = new TreeSet<Integer>(); 
	        
 		//add elements to TreeSet 
 	  treeSet.add(1); 
 	  treeSet.add(3); 
 	  treeSet.add(2); 
 	  treeSet.add(5); 
 	  treeSet.add(6); 
 	  treeSet.add(7); 
 	  treeSet.add(8); 
 	  treeSet.add(9); 
 	  treeSet.add(10); 
 	         
 	   Object[] objArray = treeSet.toArray(); //expects the return type as an Object array 
 	     //display contents of Object array 
 	  
 	   System.out.println("TreeSet elements are copied into an Array. Now Array Contains.."); 
 	  
 	  for(int index=0; index < objArray.length ; index++) 
 	      System.out.print(" " + objArray[index]); 
 } 
 } 
