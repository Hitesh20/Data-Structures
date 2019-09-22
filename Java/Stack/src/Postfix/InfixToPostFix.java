package Postfix;
import java.util.*;
public class InfixToPostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		String postFix = "";
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				postFix += c;
			}
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					postFix+=stack.pop();
				}
				if(stack.isEmpty())
				{
					System.out.println("Empty Stack");
				}
				else
				{
					stack.pop();
				}
			}
			else
			{
				while(!stack.isEmpty() && getPriority(c)<=getPriority(stack.peek()))
				{
					postFix+=stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
		{
			if(stack.peek()=='(')
			{
				
			}
			else
			{
				postFix+=stack.pop();
			}
		}
		System.out.println(postFix);

	}
	public static int getPriority(char c)
	{
		if(c=='-' || c=='+')
		{
			return 1;
		}
		else if(c=='*' || c=='/')
		{
			return 2;
		}
		else if(c=='^')
		{
			return 3;
		}
		return 0;
	}

}
