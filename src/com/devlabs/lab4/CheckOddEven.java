package com.devlabs.lab4;



	import java.util.*;

	public class CheckOddEven
	{
	        public static void main(String[] args)
	   {
	        // TODO Auto-generated method stub
	        
	        //import statement for the java.util.package
	        //we pass the input stream to the constructor as an argument
	        //use the correct next<datatype>() to get the value and store it in a variable of right datatype
	        
	        Scanner reader = new Scanner(System.in);
	        System.out.println("Enter the Number : ");
	        
	        int num = reader.nextInt();
	        
	        reader.close();
	        
	        if(num%2 == 0)
	        {
	            //condition is true
	            System.out.println("Number is even");
	        }
	        else
	        {
	            //condition is false
	            System.out.println("Number is odd");
	        }
	    }
	}
