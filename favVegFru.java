package com.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class favVegFru {

	public static void main(String[] args)
	{
		Set<String> s1 = new HashSet<String>();
		

		s1.add("tomato");
		s1.add("Potato");
		s1.add("cabbage");
		s1.add("Cauliflower");
		System.out.println("current elements in a Hash set collection");
		Iterator<String> itr = s1.iterator();
		{
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		s1.remove("cabbage");
		s1.remove("tomato");
		System.out.println();
		System.out.println("Affter removing current elements in a Hash set collection");
		Iterator<String> itr3 = s1.iterator();
		{
			while(itr3.hasNext())
			{
				System.out.println(itr3.next());
			}
		}
		System.out.println();
		System.out.println("List can containg element or not ");
		if (s1.contains("cabbage"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		
		System.out.println();
		System.out.println("******************************************************************");
		System.out.println();
		Set<String> s2 = new LinkedHashSet<String>();
		s2.add("Mango");
		s2.add("Apple");
		s2.add("papaya");
		s2.add("banana");
		System.out.println("current element in Link hash set collection");
		Iterator<String> itr2 = s2.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		s2.remove("papaya");
		System.out.println();
		System.out.println("After removing current element in Link hash set collection");
		Iterator<String> itr4 = s2.iterator();
		while(itr4.hasNext())
		{
			System.out.println(itr4.next());
		}
		System.out.println();
		System.out.println("************************************************************");
		System.out.println();
		s2.addAll(s1);
		System.out.println("After Adding Hash set into Link Hash Set : ");
		Iterator<String> itr5 = s2.iterator();
		{
			while(itr5.hasNext())
			{
				System.out.println(itr5.next());
			}
		}
	}

}
