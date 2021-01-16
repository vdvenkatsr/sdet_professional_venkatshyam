	package com.devlabs.lab2; 


public class VariableTypesDemo { 


	int inst1 = 34; 
	static int inst2 = 12; 
	 
	public static void main(String[] args)  
	{ 
 	 VariableTypesDemo v1 = new VariableTypesDemo(); 
 	 double val = 6.2; 
 	 double val2 = 3.1; 
 	 System.out.println("The value of static variable is:" + inst2); 
 	 System.out.println("The value of instance variable is:" + v1.inst1); 
 	 System.out.println("The value of product is:" + v1.calcValue(val,val2)); 
 	  
 	 System.out.println("The value of first local variable is:" + val); 
 	 System.out.println("The value of second local variable is:" + val2); 
 	} 
 	 
 	public double calcValue(double a, double b) 
 	{ 
 		double prod = a*b; 
 		return prod; 
 	} 
 } 
