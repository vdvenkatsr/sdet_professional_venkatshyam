package Assignment_2_updt;



public class StringPalindrome { 


	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		 
		String a ="trurt" , b=""; 
		 
 		int n = a.length(); 
 		 
 		if (n>0) 
 			 
 		{ 
 			for (int i = n-1;i>=0;i--) 
 			{ 
 				b=b+a.charAt(i); 
 			} 
 		} 
 		if (a.equals(b)) 
 		{ 
 			 
 			System.out.println("Given string is palendrome"); 
 		} 
 		 
 		else  
 			 
 		{ 
 			System.out.println("Given string is not a palendrome"); 
 		} 
 		 
 

 	} 
 

 } 
