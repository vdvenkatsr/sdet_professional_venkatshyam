
package com.devlabs.lab5;

public class ContinueBreakDemo {

    public static void main(String[] args) 
    {
     for(int i=1;i<=50;i++)
     {
         if(i>30)
         {
             break;
         }
         if(i%2==0)//condition for even numbers
         {
             System.out.println(i);
         }
         else
         {
            continue;
         }
       }
      System.out.println("Getting executed");
     }
        
    }
