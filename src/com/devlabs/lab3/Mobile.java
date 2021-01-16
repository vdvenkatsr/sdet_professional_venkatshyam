package com.devlabs.lab3;

public class Mobile extends Product
{
   String brand;
   String os;
   int ram;
   
   Mobile()
   {
       System.out.println("-------Mobile object created---------");
   }
    
   //method overloading : same name, same method as parent but different set of attributes
   //same name, different parameters : OVERLOADING
   public void setProductDetails(int pid, int price, String name,String brand,String os,int ram) //parameters
    {
        //this is a keyword to indicate this object
        
         this.pid= pid; 
         this.price = price; 
         this.name=name;
         this.brand= brand; 
         this.os = os; 
         this.ram=ram;
    }
        
   //method overrriding
      //one version in parent class, one version in child class
   //same method, same attributes - OVERRIDING
   void showProductDetails()
    {
        System.out.println("ProductId is" +pid);
        System.out.println("Price is" +price);
        System.out.println("name is" +name);
        System.out.println("brand is" +brand);
        System.out.println("os is" +os);
        System.out.println("ram is" +ram);

    }
   
   public static void main(String[] args)
   {
      Product  pr1 = new Product();
      pr1.setProductDetails(10, 30000, "ledtv");
      pr1.showProductDetails();
      
    /*  pr1 = new Mobile();
      pr1.setProductDetails(11, 54000, "IPhone");
      pr1.showProductDetails();*/
      
    Mobile mb = new Mobile();
      mb.setProductDetails(40,40000,"galaxy1");
      mb.setProductDetails(41,40000,"Galaxy","Samsung","Android",256);
      
      mb.showProductDetails();
      
   }
}

 


 
