package Assignment_1;

public class Sum_Natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 20, count = 1, total = 0;

	       while(count <= num)
	       {
	           total = total + count;
	           count++;
	       }

	       System.out.println("Sum of first 20 natural numbers is: "+total);
	    }
	}