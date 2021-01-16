package com.devlabs.lab10; 


public class ExceptionOverriding { 
	 
	public static void main(String[] args) { 


		 Super obj = new Super(); 
		 try { 
		            obj.show(); 
 		} catch (ArithmeticException e) { 
 		          
 		            e.printStackTrace(); 
 		} 
 		  
 		} 
 		  
 		} 
 

 	class Super { 
 	  
 	public void show() throws RuntimeException{ 
 	         
 	 System.out.println("Super class show() method"); 
 	  
 	} 
 	  
 	} 
 	class Sub extends Super { 
 	  
 	     
 	public void show() throws ArithmeticException{ 
 	         
 	        System.out.println("Sub class show() method"); 
 	 }} 
 

  
