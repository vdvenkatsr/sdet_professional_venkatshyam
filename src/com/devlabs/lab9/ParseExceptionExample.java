package com.devlabs.lab9; 
import java.text.*; 
import java.util.*; 


public class ParseExceptionExample { 
	 
	 public static void main(String[] args) { 
	        Scanner scanner = new Scanner(System.in); 
	        System.out.println("Enter date in dd/MM/yyyy format: "); 
 	        String inputDate = scanner.nextLine(); 
 	        scanner.close(); 
 	        convertDateFormat(inputDate); 
 	        System.out.println("Reaching here....."); 
 	    } 
 

 	    static void convertDateFormat(String inputDate) 
 	    { 
 	        try{ 
 	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
 	            Date date = sdf.parse(inputDate);//parse 
 	            System.out.println("Date is : " + date); 
 	             
 	          /*  SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-MM-dd"); 
 	            String outputDate = outputsdf.format(date);//format 
 	            System.out.println("After changing date format to yyyy/MM/dd : "+outputDate);*/ 
 	        } 
 	        catch(ParseException e) 
 	        { 
 	        	e.printStackTrace(); 
 	            System.out.println("Some error occurred while converting date formats. Exception is : "); 
 	        } 
 	    } 
 	     
 	    
 	} 
