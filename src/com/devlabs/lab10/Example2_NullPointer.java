package com.devlabs.lab10; 


public class Example2_NullPointer { 


	    static void getLength(String text){ //static methods can be called wiothout object creation. 
	    	//they are at class level 
	       try{ 
	        	if(text.length()!=0) 
	 	        { 
 	 	            //Pass null as input if input is empty 
 	 	            text = null; 
 	 	        } 
 	            System.out.println("Length of the input string is  : "+text.length()); 
 	            }catch(NullPointerException e){ 
 	        	// e.printStackTrace(); 
 	            System.out.println("Exception while trying to find length of input : "+e.toString()); 
 	        } 
 	    } 
 	     
 	    public static void main(String[] args) { 
 	        
 	        String text= null; 
 	        getLength(text); 
 	        System.out.println("Reaching here"); 
 	    } 
 	} 
