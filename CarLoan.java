package com.java;

import java.util.Scanner;

public class CarLoan implements LonCal {
	int prinamt,loanamt,roi=5;
    int year , downpay,rembalance,month,monthbal,interest,monthpayment;
    Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarLoan cl = new CarLoan();
		cl.accpetprnamt();
		cl.display();
	}

	@Override
	public void accpetprnamt() {
		// TODO Auto-generated method stub
		System.out.println("enetr the pricipal amount:");
		prinamt = sc.nextInt();
		System.out.println("enetr the year :");
		year = sc.nextInt();
		System.out.println("enetr Down Payment :");
		downpay=sc.nextInt();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		rembalance = prinamt - downpay;
		month = year*12;
		monthbal = rembalance/month;
		interest = monthbal*(roi/100);
		monthpayment = monthbal+interest;
		System.out.println("Monthly Payment is:"+monthpayment);
		
	}

}
