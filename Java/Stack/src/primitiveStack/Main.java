package primitiveStack;
import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		
		IntStack intStack = new IntStack();
		if(!intStack.isFull()){
			intStack.push(2);
			intStack.push(4);
			intStack.push(6);
			intStack.push(8);
		}
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
	}
	

}
