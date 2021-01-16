	package com.devlabs.lab4; 
import java.util.*; 


public class StudentmarksExample { 


	public static void main(String[] args) { 
		int elex, maths, civil, mech, ed; 
		 
		double final_score; 
 		 
 		int count = 1; 
 		 
 		Scanner marks = new Scanner(System.in); 
 		 
 	    do 
 	    { 
 	    	System.out.println("Enter marks for Student"+count); 
 	    	 
 	    	System.out.print("Elex:"); 
 	    	elex = marks.nextInt(); 
 	    	System.out.print("Maths:"); 
 	    	maths = marks.nextInt(); 
 	    	System.out.print("Civil:"); 
 	    	civil = marks.nextInt(); 
 	    	System.out.print("Mech:"); 
 	    	mech = marks.nextInt(); 
 	    	System.out.print("ED:"); 
 	    	ed = marks.nextInt(); 
 	    	 
 	    	final_score = ((elex+maths+civil+mech+ed)/5); 
 	    	System.out.println("Total Score for Student " +count +" is: "+final_score); 
 	    	 
 	    	if(final_score>=90) 
 	    	{ 
 	    		System.out.println("The grade is Excellent."); 
 	    	} 
 	    	else if(final_score>=75) 
 	    	{ 
 	    		System.out.println("The grade is Very Good."); 
 	    	} 
 	    	else if(final_score>=60) 
 	    	{ 
 	    		System.out.println("The grade is Good."); 
 	    	} 
 	    	else if(final_score>=40) 
 	    	{ 
 	    		System.out.println("The grade is Average."); 
 	    	} 
 	    	else 
 	    	{ 
 	    		System.out.println("The grade is Poor."); 
 	    	} 
 	    	count++; 
 	    }while(count<=2); 
 	     
       marks.close(); 
 	} 
 

 } 
