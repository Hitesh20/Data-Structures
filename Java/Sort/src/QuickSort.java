import java.util.Scanner;


public class QuickSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of values you want to enter");
		int n = sc.nextInt();
		int arr[] = new int [n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		quicksort(arr, 0, n-1);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void quicksort(int arr[], int low, int high) {
		
		if(low<high) {
			
			int index = sort(arr, low, high);
			quicksort(arr, low, index-1);
			quicksort(arr, index+1, high);
			
		}
	}
	
	
	public static int sort(int arr[], int low, int high) {
		
		int pivot = arr[high];
		int i = low -1;
		for(int j=low; j<high; j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp2 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp2;
			}
		}
		
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}

}