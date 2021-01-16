package com.devlabs.lab10; 


import java.io.*; 


public class MethodOverridingExceptions { 
	public static void main(String[] args) { 
		Super1 obj = new Sub1(); // runtime polymorphism 
		try { 
			obj.show(); 
 		} catch (Exception e) { 
 			e.printStackTrace(); 
 		} 
 

 	} 
 } 
 

 // ------------------------------------------------------------------------------------------------------------------------------------------ 
 // When super class method does not have any throws exception then we can add 
 // throws unchecked exception in subclass overridden method, not checked 
 // exception 
 // super : none 
 // sub: nullpointer exception :unchecked exception 
 

 /* 
  * class Super1 { public void show() { 
  * System.out.println("Super class show() method"); } } 
  *  
  * class Sub1 extends Super1 { public void show() throws NullPointerException { 
  *  
  * System.out.println("Sub class show() method"); } } 
  */ 
 

 // ---------------------------------------------------------------------------------------------------------------------------------------------- 
 // When super class method does not have any throws exception then we can not 
 // add throw checked exception in subclass overridden method. 
 // super- none , sub - throws IO exception(checked exception) 
 

 /* 
  * class Super1 { 
  *  
  * public void show() {//no throws clause 
  *  
  * System.out.println("Super class show() method"); 
  *  
  * } 
  *  
  * } class Sub1 extends Super1 { public void show() throws IOException { 
  * //unchecked is fine, checked is not 
  *  
  * System.out.println("Sub class show() method"); } 
  *  
  * } 
  */ 
 

 // ---------------------------------------------------------------------------------------------------------------------------------------------- 
 // When super class method throws checked exception then we can add throws same 
 // checked exception in subclass overridden method. 
 // super IO, sub IO 
 

 /* 
  * class Super1 { public void show() throws IOException{ 
  * System.out.println("Super class show() method"); } } 
  *  
  * class Sub1 extends Super1 { public void show() throws IOException{ 
  * System.out.println("Sub class show() method"); 
  *  
  * } } 
  */ 
 

 // ---------------------------------------------------------------------------------------------------------------------------------------- 
 

 // When super class method throws unchecked exception then we can not add throws 
 // checked exception in subclass overridden method. 
 // super arithmetic, sub IOexception 
 

 /* 
  * class Super { public void show() throws ArithmeticException { 
  * System.out.println("Super class show() method"); } 
  *  
  * } class Sub extends Super { 
  *  
  * public void show() throws IOException { 
  * System.out.println("Sub class show() method"); } } 
  */ 
 

 // -------------------------------------------------------------------------------------------------------------------------------------------- 
 // When super class method throws checked exception then we can not add throws 
 // its parent exception in subclass overridden method. 
 // super FileNotfound sub IOException 
 

 /* 
  * class Super { 
  *  
  * public void show() throws FileNotFoundException{ //FIleNotfound is a child of 
  * IO 
  *  
  * System.out.println("Super class show() method"); 
  *  
  * } 
  *  
  * } class Sub extends Super { 
  *  
  * public void show() throws IOException{ 
  *  
  * System.out.println("Sub class show() method"); } 
  *  
  * } 
  */ 
 // -------------------------------------------------------------------------------------------------------------------------------------- 
 // When sub class throws child exception of the parent class 
 // holds true for checked as well as unchecked 
 

 class Super1 {// parent or superclass 
 

 	public void show() throws IOException { // IOException is checked exception 
 

 		System.out.println("Super class show() method"); 
 

 	} 
 } 
 

 class Sub1 extends Super1 { // child or subclass 
 

 	public void show() throws FileNotFoundException { // show() overridden 
 		// FileNotFound is a child of IO 
 

 		System.out.println("Sub class show() method"); 
 	} 
 } 
