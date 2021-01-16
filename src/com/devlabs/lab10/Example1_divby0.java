//program to demonstrate Arithmetic Exception 
 

 package com.devlabs.lab10; 
 

 public class Example1_divby0 { 
 

 		public static void main(String[] args) 
 		{ 
 			int num1,num2,num3; 
 			 
 			num1=20; 
 			num2=0; 
 			 
                      
 			//try-catch 
 		try{ 
 				 
 			num3=num1/num2; //20/0 
 				 
 			System.out.println("Result is: " + num3); 
 			 
 			} 
 			//multiple catch blocks are possible. Specific Exceptions need to  
 			//preceed the generic Exception catch block. 
 		 
 		catch(ArithmeticException ae) //catch(Exception e) 
 		{ 
 			ae.printStackTrace(); 
 			ae.toString(); 
 		} 
 		catch(Exception e) 
 		{ 
 			//handles all kinds of exceptions 
 			//toString() which gives you a string representation of an object 
 			e.printStackTrace(); 
 		} 
 			 
 		num3=num1+num2; 
 		System.out.println("Result after addition is "+num3); 
 		} 
 	} 
