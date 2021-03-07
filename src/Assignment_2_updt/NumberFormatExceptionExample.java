package Assignment_2_updt;

public class NumberFormatExceptionExample  
{ 
	 
	public static void main(String[] args) { 
        String s1 = "12"; 
        int i1 = Integer.parseInt(s1); 
  
         String s2 = "9L"; 
         long l1 = Long.parseLong(s1); 
         System.out.println(i1 * l1);    // 100 
   
         try { 
             int i3 = Integer.parseInt(s2); 
         } catch (NumberFormatException e) { 
             System.err.println("Unable to format. " + e); 
         } 
     } 
 } 
  
