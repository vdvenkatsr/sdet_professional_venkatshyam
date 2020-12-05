package com.devlabs.lab1;

public class UnaryOpDemo {

    public static void main(String[] args)
    {
        int a=5, b=6;
        int m=9, n=3;
        int c = a++ + ++b; //12 : (6+7)
        
        //a = 6, b=7
        //++a a++
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        int d = (++a + b++) + a; //7 + 7 + 7 = 21
        //b=8
        System.out.println("The value of b is: " + b);
        System.out.println("The value of a after increment is: " + a);
        System.out.println("The value of c is: " + c);
        System.out.println("The value of d is: " + d);
        
        int o = m-- + --n; // 9+ 2 = 11
        //m=8
        System.out.println("The value of o is: " + o); //11
        System.out.println("The value of n is: " + n); //2
        System.out.println("The value of m is: " + m); //8
    }
}
