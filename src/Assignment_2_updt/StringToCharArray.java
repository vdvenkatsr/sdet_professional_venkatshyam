package Assignment_2_updt;

import java.util.Arrays; 


public class StringToCharArray { 
	 
	public static void main(String[] args) { 
		 String str = "TEST";  
		char[] charArr = str.toCharArray(); 
 		System.out.println("String converted to char array: " + Arrays.toString(charArr)); 
 		 
 		char[] charArray = {'T','E','S','T'}; 
 		 String str2 = new String(charArray); System.out.println(str);  
 	  
 } 
}