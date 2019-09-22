package Circular_Queue_with_Primitive;

import withPrimitive.Intq;

public class Main {

	public static void main(String[] args)
	{

	IntCirQ q1 = new IntCirQ(5);
	System.out.println(q1.insert(5));
	System.out.println(q1.insert(6));
	System.out.println(q1.insert(7));
	System.out.println(q1.insert(8));
	System.out.println(q1.insert(9));
	System.out.println(q1.delete());
	System.out.println(q1.insert(4));//insert this
	System.out.println(q1.insert(10));
	System.out.println(q1.insert(10));
	System.out.println(q1.delete());
	System.out.println(q1.insert(10));//insert this
	System.out.println(q1.insert(11));
	System.out.println(q1.delete());
	System.out.println(q1.delete());
	System.out.println(q1.delete());
	System.out.println(q1.delete());
	System.out.println(q1.delete());
	//System.out.println(q1.delete());
	//System.out.println(q1.delete());
	//q1.show();
	}

}
