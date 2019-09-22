package Subtract_Two_LL;


public class LinkedList
{
	private class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	Node head;

	
	public void insert(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node curr = head;
			while(curr.next!=null)
			{
				curr = curr.next;
			}
			curr.next = node;
		}	
	}
	public void show()
	{
		Node n =head;
		while(n.next!=null)
		{
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.print(n.data);
	}
	public void reverse()
	{
		Node curr, prev=null, temp;
		curr = head;
		while(curr.next!=null)
		{
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		curr.next = prev;
		head = curr;
	}
	public LinkedList sub(LinkedList l1, LinkedList l2)
	{
		Node head1, head2, curr1, curr2;
		head1 = l1.head;
		head2 = l2.head;
		int count1=0,count2=0;
		curr1 = head1;
		while(curr1!=null)
		{
			count1++;
			curr1 = curr1.next;
		}
		curr2 = head2;
		while(curr2!=null)
		{
			count2++;
			curr2 = curr2.next;
		}
		curr1 = head1;
		curr2 = head2;
		if(count1>count2)
		{
			
		}
		else if(count2 > count1)
		{
			Node temp = head1;
			head1 = head2;
			head2 = temp;
		}
		else if(count2 == count1)
		{
			while(curr1 != null)
			{
				if(curr1.data > curr2.data)
				{
					break;
				}
				else if(curr2.data > curr1.data)
				{
					Node temp = head1;
					head1 = head2;
					head2 = temp;
					break;
				}
				else
				{
					
				}
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
		}
		head1=curr1;
		head2=curr2;
		//System.out.println(head1);
		l1.reverse();
		l2.reverse();
		curr1 = head1;
		System.out.println("in 1 list");
		while(curr1!=null)
		{
			System.out.print(curr1.data);
			curr1 = curr1.next;
		}
		System.out.print(curr1.data);
		System.out.println("in 2 list");
		curr2 = head2;
		while(curr2!=null)
		{
			System.out.print(curr2.data);
			curr2 = curr2.next;
		}
		System.out.print(curr1.data);
		curr1 = head1;
		curr2 = head2;
		LinkedList l3 = new LinkedList();
		boolean borrow = false;
		int value=0,val1=0,val2=0;
		while(curr1 != null || curr2 != null)
		{
			
			
				if(borrow)
				{
					val1 = curr1.data - 1;
					borrow = false;
				}
				if(curr1 != null && curr2 != null)
				{
					val1 = curr1.data;
					val2 = curr2.data;
					value = val1 - val2;
					if(value<0)
					{
						value = value + 10;
						borrow = true;
					}
					l3.insert(value);
					curr1 = curr1.next;
					curr2 = curr2.next;
				}
				else if(curr1 != null && curr2==null)
				{
					val1 = curr1.data;
					//val2 = curr2.data;
					value = val1 - 0;
					if(value<0)
					{
						value = value + 10;
						borrow = true;
					}
					l3.insert(value);
					curr1 = curr1.next;
				}
		}
			
				
		return l3;
	}
}
