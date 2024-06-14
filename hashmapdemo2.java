//Q.1) Write a Java program to associate the specified value with the specified key in a HashMap.(for Example Empid with EmpName).
package com.java;

import java.util.HashMap;
import java.util.Map;

public class hashmapdemo2 {

	public static void main(String[] args) 
	{
		Map<Integer,String> map1= new HashMap<Integer , String>();
		map1.put(1, "Nikita");
		map1.put(2, "Gayatri");
		map1.put(3, "Sahil");
		map1.put(4, "pretiksha");
		
		System.out.println("element contain hash Map");
		System.out.println(map1);
        
		System.out.println("key in HashMap is : "+map1.keySet());
		
		System.out.println("Values in HashMap is : "+map1.values());
		
		System.out.println("All enetirs in HashMap is : "+map1.entrySet());
		
		String a = map1.remove(3);
		System.out.println("the Rempove pair in set is : "+a);
		
		System.out.println("remaining elemet in HashMap is : ");
		System.out.println("key : "+map1.keySet()+" values : "+map1.values());
		
	}

}
