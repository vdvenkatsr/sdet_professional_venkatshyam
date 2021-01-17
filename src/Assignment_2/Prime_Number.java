package Assignment_2;


public class Prime_Number {

	
		public static void main(String[] args)
	    {
	        
	      
			int num = 13;
	        boolean flag = false;
	        
	        for(int i=2;i<=num/2;i++)
	        {
	            if(num%i == 0)
	            { 
	                flag = true;
	                System.out.println(flag);
	            }
	        }
	        
	        
	        if(flag)
	          System.out.println(num + " is not a prime no");
	        else
	            System.out.println(num + " is a prime no");
	    }
	     
}
	        
	        