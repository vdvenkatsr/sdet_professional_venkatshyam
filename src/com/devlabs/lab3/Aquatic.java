
package com.devlabs.lab3; 
 
 
 class Aquatic extends Animals 
 {  
     // constructor  
 	 
 	Aquatic() 
 	{ 
 		System.out.println("Aquatic here"); 
 	} 
 	 
     Aquatic(String name)  
     {  
     	// System.out.println(""); 
         super(name);//explicit call to the parent class's constructor //first line in the constructor 
     }  
         
     public void basicDetails(String details) //concrete method 
     {  
     	System.out.println("---aquatic----");  
         System.out.println(name + " " + details);  
     } 
      
    /* @Override 
     public void habitat()   
     {  
         System.out.println("live in water");   
     }  
         
     @Override 
     public void respiration()   
     {  
         System.out.println("respire through gills or their skin");   
     }*/ 
 } 
