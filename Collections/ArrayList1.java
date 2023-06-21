package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(70);
		al.add(30);
		al.add(50);
		
		
		Collections.sort(al);
		for(int result:al ) {
			System.out.println(result);
		}
//		al.add("zia");
//		al.add("James");
//		al.add("Mark");
//		al.add(0, "Virat");
//		System.out.println(al);
//		
//		Iterator itr = al.iterator();
//	while(	itr.hasNext()) {
//		System.out.println(itr.next());
//		al.remove(2);
//		System.out.println(al);
//		
//	if(al.contains("James")) {
//		System.out.println("True");
//	}
//	else {
//		System.out.println("False");
//	}
//	
//	
	}
		
	}

