package com.devlabs.lab2;

public class Product
{
    //constructor
    
    Product()
    {
            System.out.println("-----Product1 object created---------");    
    }
 
    Product(int pid,int price,String name)
    {
            System.out.println("-----Product2 object created---------");    
            this.pid = pid;
            this.price = price;
            this.name = name;
    }
  
            
    //attributes (instance variables) - State
    int pid;
    int price;
    String name;
    
    
    //behaviour
    
    void setProductDetails(int pid,int price, String name) //formal parameters
    {
        //this here stands for this object. 
        //LHS is the instance variables, RHS is my values that I pass through arguments or the parameters
        //p1.setProductDetails(45,3500,"Machine");
        this.pid = pid;
        this.price = price;
        this.name = name;
        //LHS belongs to the object, RHS belongs to the method
    }
    
    void showProductDetails()
    {
        System.out.println("----ProductID-----" + pid);
        System.out.println("----Price-----" + price);
        System.out.println("----Name-----" + name);
    }
    
    public static void main(String[] args)
    {
        Product p1 = new Product();//no-arg constructor
        p1.setProductDetails(23, 3400, "Phone");
        p1.showProductDetails();
        
        Product p2 = new Product(50,28000,"IPad");//no-arg constructor
        //p1.setProductDetails(23, 3400, "Phone");
        p2.showProductDetails();
    }

}