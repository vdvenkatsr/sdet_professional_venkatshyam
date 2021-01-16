package com.devlabs.lab9; 
import java.util.*; 


public class InputMismatchExceptionEx  
{ 
    static void numberConversion(int input) 
    { 
        try{ 
        	int result = input +10; 
         	System.out.println("Output:" + result); 
           //  int number = Integer.parseInt(input); //Integer is a wrapper class.  
             //parseInt() is a method in Integer class which takes a string input and converts it into a number. 
            // System.out.println("The input integer after conversion is : "+number); 
         } 
         catch(InputMismatchException e){ 
         	e.printStackTrace(); 
             //System.out.println("Error encountered while converting input to integer"); 
         } 
     } 
      
     public static void main(String[] args) { 
         Scanner scanner = new Scanner(System.in); 
         System.out.println("Enter the integer : "); 
         int input = scanner.nextInt(); 
         scanner.close(); 
         numberConversion(input); 
         System.out.println("Reaching here"); 
     } 
 } 
