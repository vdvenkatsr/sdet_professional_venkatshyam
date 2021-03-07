package Assignment_3_updt;

import java.util.ArrayList; 
import java.util.Collections; 


public class Asort1 { 


	public static void main(String[] args) { 
	 
 		ArrayList<String> list1 = new ArrayList<String>(); 
 		list1.add("Test4"); 
 		list1.add("Test2"); 
 		list1.add("Test3"); 
 

 		Collections.sort(list1); 
 		for(int i=0; i<list1.size(); i++) 
 		    System.out.println(list1.get(i)); 
 	} 
 

 } 
