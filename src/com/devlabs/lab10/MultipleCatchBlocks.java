
 //Open this file in GitHub Desktop  You must be signed in to make or propose changes  You must be signed in to make or propose changes 


package com.devlabs.lab10; 
import java.util.*; 
import java.io.*; 


public class MultipleCatchBlocks { 


	    public static void main(String args[]) 
	    {  
	        Scanner scanner = new Scanner(System.in); 
 	        System.out.println("Enter the divisor to divide 100 : "); 
 	        int divisor = scanner.nextInt(); 
 	        scanner.close(); 
 	        try 
 	        { 
 	            int[] array=new int[10];  
 	            int result = 100/divisor;  
 	            //if an exception occurs inside try, rest of the try block in not executed. 
 	            //control goes to the most specific exception block, if written. Else looks for generic Exception block 
 	            //else throws an exception n program terminates abruptly. 
 	            array[11]=result; 
 	            FileOutputStream fs = new FileOutputStream("ABC.txt"); 
 	        } 
 	        catch(ArithmeticException e) 
 	        { 
 		            System.out.println("Arithmetic exception has occurred"); 
 		    } 
 	        catch(IOException ie)//FileNotFoundException 
 	        { 
 	            System.out.println("IO Exception has occurred"); 
 	        } 
 	        
 		/* 
 		 * catch(ArrayIndexOutOfBoundsException e) { 
 		 * System.out.println("Array Index Out Of Bounds Exception has occurred"); } 
 		 * catch(Exception e) { System.out.println("Common exception has occurred"); } 
 		 */ 
 	             
 	    } 
 	} 
