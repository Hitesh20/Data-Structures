




public class Main
{
	public static void main(String[] args)
	{
		
		LinkedList object = new LinkedList();
		object.insert(5);
		object.insert(10);
		object.insert(15);
		object.insert(20);
		object.insertAtStart(0);
		object.insertAt(2, 50);
		object.insertAt(0, 25);
		object.deleteAt(2);
		object.deleteValue(25);
		object.deleteValue(15);
		object.shiftLastToFirst();
		object.delete_k_th_node_from_end(2);
		object.insert(15);
		object.reverse();
		object.show();
	}
}
