package com.devlabs.lab14; 
import java.util.*; 
  
public class ConvertMapToList { 
	  
	 Map<Integer, String> map; 
	  
	 public ConvertMapToList(Map<Integer, String> map) { 
	      this.map = map; 
 	 } 
 	  
 	 public List<String> convertValuesToList() { 
 	    return new ArrayList(map.values()); 
 	 } 
 	  
 	 public static void main(String[] args) {            
 	 Map<Integer, String> map = new HashMap<>(); 
 	  
 	    map.put(1, "one"); 
 	    map.put(2, "two"); 
 	    map.put(3, "three"); 
 	    map.put(4, "Four"); 
 	    map.put(5, "Five"); 
 	    map.put(6, "Six"); 
 	    map.put(7, "Seven"); 
 	    map.put(8, "Eight"); 
 	    map.put(9, "Nine"); 
 	    map.put(10, "Ten"); 
 	  
 	    ConvertMapToList  conv = new ConvertMapToList (map); 
 	    List<String> keysList = conv.convertValuesToList(); 
 	    System.out.println("Values:"); 
 	    
 	    for (String val : keysList) 
 	    { 
 	       System.out.println(val); 
 	    } 
 	 } 
 	} 
