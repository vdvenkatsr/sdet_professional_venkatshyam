   //irregular arrays are also called jagged arrays 


package com.devlabs.lab6; 


public class IrregualrArraysDemo { 


	public static void main(String[] args) { 
		 
    	int arr[][] = {{2},{6,1},{8,34,16},{20,56,3,5}}; 
 		 
 		/* 
 		 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length; 
 		 * j++) { System.out.print(arr[i][j]+" "); } System.out.println(); } 
 		 */ 
 		  
     	 
     	for(int[] var : arr) 
     	{ 
     		for(int var1 : var) 
     		{ 
     			System.out.print(var1 +" "); 
     		} 
     		System.out.println(); 
     	} 
     	 
 	} 
 } 
