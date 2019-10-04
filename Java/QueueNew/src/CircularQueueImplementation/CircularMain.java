package CircularQueueImplementation;


public class CircularMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueue q = new CircularQueue(5);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(7);
		System.out.println(q.dequeue());
		q.enqueue(9);
		q.enqueue(10);
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());

	}

}
