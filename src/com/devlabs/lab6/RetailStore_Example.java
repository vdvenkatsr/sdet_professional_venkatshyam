		package com.devlabs.lab6; 


public class RetailStore_Example { 


	public static void main(String[] args) { 
		int itemA=200,itemB=80,itemC=150; 
		 
		double total_amt; 
		 
 		float disct = 1.0f; 
 		 
 		float amt = 2.0f; 
 		 
 		total_amt = ((3*itemA)+(5*itemB)+(2*itemC)); 
 		 
 		total_amt = total_amt - (.15*total_amt); 
 		 
 	//	total_amt =- 0.15*total_amt; 
 		 
 		total_amt += (0.02*total_amt); 
 		 
 		System.out.println("The amount is: " + total_amt); 
 		 
 		if(total_amt>=2000) 
 		{ 
 			System.out.println("Congrats, won a voucher!"); 
 		} 
 		else 
 		{ 
 			System.out.println("Thanks"); 
 		} 
 

 	} 
 

 } 
