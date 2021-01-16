	package com.devlabs.lab3; 


public class BMW implements VehicleInterface1 
{ 
	 
	int gear, increment, decrement, speed =30; //declaration of my instance variables 


	public void applyBrakes(int dec) //dec is my formal parameter 
	{ 
 		speed = speed - dec; 
 	} 
 	 
 	public void changeGear(int gear) 
 	{ 
 		this.gear = gear; 
 	} 
 	 
 	public void speedUp(int inc) 
 	{ 
 		speed = speed + inc; 
 	} 
 	 
 	public void displayStats() 
 	{ 
 		System.out.println("Speed" + speed + "and gear:" +gear); 
 	} 
 	 
 	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 		 
 		BMW b = new BMW(); 
 		b.gear= 4; //member variables or attributes or instance variables  
 		b.speed=30; 
 		b.applyBrakes(2); //calling member function by passing a value 
 		 
 		System.out.println("Gear is: " +b.gear); 
 		b.changeGear(3); 
 		System.out.println("Gear is: " +b.gear); 
 		 
 		b.speedUp(1); 
 		b.displayStats(); 
 		 
 		//	System.out.println("Private Access check" + c.data); 
 		 
 	} 
 

 } 
