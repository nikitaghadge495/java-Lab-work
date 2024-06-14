package example.com;

import java.util.Scanner;

public class findelement
{
	static void swap(int []arr, int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	static int [] sortArray(int arr[])
	{
		int n = arr.length;
		for(int i =0;i<n;i++)
		{
			for(int j =i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					swap(arr,i,j);
				}
				
				
			}
			
		}return arr;
	}
	static void descending(int arr[]) {
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					swap(arr,i,j);
					
				}
			}
		}
	}
	static boolean SearchArray(int arr[],int x)
	{
		boolean check = false;
		for(int i =0;i<arr.length;i++)
		{
			//sortArray(arr);
			
			if(arr[i]==x)
			{
				check = true;
				
			}
			
		}
		return check;
	}
	static int findindex(int arr[],int x)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				sortArray(arr);
				return i;
			}
		}
		return -1;
	}
	static void displayArray(int arr[])
	{
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
        System.out.println("enter the Array : ");
        for(int i =0;i<n;i++)
        {
        	arr[i]= sc.nextInt();
        }
        System.out.println("your array element is : ");
        displayArray(arr);
        
        System.out.println("sorted array by ascending order : ");
        sortArray(arr);
        displayArray(arr);
        
        System.out.println("sorted array by Dscending order : ");
        descending(arr);
        displayArray(arr);
        
        System.out.println("enetr the element  to search element : ");
        int x = sc.nextInt();
        System.out.println("element is prsent or not : "+SearchArray(arr,x));
        System.out.println("index of element is : "+findindex(arr,x));
	}	

}


































