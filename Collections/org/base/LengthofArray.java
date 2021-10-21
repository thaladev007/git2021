package org.base;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LengthofArray {

	public static void main(String[] args) {

		lengthofArray();
	}

	private static void lengthofArray() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value count : ");
		
		int count = s.nextInt();
	     
		List li = new ArrayList();
		
		for (int i=0;i<count;i++) {
			
			System.out.println("Enter the "+i+"st values");
			
			li.add(s.nextInt());
		}
		
		int length = li.size();
		
		System.out.println("length of the array : "+length);
	}
}
