package Circular_Queue_with_Primitive;
public class IntCirQ {
	private int [] q;
	private int size;
	private int front;
	private int rear;	
	public IntCirQ()
	{
		size = 10;
		front = -1;
		rear = -1;
		q = new int [size];
	}
	public IntCirQ(int size)
	{
		this.size = size;
		front = -1;
		rear = -1;
		q = new int [this.size];
	}
	public boolean insert(int item)
	{
		if(front>0 && rear==q.length-1)
		{
			rear = -1;
		}
		if(!overflow())
		{
			q[++rear] = item;
			if(rear==0 && front<rear)
			{
				front = 0;
			}
			return true;
		}
		else
		{
			return false;
		}	
	}
	public boolean overflow()
	{
		if(rear==q.length-1 && front==0)
		{
			return true;
		}
		else if(front==rear+1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int delete()
	{
		
		if(front>q.length-1 && rear<q.length)
		{
			front = 0;
		}
		
		if(!underflow())
		{
			return q[front++];
		}
		else
		{
			return -1;
		}
	}
	public boolean underflow()
	{
		if(front>rear && rear==q.length-1)
		{
			return true;
		}
		else
			return false;
	}
}