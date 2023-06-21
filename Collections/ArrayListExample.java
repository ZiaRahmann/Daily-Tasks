package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
public static void main(String[] args) {

// add 
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.add(1);
	numbers.add(10);
	numbers.add(1);
	
	System.out.println(numbers);
	
	
	// get 
    int result=	numbers.get(2);
	System.out.println(result);
	
	
	// add in between
	numbers.add(0,12);
	System.out.println(numbers);
	
	// set or update
	numbers.set(0, 1);
	System.out.println(numbers);
	
	
	// remove
	numbers.remove(0);
	System.out.println(numbers);
	
	
	// size
	int size = numbers.size();
	System.out.println(size);
	
	
	//loops
	
	for(int i=0;i<size;i++) {
		System.out.println(numbers.get(i));
	}
	
	//sorting
	Collections.sort(numbers);
	System.out.println(numbers);
	
}
}
