package Assignment_2;

public class Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};   
        
        System.out.println("Duplicate elements in given array are : ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  