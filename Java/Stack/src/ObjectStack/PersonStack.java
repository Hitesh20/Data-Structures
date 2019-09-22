package ObjectStack;

public class PersonStack {

	
	private Person[] stack;  //for storing the size of stack
	private int top;
	private int size;
	
	public PersonStack()
	{
		top = -1;
		size = 50;
		stack = new Person[50];
		
	}
	public PersonStack(int size)
	{
		top = -1;
		this.size = 50;
		stack = new Person[this.size];	
	}
	
	public boolean push(Person item)
	{
		if(!isFull())
		{
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull()
	{
		return (top == stack.length-1);
	}
	
	
	public Person pop()
	{
		if(!isEmpty()){
			return stack[top--];
		} else {
			return null;
		}
		
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	
	
}
