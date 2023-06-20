package Inheritance;


public class Test1 {
	
	public static void main(String[] args) {
		
int [] data1 = new int[]{1,2,3,4,5};		
		
		int[] data2 = new int[data1.length];
		
		for(int i=0;i<data1.length;i++) {
			data2[i]=data1[i];
		}
		
		for(int i=0;i<data2.length;i++) {
			System.out.println(data2[i]);
		}
		
		
	}
}
