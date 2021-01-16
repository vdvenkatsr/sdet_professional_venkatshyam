package com.devlabs.lab9; 


 public class ArrayIndexOutOfBoundsEx  
  { 


	    static String printArrayValue(){ 
	        String value =""; 
	    	try 
	        { 
 	           String[] array = new String[]{"one","two","three","four","five"}; 
 	        //Trying to get value at index 10. But the length of array is 5 
 	        //Hence exception is thrown 
 	           value = array[10]; 
 	            
 	        } 
 	        catch(Exception e){ 
 	            System.err.println("Exception is : "+e.toString()); 
 	        } 
 	        return value; 
 	    } 
 	     
 	    public static void main(String[] args) 
 	    { 
 	        String output = printArrayValue(); 
 	        System.out.println("The string is: "+ output); 
 	    } 
 	} 

