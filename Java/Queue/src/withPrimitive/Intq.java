package withPrimitive;

public class Intq {
	
	private int [] q;
	private int size;
	//private int total;
	private int front;
	private int rear;
	
	public Intq()
	{
		size = 10;
		//total = 0;
		front = -1;
		rear = -1;
		q = new int [size];
	}
	
	public Intq(int size)
	{
		this.size = size;
		//total = 0;
		front = -1;
		rear = -1;
		q = new int [this.size];
	}
	public boolean insert(int item)
	{
		if(!overflow())
		{
			q[++rear] = item;
			if(rear==0)
			{
				front++;
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
		return (rear==q.length-1);
	}
	public int delete()
	{
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
		return (front>rear);
	}

}
