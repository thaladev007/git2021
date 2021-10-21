package org.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LengthOfLinkedList {

	public static void main(String[] args) {

		List l= new ArrayList();
		
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(80);
		l.add(110);
		l.add(243);
		l.add(25);
		
		
		
		for (int i = 0; i < l.size(); i++) {
			
			
			System.out.println(l.get(i));
			
		}
		
		
		
		System.out.println("****************Set******************");
		
		Set s =  new HashSet();
		
		
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(120);
		
		for (Object object : s) {
			
			System.out.println(object);
		}
		
		System.out.println("********************Entries Of Map**********************");
		
		
	Map<String,Integer> m = new HashMap();
	
	m.put("A", 21);
	m.put("B", 23);
	m.put("C", 25);
	m.put("M", 27);
	m.put("E", 29);
	m.put("F", 22);
	m.put("G", 29);
	m.put("H", 20);
	
	
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	
	for (Entry<String, Integer> entry : entrySet) {
		
		System.out.println(entry);
		
		//
		//System.out.println(entry.getKey());
		//
		//System.out.println(entry.getValue());
		//System.out.println();
		
	}
	
	System.out.println("*************Keys Of  Map*******************");
	
	for (Entry<String, Integer> entry : entrySet) {
		
		System.out.println(entry.getKey());
		
	}
	
	System.out.println("*************Values Of  Map*******************");
	
	
	
	
	for (Entry<String, Integer> entry : entrySet) {
		
		System.out.println(entry.getValue());
		
	}
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
