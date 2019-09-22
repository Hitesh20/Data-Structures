public class LinkedList
{
	Node head; 
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		//node.next = null;     //it is not necessary. As by default it will be null
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}	
	}	
	public void show()
	{
		Node n =head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	public void insertAt(int index, int data)
	{
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			Node node = new Node();
			node.data = data;
			Node n = head;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	public boolean deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
			return true;
		}
		else
		{
			Node n = head;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			Node temp = n.next;
			n.next = temp.next;
			temp = null;
			return true;
		}
	}
	public void deleteValue(int value)
	{
		Node n = head;
		int index = 0;
		while(n.next!=null)
		{
			if(n.data == value)
			{
				deleteAt(index);
				index++;
				n = n.next;
			}
			else
			{
				index++;
				n= n.next;
			}
		}
	}
	public void shiftLastToFirst()
	{
		Node n = head;
		Node temp = null;
		while(n.next!=null)
		{
			temp = n;
			n = n.next;
		}		
		temp.next = null;
		n.next = head;
		head = n;
		
	}
	public void delete_k_th_node_from_end(int node_val)
	{
		Node n = head;
		int count = 1;
		while(n.next!=null)
		{
			count++;
			n = n.next;
		}
		int target = count - node_val;
		deleteAt(target);
	}
	public void reverse()
	{
		Node curr = head;
		Node next,prev=null;
		while(curr.next!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr =next;
		}
		curr.next = prev;
		head = curr;
	}
	public void removeDuplicate()
	{
		
		
	}
}