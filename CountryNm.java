package com.java;

import java.util.*;

public class CountryNm {

	public static void main(String[] args) 
	{
         
          int count,i ;
          
          Scanner sc = new Scanner(System.in);
          ArrayList<String> country = new ArrayList<String>();
          
          System.out.println("how many country do you want to add :");
          count = sc.nextInt();
          
          System.out.println("enter countries");
          
          for(i=1; i<=count; i++)
          {
        	 System.out.println("country " +i+ ":");
        	 String name = sc.next(); 
        	 country.add(name);
          }
       
          System.out.println(country);
          System.out.println("size of county"+country.size());
          
          country.add("india");
          System.out.println(country);
          System.out.println("size of county "+country.size());

          
          
	}

}
