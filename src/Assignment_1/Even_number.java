package Assignment_1;

public class Even_number {

	public static void main(String[] args) {
	 	// TODO Auto-generated method stub

		int n = 50;
		System.out.print("Even Numbers from 1 to "+ n +" are: ");
		for (int i = 1; i <= n; i++) {
		 
		   if (i % 2 == 0) {
			System.out.print(i + " ");
		   }
		}
	   }
	}