package com.java;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {

	public static void main(String[] args)
	{
		Set<String> s1 = new LinkedHashSet<String>();
		
        s1.add("Nikita");
        s1.add("gyatri");
        s1.add("jimin");
        s1.add("suga");
        System.out.println("Link hash set after adding the element : "+s1);
        
        Iterator<String> itr = s1.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

}
