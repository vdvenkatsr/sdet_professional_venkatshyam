package com.devlabs.lab11; 
import java.util.*; 


  
public class ArrayList2{ 
  
public static void main(String[] args) { 
   
//create an ArrayList object 
  ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
         
         //Add elements to Arraylist 
         arrayList.add(1); 
         arrayList.add(2); 
         arrayList.add(3); 
         arrayList.add(4); 
         arrayList.add(5); 
         arrayList.add(6); 
         arrayList.add(7); 
         arrayList.add(8); 
         arrayList.add(9); 
         arrayList.add(10); 
         System.out.println("Size of ArrayList: "+ arrayList.size());  
  /* 
  To check whether the specified element exists in Java ArrayList use 
 boolean contains(Object element) method. 
 It returns true if the ArrayList contains the specified object, false 
 otherwise.*/ 
         
         boolean isFound = arrayList.contains(2); 
         System.out.println("Does arrayList contain 2 ? " + isFound); 
       
   /* 
    To get an index of specified element in ArrayList use 
    int indexOf(Object element) method. 
    This method returns the index of the specified element in ArrayList. 
    It returns -1 if not found. 
   */ 
     
    int index = arrayList.indexOf(11); 
   
  if(index == -1) 
     System.out.println("ArrayList does not contain 11"); 
   else 
     System.out.println("11 is present at :" + index); 
          
          
    int secindex = arrayList.indexOf(5); 
   
  if(secindex== -1) 
       System.out.println("ArrayList does not contain 5"); 
  else 
      System.out.println("ArrayList contains 5 at index :" + secindex); 
         
   
   
    
 } 
 } 
