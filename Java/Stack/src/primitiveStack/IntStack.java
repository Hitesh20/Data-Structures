package primitiveStack;

public class IntStack {
	
	private int[] stack;  //for storing the size of stack
	private int top;
	private int size;
	
	public IntStack()
	{
		top = -1;
		size = 50;
		stack = new int[50];
		
	}
	public IntStack(int size)
	{
		top = -1;
		this.size = 50;
		stack = new int[this.size];	
	}
	
	public boolean push(int item)
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
	
	
	public int pop()
	{
		if(!isEmpty()){
			return stack[top--];
		} else {
			return -1;
		}
		
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	
	
}
