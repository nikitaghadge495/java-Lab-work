package example.com;

import java.util.Scanner;

public class ArrayswapAsenDsecn
{
	static void swapArray(int arr[],int a,int b)
	{ 
	        int temp;
			temp = arr[a];
			arr[a]=arr[b];
			arr[b]=temp;
		
	}
	static void Ascendingorder(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					swapArray(arr,i,j);	
				}
				
			}
		}
	}
	static void Dscendingorder(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					swapArray(arr,i,j);	
				}
				
			}
		}
	}
    static void PrintArray(int arr[])
    {
    	int n= arr.length;
    	for(int i = 0;i<n;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size : ");
		int n= sc.nextInt();
		System.out.println("enetr you array element : ");
		int arr[]= new int [n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		System.out.println("ascending array element : ");
        Ascendingorder(arr);
        PrintArray(arr);
        System.out.println("Dscending Array element : ");
        Dscendingorder(arr);
        PrintArray(arr);

	}

}
