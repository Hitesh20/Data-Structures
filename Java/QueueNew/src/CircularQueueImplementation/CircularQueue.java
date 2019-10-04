package CircularQueueImplementation;

public class CircularQueue {
	private int [] q;
	private int size;
	private int front;
	private int rear;
	
	public CircularQueue()
	{
		size = 10;
		front = -1;
		rear = -1;
		q = new int [size];
	}
	
	public CircularQueue(int size)
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
		if((rear+1)%size == front) {
			System.out.println("Queue is FULL..!");
			return;
		} else if(isEmpty()) {
			front = 0; rear = 0;
		} else {
			rear = (rear+1)%size;
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
			front = (front+1)%size;
			return x;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			return q[front];
		}
	}

}
