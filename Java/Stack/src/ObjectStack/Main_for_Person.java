package ObjectStack;

public class Main_for_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person("Hitesh","1710991325");
		Person person2 = new Person("Kanika","1710991369");
		Person person3 = new Person("Japneet","1710991343");
		
		PersonStack stack = new PersonStack();
		stack.push(person1);
		stack.push(person2);
		stack.push(person3);
		
		System.out.println(stack.pop());
	}

}
