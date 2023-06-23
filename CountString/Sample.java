package CountString;

import java.util.HashMap;

public class Sample {
public static void main(String[] args) {
	
	String str = "today is 4th day of week today is wonderful day today";
	
	HashMap<String,Integer> hmap = new HashMap<String,Integer>();
	

	String [] word = str.split(" ");
	
	for(String words :word) {
		
		Integer integer = hmap.get(words);
		
		if(integer == null) {
			hmap.put(words, 1);
		}
		else {
			hmap.put(words,integer+1);
		}
		
	}
	
	System.out.println(hmap);
	
}
}