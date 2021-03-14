package Assignment_1;
import java.util.*;
public class Area_of_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//triangef
		Scanner s= new Scanner(System.in);
	        
         System.out.println("Enter the width :");
         double b= s.nextDouble();
 
         System.out.println("Enter the height :");
          double h= s.nextDouble();
 
                  //Area = (width*height)/2
      double area=(b*h)/2;
      System.out.println("Area of Triangle : " + area);      
   }
}