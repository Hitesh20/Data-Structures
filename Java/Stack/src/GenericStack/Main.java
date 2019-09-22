package GenericStack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(0);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		stack1.push(6);
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		/*-------------------------------------------------------------------------------------------------------*/
		
		
		Stack<String> stack2 = new Stack<String>();
		stack2.push("Hitesh");
		stack2.push("Kanika");
		stack2.push("Bedi");
		
		System.out.println(stack2.pop());

		 

		/*---------------------------------------------------------------------------------------------------------*/
		
		
		
		Stack<Person> stack3 = new Stack<Person>();
		Person p1 = new Person("Hitesh",1325);
		Person p2 = new Person("Kanika",1369);
		Person p3 = new Person("JD",1336);
		stack3.push(p1);
		stack3.push(p2);
		stack3.push(p3);
		
		System.out.println(stack2.pop());
	
	}

}
