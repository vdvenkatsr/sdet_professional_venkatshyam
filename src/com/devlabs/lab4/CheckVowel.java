package com.devlabs.lab4;

import java.util.Scanner;

public class CheckVowel {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter the char: ");
         
         char inpchar = scan.next().charAt(0);//char is at 0th index of the input stream 
         //indices always begin with 0 in Java

         scan.close();
         
         switch(inpchar)
         {
              case 'a'://+
                  System.out.println("The provided char '" +inpchar+ "' is a vowel");
                  break;
              
              case 'e'://-
                  System.out.println("The provided char '" +inpchar+ "' is a vowel");
                  break;
                  
              case 'i'://*
                  System.out.println("The provided char '" +inpchar+ "' is a vowel");
                  break;
                  
              case 'o':
                  System.out.println("The provided char '" +inpchar+ "' is a vowel");
                  break;
              case 'u':
                  System.out.println("The provided char '" +inpchar+ "' is a vowel");
                  break;    
              default: //&, @
                  System.out.println("The provided char '" +inpchar+ "' is not a vowel");
         }
         
            
    }
    }

