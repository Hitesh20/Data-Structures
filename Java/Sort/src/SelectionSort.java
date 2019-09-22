import java.util.Scanner;
public class SelectionSort {
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
		int min_index;
		for(int i=0;i<arr.length-1;i++)
		{
			min_index =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i]=temp;
		}
		return arr;
	}
}
