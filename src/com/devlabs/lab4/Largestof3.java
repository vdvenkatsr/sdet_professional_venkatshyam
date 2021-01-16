package com.devlabs.lab4;

public class Largestof3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a=2, b=5, c=20;
        
        if (a>b && a>c)
        {
            System.out.println("Largest number : "+a);
        }
        else if (b>a && b>c) {
            System.out.println("Largest number : "+b);
        }
        else
        {
            System.out.println("Largest number : "+c);
        }
            
        
    }

}
