package com.devlabs.lab10; 
import java.util.*; 


public class CustomExceptionExample { 


	    public static void validateInput(int number) throws InvalidInputException 
	    { 
	        if(number>100){ 
	            throw new InvalidInputException("Exception"); 
 	        }else{ 
 	            System.out.println("The provided input is valid"); 
 	        } 
 	    } 
 	     
 	    public static void main(String[] args) { 
 	        Scanner scanner = new Scanner(System.in); 
 	        System.out.println("Enter a number less than 100 :  "); 
 	        int number = scanner.nextInt(); 
 	        scanner.close(); 
 	        try 
 	        { 
 	            validateInput(number); 
 	        }catch(InvalidInputException e){ 
 	        	e.printStackTrace(); 
 	            System.out.println("Caught Exception - Input is greater than 100"); 
 	        } 
 	    } 
 	} 
 

 	class InvalidInputException extends Exception 
 	{   
 	    InvalidInputException(String exceptionText){   
 	        super(exceptionText);   
 	    }     
 	} 
