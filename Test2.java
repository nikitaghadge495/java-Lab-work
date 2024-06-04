package com.java;

import java.util.Scanner;

public class Test2 implements interfacedemo
{
	 
	Scanner sc = new Scanner(System.in);
	double area ,a ;
     public void accept()
     {
    	 System.out.println("enetr the radius a :");
    	 a = sc.nextDouble();
     }

	@Override
	public void dispaly() 
	{
		area = 3.14*a*a;
		System.out.println("area of cicle:"+area);
	}
	public static void main(String args[])
	{
		Test2 t2= new Test2();
		t2.accept();
		t2.dispaly();
	}
}
