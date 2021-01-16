package com.devlabs.lab12; 
import java.util.*;  


public class ListIteratorExample { 


	public static void main(String args[]){   
	List<String> al=new ArrayList<String>();     
	        al.add("Amit");     
	        al.add("Vijay");     
 	        al.add("Kumar");     
 	        al.add(1,"Sachin"); 
 	         
 	        //list.listIterator() returns an object of ListIterator to me. 
 	       
 	        ListIterator<String> itr = al.listIterator(al.size());  
 

 	        //listIterator() is the method I call on my list object 
 	        //to get the iterator 
 	         
 	      /*  System.out.println("Traversing elements in forward direction");   
 	         
 	        //itr.hasNext() for the check of the values 
 	         
 	        //itr.next() will gives the value 
 	        while(itr.hasNext())//as long as there is a value in itr 
 	        {     
 	        	System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());     
 	        }  */   
 	         
             System.out.println("Traversing elements in backward direction");   
 	         
 	        while(itr.hasPrevious()) //hasPrevious() will be false as long as we havent used itr.next() 
 	        {     
 	        	System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());     
 	        }    
 	         
 	         
 	}   
 }  
  
