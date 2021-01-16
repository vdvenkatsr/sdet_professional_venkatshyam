package com.devlabs.lab5; 
import java.util.*; 


public class GenerateTable { 


	public static void main(String[] args) { 
	    
	   Scanner scan = new Scanner(System.in); 
	   System.out.println("Enter the number for which the table to be generated: "); 
 	   int num = scan.nextInt(); 
 	   scan.close(); 
 	    
        for(int i = 1; i <= 10; ++i) 
        { 
 		  System.out.printf("%d * %d = %d \n", num, i, num * i); 
        } 
 	} 
 } 
