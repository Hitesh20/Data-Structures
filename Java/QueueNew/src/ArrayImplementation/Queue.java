package ArrayImplementation;

public class Queue {
	
	private int [] q;
	private int size;
	private int front;
	private int rear;
	
	public Queue()
	{
		size = 10;
		front = -1;
		rear = -1;
		q = new int [size];
	}
	
	public Queue(int size)
	{
		this.size = size;
		front = -1;
		rear = -1;
		q = new int [this.size];
	}
	
	public boolean isEmpty() {
		if(front==-1 && rear==-1) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int data) {
		if(rear==size-1) {
			System.out.println("Queue is FULL..!");
			return;
		} else if(isEmpty()) {
			front = 0; rear = 0;
		} else {
			rear++;
		}
		q[rear] = data;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is EMPTY..!");
			return -1;
		} else if(front == rear) {
			int x =  q[front];
			front = -1; rear = -1;
			return x;
		} else {
			int x = q[front];
			front++;
			return x;
		}
	}

}
