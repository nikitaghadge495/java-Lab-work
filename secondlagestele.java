package example.com;

import java.util.Scanner;

public class secondlagestele 
{
	
	static int largestele(int arr[])
	{
		int n = arr.length; 
		int max = Integer.MIN_VALUE;
		for(int i =0;i<n;i++)
		{
			if(max < arr[i])
			{
				max= arr[i];
			}
		}
		
		return max;
	}
	static int secondlestele(int arr[])
	{
		int max = largestele(arr);
		for(int i = 0 ;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int secondlarg = largestele(arr);
		return secondlarg;
	}
	static int smallestelement(int arr[])
	{
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		for(int i =0; i<n;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
				
			}
		}return min;
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
        
        System.out.println("enetr the array size : ");
        int n = sc.nextInt();
        System.out.println("enter the Array Element : ");
        int arr []=new int[n];
        for(int i=0; i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Array elemet is : ");
        displayArray(arr);
        
        System.out.println("1st largest no is : "+largestele(arr));
        System.out.println("2nd largest element is :"+secondlestele(arr));
        System.out.println("1st smallest element is :"+smallestelement(arr));

	}

}
