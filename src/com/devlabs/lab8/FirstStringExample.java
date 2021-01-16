	package com.devlabs.lab8; 


public class FirstStringExample { 


	public static void main(String[] args) { 
		 
		String str1 = "Hello"; //str1 and str2 are two reference variables pointing to the same string literal 
		String str2 = "Hello"; 
		 
 		String str3 = new String("Hello"); //2 string objects created in Heap area with contents as Hello 
 		String str4 = new String("hello"); 
 				 
 		char ch[] = {'s','t','r','i','n','g','s'}; 
 		String s2 = new String(ch); //new string object created with the elements from a character array 
 		System.out.println(s2); 
 					 
 		 
 		//comparison of strings 
 		//str1 and str2 are both pointing to the same memory location, the same string literal 
 		//str3 and str4 are two String objects in memory both having a value of "Hello" 
 		 
 		//== compares hashcodes and not content //shallow comparison : memory locations checked  
 		  if(str3==str4)  
 		  { 
 		      System.out.println("str3==str4"); }  
 		  else  
 		  {  
 			  System.out.println("str3!=str4"); 
 		 } 
 		   
 		/* *  
 		 *  
 		 * if(str3==str4) { System.out.println("str3==str4"); } else { 
 		 * System.out.println("str3!=str4"); } 
 		 *  */ 
 		   
 		  //equals() and equalsIgnoreCase() compares content and not the reference variables  
 		//false /true  
 		   
 	    if(str3.equalsIgnoreCase(str1)) //Hello compared to hello 
 		 { 
 		      System.out.println("str3 is equal to str1");  
 		 }  
 		 else 
 		 { 
 		      System.out.println("str3 is not equal to str1"); 
 		 } 
 		  
 		//ctrl+shift+/ : to coment out a section of code 
 		  
 		//compareTo() : 0 means equal, >0 means str3 is greater than str4 and <0 means str3 is lesser than str4 
 		  if(str3.compareToIgnoreCase(str1)==0)  
 		  { 
 		    System.out.println("str3 is equal to str1 by compareTo");  
 		  }  
 		  else 
 		  { 
 		   System.out.println("str3 is not equal to str1 by compareTo"); 
 		   } 
 		  
 		 
 		//length() : gives me the length of the string 
 		   
 		String s5 = "Rohit,Virat,Shikhar,Ashwin"; 
 				 
 		int len = s5.length(); //arrays have length whereas Strings have length() : arr.length 
 		 
 		System.out.println("Length of s5 is: " + len); 
 		 
 		//charAt() 
 		char c1 = s5.charAt(10); //9 is the index 
 		System.out.println(c1); 
 		 
 		//immutable : cannot be changed 
 		  //toUpperCase() toLowerCase() 
 		 
 		//s5.toUpperCase(); no change reflected - strings are immutable 
 		 
 	//	s5 = s5.toUpperCase(); 
 		 
 		System.out.println("s5 in upper case is: " + s5); 
 		//*/ 
 		 
 		//contains - checking whether a string is present of not : searching 
 		if(s5.contains("Shikhar")) 
 		{ 
 			System.out.println("Shikhar is present"); 
 		} 
 		 
 		//indexOf : considers the case 
 		int index1 = s5.indexOf("Virat"); 
 		System.out.println("Index of Virat: " +index1);		 
 			 
 		//lastIndexOf  
 		int index2 = s5.lastIndexOf("i"); 
 		System.out.println("Last Index:" +index2); 
 		 
 		//replace 
 		String s10 = s5.replace('i','u'); 
		System.out.println("Altered String with u: "+s10); 
		 
		System.out.println("----------------------------------------"); 
		 //subString() : a portion of the string 
		String s8 = s5.substring(6); //start from 6th index and print till the end of the string : includes the index mentioned 
		System.out.println("Substring 1 is: "+s8); 
		 
		//overloading 
		 
		String s9 = s5.substring(6,11); //prints the string from 6th index till 9th index 
		//last Index is not included, only the first index is included 
		System.out.println("Substring 2 is: "+s9); 
		System.out.println("----------------------------------------"); 
		 
		 
		//convert to CharArray 
		char[] arr = s5.toCharArray(); 
		for(char ch2: arr) 
		{ 
			System.out.println(ch2 + ""); 
		} 
		 
		//split() 
		String[] strArr = s5.split(",");//strArr will have 4 values 
		//for-each 
		for(String s: strArr) 
		{ 
			System.out.println(s.trim()); 
		} 
		 
	} 


} 
