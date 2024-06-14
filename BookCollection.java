package com.java;

import java.util.TreeMap;
import java.util.Map;

public class BookCollection {
	
	public static void main(String[] args) {

		TreeMap<String,Integer> books=new TreeMap<String,Integer>();
		
		books.put("Wings of Fire",200);
		books.put("Ignited Minds",500);
		books.put("India 2020" ,700);
		books.put("My Journey",900);
		
		System.out.println(books);
		
		Map<String,Integer>morebooks=new TreeMap<String,Integer>();
		
		//adding more books		
		morebooks.put("Unyielding Spirit",400);
		morebooks.put("Rise of Victory",800);
		
		books.putAll(morebooks);
		System.out.println(books);
		
		//get the element
		 System.out.println("The value of books are"+books.get("Wings of Fire"));
		 
		 //remove the element
		 books.remove("My Journey");

		 System.out.println("List of books after removing :");
		 System.out.println(books);
		 
		 books.clear();
		 System.out.println(books);
		 System.out.println(books.isEmpty());
		 
		 books.put("firealaram", 100);
		 System.out.println(books);
		
}
}