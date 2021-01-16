package Assignment_2;

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1234,sum;
 	    
for(sum=0 ;n!=0 ;n/=10)
{
sum+=n%10;
}
System.out.println("Sum of digits of a number is "+sum);               	  
}
}