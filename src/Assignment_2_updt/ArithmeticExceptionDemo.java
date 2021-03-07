package Assignment_2_updt; 

public class ArithmeticExceptionDemo  


{ 
	public static void main(String[] args) { 
		int a=0,b=4,c=0; 
		 
		try { 
	 		 
	 		c=b/a; 
	 	}catch (ArithmeticException e) 
		{ 
	 		 
	 		e.printStackTrace(); 
	 		System.out.println("Arithmetic exception handled"); 
	 		// TODO: handle exception 
	 	} 
	 	 
	 	System.out.println("value of c is :" +c ); 
	}

 } 
