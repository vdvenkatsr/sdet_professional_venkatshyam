package com.devlabs.lab1;

public class Car {
    
    static int tyres = 4; //instance variables - for every instance, there will be a copy of instance variables. //object level

    int price; //object level'
    int speed; 
    //static variables, - I dont need an object, but for instance variables, I need an object to display the value.
    

    public static void main(String[] args)
    {
     Car c = new Car(); //creation of object
     
     c.display(); //method call
     c.price = 500000;
     c.speed = 80;
    c.tyres = 8;
     System.out.println("value of speed for c : " + c.tyres); 
     
     Car c1 = new Car();
     c1.display();
     c1.price = 1000000;
     c1.speed = 50;
     
     System.out.println("value of speed for c1: " + c1.speed); 
    }
    
    //method - functionality
    public void display() //m=Audi
    {
        String model ="Merc"; //local variable
        System.out.println("The model is:" + model);
    }

}
