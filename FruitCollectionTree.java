package com.java;

import java.util.Map;
import java.util.TreeMap;

public class FruitCollectionTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use 
		TreeMap<String, Integer> fruits=new TreeMap<String, Integer>();
		
		fruits.put("Banana", 70);
		fruits.put("Cherry", 100);
		fruits.put("Watermelon", 150);
		fruits.put("Apple", 200);
		fruits.put("Mango", 600);
		System.out.println("List contains fruits:");
		System.out.println(fruits);
		
		Map<String, Integer> morefruits=new TreeMap<String, Integer>();
		
		morefruits.put("Strawberry0", 150);
		morefruits.put("Jackfruit", 200);
		morefruits.put("Lichi", 230);
		
		
		//Use putAll()
		fruits.putAll(morefruits);
		System.out.println();
		System.out.println("Added morefruits in fruits elements: "+fruits);
		System.out.println(fruits.size());
		
		
		//get the element
		System.out.println();
		System.out.println("Price of Mango is :"+fruits.get("Mango"));
		
		
		//remove element
		fruits.remove("Banana");
		System.out.println();
		System.out.println("After remove operation list is :"+fruits);
		
		//Clear list
		fruits.clear();
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());
		
		fruits.put("Chikoo", 50);
		System.out.println(fruits.isEmpty());
	}

}
