import java.util.Scanner;


public class OptimizedBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of values you want to enter");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] sort(int arr[])
	{
		boolean swapped;
		for(int i=0;i<arr.length;i++)
		{
			swapped = false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>=arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
			{
				break;
			}
		}
		return arr;
	}

}
