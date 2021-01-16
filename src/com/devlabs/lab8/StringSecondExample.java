	//validation methods in String API and StringBuffer and StringBuilder 


package com.devlabs.lab8; 


public class StringSecondExample { 


public static void main(String[] args)  
{ 
	String email = "deepti@gmail.com"; 
		String phone = "9872321212"; 
		 
		String pwd = "health7"; 
		 
		//validation 
		if(!email.isEmpty())//if email is not empty 
		{ 
			System.out.println("Email is provided"); 
			if(email.contains("@") && (email.contains("."))) 
			{ 
				System.out.println("Email is valid"); 
			} 
			else 
			{ 
				System.out.println("Email is invalid"); 
			} 
		} 
		else 
		{ 
			System.out.println("Email is empty"); 
		} 


		 
		// Strings are immutable ; StringBuilder and StringBuffer are mutable 
		//concat() - appending  
		String h = "Hello"; 
		String hw = h.concat("World"); 
		System.out.println("hw after concat:   " +hw); 


		 
		//StringBuilder and StringBuffer 
		//StringBuilder : append() 
		//string : concat() StringBuilder and StringBuffer 
		StringBuilder sb1 = new StringBuilder(h); 
		 
		//ctrl+space : to see the methods in API 
		 
		sb1.append("World"); 
		 
		System.out.println("StringBuilder sb1  " +sb1); 
		 
		////StringBuffer 
		StringBuffer sb2 = new StringBuffer("Core"); 
		sb2.append("Java"); 
		System.out.println("StringBuffer sb2   " +sb2); 
		 
		//Runtime Polymorphism in action 
		 
		//Coding to Interfaces : CharSequence is an interface with three concrete child classes 
		 
		//Reference of parent class CharSequence used 
		CharSequence cs; //cs is a reference 
		cs = "Test"; //String literal "Test assigned to cs 
		System.out.println("String case  " +cs); 
		 
		cs = new StringBuilder("builder"); 
		System.out.println("StringBuilder   " +cs); 
		 
		cs = new StringBuffer("buffer"); 
		System.out.println("StringBuffer   " +cs); 
	} 


} 
