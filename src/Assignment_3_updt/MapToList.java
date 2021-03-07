package Assignment_3_updt;

import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import java.util.Scanner; 
import java.util.stream.Collectors; 


 public class MapToList {  
 	   
     public static void main(String[] args)  
     {  
         Scanner sc = new Scanner(System.in);  
    
   
         Map<String, String> map = new HashMap<String, String>();  
         System.out.println("Enter No of Students");  
    
 

         int noOfStudents = Integer.parseInt(sc.nextLine());  
         for (int i = 0; i < noOfStudents; i++) {  
             String input = sc.nextLine();  
             String[] studentdata = input.split(" ");  
             String rollno = studentdata[0];  
             String name = studentdata[1];  
             map.put(rollno, name);  
         }  
    
    
         List<String> ListofKeys = null;  
         List<String> ListofValues = null;  
    
     
         ListofKeys = map.keySet().stream().collect(Collectors.  
                                        toCollection(ArrayList::new));  
         ListofValues = map.values().stream().collect(Collectors.  
                                        toCollection(ArrayList::new));  
    
         System.out.println("List of RollNo of Students");  
         System.out.println(ListofKeys.toString());  
         System.out.println("List of Name of Students");  
         System.out.println(ListofValues.toString());  
     }  
 } 
