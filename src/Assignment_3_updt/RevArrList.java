package Assignment_3_updt;

import java.util.ArrayList; 


public class RevArrList { 


	public static void main(String[] args) { 
		 RevArrayList obj1 = new RevArrayList();  
		   
 		    
 	        ArrayList<Integer> arrayli = new ArrayList<Integer>();  
 	   
 

 	        arrayli.add(new Integer(1));  
 	        arrayli.add(new Integer(2));  
 	        arrayli.add(new Integer(3));  
 

 	        System.out.print("Elements before reversing:");  
 	        obj1.printElements(arrayli);  
 	        arrayli = obj1.reverseArrayList(arrayli);  
 	        System.out.print("\nElements after reversing:");  
 	        obj1.printElements(arrayli);  
 

 	} 
 

 } 
