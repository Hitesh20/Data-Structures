package Brackets;
import java.util.*;
public class CheckBrackets
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		boolean result=false;
		for(int i=0;i<ch.length;i++)
		{
			result = check(ch[i]);
			if(result==false)
			{
				break;
			}
		}
		if(stk.isEmpty() && result==true)
		{
			System.out.println("Balanced String");
		}
		else if(!stk.isEmpty() || result==false)
		{
			System.out.println("Not a balanced String");
		}
	}
	static Stack <Character> stk = new Stack<Character>();
	static public boolean check(char ch)
	{
		if(stk.isEmpty())
		{
			if(ch=='(' || ch=='{' || ch=='[')
			{
				stk.push(ch);
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(ch=='(' || ch=='{' || ch=='[')
			{
				stk.push(ch);
			}
			else if(ch==')')
			{
				char chh = stk.peek();
				if(chh=='(')
				{
					stk.pop();
					return true;
				}
				else
				{
					return false;
				}
			}
			else if(ch=='}')
			{
				char chh = stk.peek();
				if(chh=='{')
				{
					stk.pop();
					return true;
				}
				else
				{
					return false;
				}
			}
			else if(ch==']')
			{
				char chh = stk.peek();
				if(chh=='[')
				{
					stk.pop();
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		return true;
	}
}
