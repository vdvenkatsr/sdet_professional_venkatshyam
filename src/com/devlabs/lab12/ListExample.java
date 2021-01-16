package com.devlabs.lab12; 
import java.util.*;   


	public class ListExample 
	{   
		public static void main(String args[]) 
		{   
			//coding to interfaces : keeping the referecnes of the parent type and poitning to child type objects 
		 List al = new ArrayList(34);   
 		//System.out.println("size is:" + al.size()); 
 		 
 		 //can contain mulitple data types 
 		 //can dynamically grow n shrink 
 		 //can contain null elements also 
 		 //insertion order maintained 
 		 
 		 //different data types in one list : possible 
 		 //insertion and removal both from the middleof the list, using indices is possible. 
 		 //add(value) 
 		al.add("Amit");  //add is the method for insertion 
 		al.add(true);//boolean 
 		al.add('v');  //char 
 		al.add(null);   
 		al.add("sdfsdfds");//String 
 		al.add(45354);//int 
 		al.add(345); 
 		al.add("Deepti"); 
 		al.add(454545454); 
 		for(int j=0;j<al.size();j++) 
 		{   
 		  System.out.println("" +al.get(j));  //get() is used to fetch the value at a particular index 
 		}   
 		//add(index, value) 
 		 
 		al.add(1,"Sachin");   
 		System.out.println("The element at 2nd position: "+al.get(1)); 
 		 
 		 
 		//arr[index] in case of arrays - arrlist.get(index) 
 		 
 		for(int j=0;j<al.size();j++) 
 		{   
 		  System.out.println("" +al.get(j));  //get() is used to fetch the value at a particular index 
 		}   
 	   }   
 	}   
