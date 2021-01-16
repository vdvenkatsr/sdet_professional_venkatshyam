package com.devlabs.lab8; 


public class ReverseStrings { 
 
public static void main(String[] args)  
   { 
	ReverseStrings obj = new ReverseStrings(); 
	 String str = "She sells sea shells on the sea shore"; 
		System.out.println("The input string is: "+str); 
        int len = str.length(); 
        char[] arr1 = new char[len]; 
        char[] arr2 = new char[len]; 
        for (int i = 0; i < len; i++) 
        { 
            arr1[i] = str.charAt(i); 
        } 
         
        for (int j = 0; j < len; j++) 
        { 
            arr2[j] =arr1[len - 1 - j];//arr[len-1] :last index is the length -1 , reading backwards 
        } 
        String revstr = new String(arr2); 
        System.out.println("After reverse operation using char array, the input string becomes: "+revstr); 
         
	/* 
	 * String s5 = " Rohit, Virat, Shikhar, Ashwin "; obj.reverseWordInMyString(s5); 
	 */ 
        String str1 ="Core Java"; 
System.out.println("The reversed string through recursion is:" + obj.reverseStringRecursion(str1)); 
   } 
       
  public void reverseWordInMyString(String s5) //multiple words in your string 
   { 
		 /*The split() method of String class splits a string in several strings based on the 
		 * delimiter passed as an argument to it*/ 
	   
		String[] words = s5.split(","); 
		String reversedString = ""; 
		 
		for (int i = 0; i < words.length; i++) 
	    { 
	           String word = words[i]; //first time it will print the first String value in String array words 
	           String reverseWord = ""; 
	           for (int j = word.length()-1; j >= 0; j--) //reverse looping 
		       { 
	        	   /* The charAt() function returns the character 
	        	    * at the given position in a string 
	        	    */ 
			     reverseWord = reverseWord + word.charAt(j); //She 
		        } 
	           System.out.println("Word:" +reverseWord); 
		        reversedString = reversedString + reverseWord + " "; 
		} 
		System.out.println("Initial String: " +s5); 
		System.out.println("Reversed String: "+reversedString); 
		 
   } 
    
   //Recursion : method calling itself 
   String reverse = ""; 
   public String reverseStringRecursion(String str) 
   { 
          if(str.length() == 1){ 
              return str; 
          } else 
          { 
              reverse = reverse + (str.charAt(str.length()-1) + reverseStringRecursion(str.substring(0,str.length()-1))); 
              //last index is left out : first index is inclusive , last index is exclusive 
              return reverse; 
          } 
      } 
} 
