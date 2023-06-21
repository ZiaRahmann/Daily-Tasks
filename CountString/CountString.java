package CountString;

import java.util.HashMap;

import SpringBoot.Address;

public class CountString {

	
	public static void main(String[] args) {
		String str = "today is 4th day of week today is wonderful day";
//		int Words = sentence.split("\\s").length;
//		System.out.println(Words);
//		for(int i=0;i<sentence.length();i++) {
//			//if(sentence)
//		  //  System.out.println(sentence);
//		 
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		  String[] words = str.split(" ");
		  
	        for (String word : words) {
	 
	            // Asking whether the HashMap contains the
	            // key or not. Will return null if not.
	            Integer integer = hmap.get(word);
	 
	            if (integer == null)
	                // Storing the word as key and its
	                // occurrence as value in the HashMap.
	                hmap.put(word, 1);
	 
	            else {
	                // Incrementing the value if the word
	                // is already present in the HashMap.
	                hmap.put(word, integer + 1);
	            }
	        }
	        System.out.println(hmap);
	    }
		
	}	


    

