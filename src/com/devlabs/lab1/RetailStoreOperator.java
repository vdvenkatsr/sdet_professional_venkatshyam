package com.devlabs.lab1;

public class RetailStoreOperator {

	public static void main(String[] args)
		{
		
		int length = 2, breadth = 8;
		
		int a = 5, b = 12;
		
		double area;
		double permeter;
		
		double reminder;
		double quoitent;
		
		area = ((length) * (breadth));
		permeter = 2*(length) + (breadth);
		
		reminder = ((b) % (a));
				quoitent = 	((b) / (a));	
		
		System.out.println("Area of rectangle is:" + area);
		System.out.println("Permeter of rectangle is:" + permeter);
		System.out.println("Quiotent is:" + quoitent);
		System.out.println("reminder is:" + reminder);
	}

}
