package com.devlabs.lab14; 
import java.util.*; 


public class HashMapDemo { 


	public static void main(String args[]) 
	{ 
	 HashMap<Integer,String> hm = new HashMap<Integer,String>();     
	  
 	 System.out.println("Initial map: "+hm); 
       
 	 //insertion 
 	  
       hm.put(102,"Rahul");  //put() which inserts the values 
       hm.put(100,"Amit");     
       hm.put(101,"Vijay");  
       hm.put(104,"Deepti");  
       hm.put(105,"Deepti");  
     
      System.out.println("After invoking put() method " + hm);   
       
       //every key-value pair is called an entry 
      //Map.Entry interface : entry object 
       
      for(Map.Entry m: hm.entrySet()) //set of entries : key-value pair 
       {     
        System.out.println(m.getKey()+" - "+m.getValue());     
       }   
        
          
       //key checked here and inserted if not present 
       
       hm.putIfAbsent(104, "Gaurav"); //insert if not present already  
       System.out.println("After invoking putIfAbsent() method " + hm);   
       /*       
       for(Map.Entry m:hm.entrySet()) 
       {     
            System.out.println(m.getKey()+" "+m.getValue());     
       }   
        
       HashMap<Integer,String> map=new HashMap<Integer,String>();   
       map.put(114,"Ravi");  
        
       map.putAll(hm);  //copies one map values to another 
       System.out.println("After invoking putAll() method ");   
       for(Map.Entry m:map.entrySet()) 
       {     
            System.out.println(m.getKey()+" "+m.getValue());     
           }  
        
        */ 
  //   key-based removal   
     //  HashMap<Integer,String> map=new HashMap<Integer,String>();   
       hm.remove(100);   
       System.out.println("Updated list of elements: "+hm);  
        
       //key-value pair based removal   
       hm.remove(102, "Rahul");   
       System.out.println("Updated list of elements: "+hm);  
  }   
 } 
