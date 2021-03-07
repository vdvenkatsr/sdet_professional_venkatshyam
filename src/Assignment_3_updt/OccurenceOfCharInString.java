package Assignment_3_updt;


import java.util.HashMap; 
import java.util.Map; 


class OccurenceOfCharInString {  
	static void characterCount(String inputString)  
	{  
		 
		HashMap<Character, Integer> charCountMap  
			= new HashMap<Character, Integer>();  




		char[] strArray = inputString.toCharArray();  


		 
		for (char c : strArray) {  
			if (charCountMap.containsKey(c)) {  


			 
				charCountMap.put(c, charCountMap.get(c) + 1);  
			}  
			else {  


				 
				charCountMap.put(c, 1);  
			}  
		}  


		 
		for (Map.Entry entry : charCountMap.entrySet()) {  
			System.out.println(entry.getKey() + " " + entry.getValue());  
		}  
	}  




	public static void main(String[] args)  
	{  
		String str = "Broadridge Financial Solutions"; 
		characterCount(str);  
	}  
} 
