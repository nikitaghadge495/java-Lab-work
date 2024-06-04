package com.java;

import java.util.Scanner;

public class HomeLon implements LonCal
{
    double prinamt,loanamt,roi=8.5;
    int year;
    Scanner sc = new Scanner(System.in);
	public void accpetprnamt()
	{
		System.out.println("enetr the pricipal amount:");
		prinamt = sc.nextDouble();
		System.out.println("enetr the year :");
		year = sc.nextInt();
		
	}
	public void display() 
	{
		loanamt = (prinamt*roi*year)/100;
		System.out.println("the home loan is a :"+loanamt);
	}
	public static void main(String args[])
	{
		HomeLon h1 = new HomeLon();
		h1.accpetprnamt();
		h1.display();
	}
      
}
