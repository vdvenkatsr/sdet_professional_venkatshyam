package com.devlabs.lab10; 


public class FinalizeExample { 


		  public void finalize() throws Throwable { 
		            try{ 
		                System.out.println("Inside Finalize() method of Sub Class : B"); 
		            }catch(Throwable t){ 
		                throw t; 
 		            } 
 		            finally 
 		            { 
 		                System.out.println("Calling finalize() method of Super Class:  Object"); 
 		                super.finalize(); 
 		            } 
 		          
 		 } 
 		  
 		public static void main(String[] args) throws Throwable{ 
 		        FinalizeExample obj= new FinalizeExample(); 
 		        obj.finalize(); 
 		         
 		         
 		        } 
 		} 
