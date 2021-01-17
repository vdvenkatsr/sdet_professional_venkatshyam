package Assignment_3;

	public class Word_present 
	{ 
	  
	
	static boolean isWordPresent(String sentence, String word) 
	{ 
	 
	    String []s = sentence.split(" "); 
	  
	  
	    for ( String temp :s) 
	    { 
	  
	 
	 
	        if (temp.compareTo(word) == 0) 
	        { 
	            return true; 
	        } 
	    } 
	    return false; 
	} 
	  
	 
	public static void main(String[] args) 
	{ 
	    String s = "A brown fox ran away fast"; 
	    String word = "brown"; 
	  
	    if (isWordPresent(s, word)) 
	        System.out.print("Yes"); 
	    else
	        System.out.print("No"); 
	  
	} 
	} 