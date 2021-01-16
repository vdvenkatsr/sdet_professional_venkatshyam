package com.devlabs.lab3;
 public class Product 
	{
	    //constructor
	    /*
	     * Product() { System.out.println("--Product object is getting created------");
	     * }
	     */
	    
	    //attributes or properties --INSTANCE VARIABLES
	    int pid;
	    int price;
	    String name;
	    
	    //behaviour
	    public void setProductDetails(int pid, int price, String name) //parameters
	    {
	        //this is a keyword to indicate this object
	        
	         this.pid= pid; 
	         this.price = price; 
	         this.name=name;
	    
	    }
	    
	    void showProductDetails()
	    {
	        System.out.println("ProductId is" +pid);
	        System.out.println("Price is" +price);
	        System.out.println("Name is" +name);
	    }
	    
	    public int getPid() {
	        return pid;
	    }
	    public void setPid(int pid) {
	        this.pid = pid;
	    }
	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int price) {
	    		   this.price = price;
    }



    public String getName() {
    return name;
    }



    public void setName(String name) {
    this.name = name;
    }



    /*public static void main(String[] args) {
    // TODO Auto-generated method stub



    Product p1 = new Product();
    p1.setProductDetails(1,234,"Pen");
    p1.showProductDetails();
    }*/



    }


