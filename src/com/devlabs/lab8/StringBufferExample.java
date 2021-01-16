package com.devlabs.lab8; 


public class StringBufferExample { 


		public static void main(String[] args) { 
			StringBuffer sb = new StringBuffer("She sells sea shells "); 
			System.out.println("Given stringbuffer is: " + sb); 
			System.out.println("length of stringbuffer is: " + sb.length() + ", capacity of stringbuffer is: " + sb.capacity()); 
			System.out.println("character at index 5 of the stringbuffer is: " + sb.charAt(5)); 
 			System.out.println("codePointAt index 5 of the stringbuffer is: " + sb.codePointAt(5)); 
 			System.out.println("appending the stringbuffer: " + sb.append("on the sea shore")); 
 			System.out.println("substring of stringbuffer from index 10 to 20 is: " + sb.substring(10,20)); 
 			System.out.println("reverse of the stringbuffer is: " + sb.reverse()); 
 		} 
 	} 
  
