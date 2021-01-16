package com.devlabs.lab4;

import java.util.Scanner;

public class Postiveornegative
{
	
	public static void main(String[] args) 
	{
			int n;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("Enter the number:");
	      
	      n = scan.nextInt();
	      
	      scan.close();
		if(n  > 0)
		{
			System.out.println("positive number ");
		}
		else
		{
			System.out.println("negative number ");
		}
		

	}

}
