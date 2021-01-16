
package com.devlabs.lab6;

import java.util.*;

public class RetailMultiArray
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
    //declaration of a multi-dimensional array
    double customer[][] = new double[3][2]; //3 customers, 3 values for each - invoice number, amount
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the elements:");
    
    for(int i=0;i<3;i++) //20 times from i=0 to i=19
    {
        for(int j=0;j<2;j++) //2 times, for index j = 0,1
        {
            customer[i][j] = scan.nextDouble(); //array populated from input values through scanner
            //customer[1][0] = 78.9
            //customer[1][1] = 23.0
        }
    }
    scan.close();
    
    //objects in Java are stored with hexadecimal values - codes - identifiers.
    System.out.println("Array values is:" + customer);

    for(int i=0;i<3;i++) //20 times from i=0 to i=19
    {
        System.out.println("The values for the " + (i+1) + " customer are:  ");//i++
        for(int j=0;j<2;j++) //2 times, for index j = 0,1
        {
            System.out.println(customer[i][j]);
        }
    }
    }
}
        

