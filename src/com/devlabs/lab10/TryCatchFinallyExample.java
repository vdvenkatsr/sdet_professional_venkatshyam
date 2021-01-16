package com.devlabs.lab10; 
import java.util.*; 


public class TryCatchFinallyExample { 


	    static void divide(int num1, int num2){ 
	        try{   
	            int result=num1/num2;   
	            System.out.println("Result after division : "+result);   
 	        } 
 	        catch(ArithmeticException e){ 
 	            System.out.println("Exception while performing division : "+e.toString()); 
 	        } 
 	       finally 
 	        { 
 	            System.out.println("I am inside finally block"); 
 	        }  
 	        
 	    } 
 	     
 	    public static void main(String args[]){ 
 	        Scanner scanner = new Scanner(System.in); 
 	        System.out.println("Enter number 1 : "); 
 	        int num1 = scanner.nextInt(); 
 	        System.out.println("Enter number 2 : "); 
 	        int num2 = scanner.nextInt(); 
 	        divide(num1,num2); 
 	        scanner.close(); 
 	        System.out.println("Finally block is always executed even when there is an exception"); 
 	    } 
 	} 
