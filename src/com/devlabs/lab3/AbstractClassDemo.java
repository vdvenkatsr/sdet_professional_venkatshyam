package com.devlabs.lab3; 
 
 
 class AbstractClassDemo 
 {  
     public static void main (String[] args)   
     {  
         // creating the Object of Terrestrial class  
         // and using Animal class reference.  
     	 
     	Animals object3 = new Animals("super"); 
     	 
     	 object3.basicDetails("are animals. "); 
     	  
     	Animals object1 = new Terrestrial("Elephants"); 
     	//reference of the super class - point to a sub class object  
         object1.basicDetails("are terrestrial animals.");  
       //  object1.habitat();  
    //    object1.respiration(); 
      //  object1 = new Aquatic("Fishes"); //polymorphism 
         System.out.println(" ");  
         // creating the Objects of circle class  
          
          
         //Overriding- runtime polymorphism  
          
        Animals object2 = new Terrestrial("Lions"); 
         object2.basicDetails("Lions are terrestrial animals"); 
          
        object2 = new Aquatic("Fishes");  
         object2.basicDetails("are aquatic animals.");  
          
        
          
      //   object2.habitat();  
      //   object2.respiration();  
          
       //  Animals object3 = new Aquatic(); 
          
     }  
 }  
