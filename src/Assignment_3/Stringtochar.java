
package Assignment_3;

public class Stringtochar {

	   public static void main(String []args) {
		      char[] arr = { 'p', 'q', 'r', 's' };
		      String str = String.valueOf(arr);
		      System.out.println(str);
		 
	   }
	  
	   
	  // public class StringToCharArrayExample2 {  
		    public static void main1(String[] args) {  
		        String s1 = "Welcome to Javatpoint";  
		        char[] ch = s1.toCharArray();  
		        int len = ch.length;  
		        System.out.println("Char Array length: " + len);  
		        System.out.println("Char Array elements: ");  
		        for (int i = 0; i < len; i++) {  
		            System.out.println(ch[i]);  
		        }  
		    }  
		}  
