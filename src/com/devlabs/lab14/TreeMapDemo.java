package com.devlabs.lab14; 


import java.util.*; 


public class TreeMapDemo { 


	public static void main(String args[]) { 
		TreeMap<Integer, Book> map = new TreeMap<Integer, Book>(); 
		 
 		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8); 
 		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4); 
 		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6); 
 

 		map.put(100, b1); 
 		map.put(102, b2); 
 		map.put(101, b3); 
 		 
 		System.out.println("Before invoking remove() method"); 
 		for (Map.Entry m : map.entrySet()) 
 		{ 
 			Book b = ((Book)m.getValue()); 
 			System.out.println(m.getKey() + " " +b.name + " " + b.author + " " + b.publisher + " " + b.id + " " + b.quantity); 
 		} 
 		 
 		map.remove(102); 
 		 
 		System.out.println("After invoking remove() method"); 
 		for (Map.Entry m : map.entrySet()) { 
 			System.out.println(m.getKey() + " " + m.getValue()); 
 		} 
 	} 
 

 } 
