package com.devlabs.lab7; 


public class CountVowelConsonant { 


	public static void main(String[] args) { 
        String str = "DevLabsAlliance Company"; 
        int vcount = 0, ccount = 0, scount = 0; 


        //converting all the chars to lowercase 
         str = str.toLowerCase(); 
         for(int i = 0; i < str.length(); i++) 
         {  
         	char ch = str.charAt(i); 
         	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  
         	{  
         		vcount++; 
         	}  
         	else if((ch >= 'a'&& ch <= 'z')) 
         	{ 
                 ccount++; 
             } 
         	else 
         	{ 
         		scount++; 
         	} 
         } 
         System.out.println("Number of Vowels: " + vcount); 
         System.out.println("Number of Consonants: " + ccount); 
         System.out.println("Number of Spaces: " + scount); 
          
     } 
 

 } 
