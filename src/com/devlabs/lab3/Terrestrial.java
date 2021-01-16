package com.devlabs.lab3;

class Terrestrial extends Animals 
{ 
    // constructor 
    Terrestrial(String name) 
    { 
        super(name);
    } 
       
    public void habitat()  
    { 
        System.out.println("live on land");  
    } 
       
    public void respiration()  
    { 
        System.out.println("respire through lungs or trachea");  
    }
}