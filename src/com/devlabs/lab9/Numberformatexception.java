package com.devlabs.lab9; 


public class Numberformatexception { 


	public static void main(String args[]) { 
		try { 
			int num = Integer.parseInt("kjhkjhjhjkhjkhk"); 
			System.out.println(num); 
		} catch (NumberFormatException e) { 
 			System.out.println("Number format exception occurred"); 
 		} 
 	} 
 } 
