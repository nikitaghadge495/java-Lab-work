package example.com;

import java.util.Scanner;

public class findlocation 
{ 
	
	static void findarlocation(int arr[],int x)
	{
		int n = arr.length;
		int i ;
		for(i = 0;i<n;i++)
		{
			if(arr[i]==x)//to check the key element is equal to array element
			{
				System.out.println("the element : "+x+" present in location :"+(i+1));
				break;
			}
			
		}
		
	}
	static void displayArray(int arr[])//the method for diplay the Array element 
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
		System.out.println("enetr the size of array : ");
		int n = sc.nextInt();
		System.out.println("eneter array elemet is : ");
		int arr[]=new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array element : ");
		displayArray(arr);
		
		System.out.println("enter the array element to find location :");
		int x = sc.nextInt();
		findarlocation(arr,x);//to call the method to retrive location of array
		

	}

}
