package CountString;
import java.util.HashMap;


public class CapitalString {


public static void main(String[] args) {
	
	String str = "today is 4th day of week today is wonderful day zia";
	
	HashMap<String,Integer> hmap = new HashMap<String,Integer>();
	
	String [] words = str.split(" ");
	
	for(String word : words) {
		
		System.out.print(word.substring(0,1).toUpperCase()+ word.substring(1)+" ");
		
	}
	
}
}



	//Integer integer = hmap.get(word);
//		if(integer == null) {
//		  hmap.put(word,1);
//		}
//		else {
//			hmap.put(word, integer+1);
			
//		}
		

	
	
	
//	String output = str.substring(0,1).toUpperCase()+ str.substring(1);
//	System.out.println(output);
//	
	

//	String s1 = str.substring(0,1).toUpperCase();
//	System.out.println(s1+str);
//	System.out.println(s1.substring(1));

	
	
	//System.out.println(str.toUpperCase());
	//System.out.println(str);
	
//	int words = str.split("\\s").length;
//	
//	for(int i=0;i<str.length();i++) {
//		System.out.println(str);
//	}

