package com.devlabs.lab5;



import java.util.*;

public class CheckPrimeWhile {

    public static void main(String[] args)
   {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the no:");
        int num = scan.nextInt();
        
        scan.close();
        
        boolean flag = false;
        int i=2;//initialization
        while(i<=num/2) //No number is divisible by more than its half //test expresssion
        {
          if(num%i ==0)
          {
            flag=true;
          }
          else
          {
            flag= false;
          }
          i++;//update the condition
        }
        
        if(flag)
        {
            System.out.println(num + " is not a prime number");
        }
        else
        {
            System.out.println(num + " is a prime number");
        }
       
    }

}
