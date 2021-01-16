package com.devlabs.lab12; 
import java.util.*; 


public class CollectionsClassDemo { 


	    public static void main(String a[]) 
	    {          
	        List<Integer> list1 = new LinkedList<Integer>();   
	        list1.add(46);   
 	        list1.add(67);   
 	        list1.add(24);   
 	        list1.add(16);   
 	        list1.add(8);   
 	        list1.add(12);  
 	         
 	        System.out.println("Value of maximum element from the collection: "+ Collections.max(list1));  //max of list 
 	        System.out.println("Value of minimum element from the collection: "+ Collections.min(list1));  //min of list 
 	        System.out.println("The list1 is:" + list1);  
 	         
 	      List<Integer> list2 = new LinkedList<Integer>(); 
 	        list2.add(4);   
 	        list2.add(6);   
 	        list2.add(2);   
 	        list2.add(1);   
 	        list2.add(88);   
 	        list2.add(1); 
 		 
 		  list2.add(45);  
 		  list2.add(90);  
 		  list2.add(23); 
 		  
 	        System.out.println("The list2 is "+list2);  
 	         
 	        //copy 
 	        Collections.copy(list2, list1);  //list2 is destination, list1 is source  
 	        //size of list2 should be atleast equal to the size of list1 : the elements in the list2 will be replaced by the list1 elements 
 	        //size of list2 is greater than list1 : the extra elements will remain unaffected 
 	         
 	        System.out.println("The list2 after copy is "+list2);  
 	         
 	     //sort 
 	        Collections.sort(list1);//ascending 
 	        System.out.println("The list1 after sorting is:" + list1); 
 	         
 	        Collections.sort(list1, Collections.reverseOrder()); //descending 
 		  System.out.println("The list1 after reverse sorting is:" + list1); 
 		   
 		 //addAll  
 		  Collections.addAll(list2,44,55,66,77,89,690); 
 		 System.out.println("The list2 after addAll is "+list2); 
 		  
 		    }   
 	}  
