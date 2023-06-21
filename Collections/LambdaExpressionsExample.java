package Collections;

public class LambdaExpressionsExample {
	
	
	public void greet(Greeting greeting){
		greeting.perform();
	}
public static void main(String[] args) {
	
	LambdaExpressionsExample lambda = new LambdaExpressionsExample();
	
	
	Greeting greetMessage = () -> System.out.println("Hello Man..!! How are you..!!");
	lambda.greet(greetMessage);
	
     MyAdd	addFunction = (int a, int b) -> a + b;
     System.out.println(addFunction.addition(10, 20));
     
     MyMultiply multiplyNumberFunction = (int a) -> a*2;
     System.out.println(multiplyNumberFunction.multiply(10));
     
     MySafeDivision  safeDivisionFunction = (int a , int b) -> {
 		if(b==0) return 0;
 		return a/b;
 	};
 	System.out.println(safeDivisionFunction.safeDivision(10, 2));
 	
 	
 	MyStringCount stringLength = (String s) -> s.length();
 	System.out.println(stringLength.getLength("Hello Lambda"));
 	
}


interface Sample{
	void myMessage();

}
interface MyAdd{
	int addition(int a , int b);
}

interface MyMultiply{
	int multiply(int a);
}

interface MySafeDivision{
	int safeDivision(int a , int b);
}
interface MyStringCount{
	int getLength(String a);
}


}
