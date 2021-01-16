 package com.devlabs.lab8; 


//import java.util.Scanner; 
public class ReverseStringsRecursion { 


	        String reverse = ""; 
	          
	        public String reverseString(String str){ 
	              
 	            if(str.length() == 1){ 
 	                return str; 
 	            } else { 
 	                reverse += str.charAt(str.length()-1) 
 	                        +reverseString(str.substring(0,str.length()-1)); 
 	                return reverse; 
 	            } 
 	        } 
 	          
 	        public static void main(String args[]){ 
 	        	ReverseStringsRecursion srr = new ReverseStringsRecursion(); 
 	            System.out.println("Result: "+srr.reverseString("Begin Java")); 
 	        } 
 	    } 
