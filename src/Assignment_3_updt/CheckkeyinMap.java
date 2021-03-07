package Assignment_3_updt;

import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 


public class CheckkeyinMap {  
    public static void main(String[] args)  
    {  
 

         HashMap<Integer, String>  
             map = new HashMap<>();  
    
 

         map.put(1, "Geeks");  
         map.put(2, "ForGeeks");  
         map.put(3, "GeeksForGeeks");  
    
 

         int keyToBeChecked = 2;  
    
 

         System.out.println("HashMap: " 
                            + map);  
    
 

         Iterator<Map.Entry<Integer, String> >  
             iterator = map.entrySet().iterator();  
 

         boolean isKeyPresent = false;  
 

         while (iterator.hasNext()) {  
    
 

             Map.Entry<Integer, String>  
                 entry  
                 = iterator.next();  
 

             if (keyToBeChecked == entry.getKey()) {  
    
                 isKeyPresent = true;  
             }  
         }  
    
         System.out.println("Does key " 
                            + keyToBeChecked  
                            + " exists: " 
                            + isKeyPresent);  
     }  
 } 
