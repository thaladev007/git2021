package org.base;

import java.util.Scanner;

public class Sample1 {
	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the total index of array");
		
		int index = s.nextInt();
		
		
		int[] a = new int[index];
		
		System.out.println("Enter the values on by one");
		
		for (int i = 0; i < index; i++) {
			
			System.out.println("Enter the "+i +"st value");
			
			
			 a[i]=s.nextInt();
			
		}
		System.out.println("************Array values in Horizontal Order***********************");
		for (int i = 0; i < a.length; i++) {
			
			
			System.out.print(a[i]+",");
		}
		
		
		
		
		
		
		
		
	}

}
