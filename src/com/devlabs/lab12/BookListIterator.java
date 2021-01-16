	package com.devlabs.lab12; 
import java.util.*; 
	  
	public class BookListIterator { 


	public static void main(String[] args) { 
	   
	//create an ArrayList object 
	ArrayList<String> bookList = new ArrayList(); 
 	        
 	//Add elements to Arraylist 
 	  
 	bookList.add("Core Java"); 
 	bookList.add("Hibernate Basics"); 
 	bookList.add("Servlets n JSP"); 
 	bookList.add("Spring Framework"); 
 	bookList.add("DevOps Principles"); 
 	 
 	 /* 
 	Get a ListIterator object for ArrayList using 
 	istIterator() method. 
 	*/ 
 	  
 	ListIterator itr = bookList.listIterator(); 
 	        
 	/* 
 	Use hasNext() and next() methods of ListIterator to iterate through 
 	the elements in forward direction. 
 	*/ 
 	System.out.println(""); 
 	 
 	System.out.println("Iterating through ArrayList elements in forward  direction..."); 
 	  
 	while(itr.hasNext()) 
 	{ 
 		System.out.println(itr.next()); 
 	} 
 	      
 	/*Use hasPrevious() and previous() methods of ListIterator to iterate through 
 	the elements in backward direction.*/ 
 	  
 	System.out.println("Iterating through ArrayList elements in backward direction..."); 
 	         
 	while(itr.hasPrevious()){ 
 		System.out.println(itr.previous()); } 
 	   
 	} 
 	  
 	} 
