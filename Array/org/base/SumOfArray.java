package org.base;


import java.util.Scanner;

public class SumOfArray {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre the length of array : ");
		int length = sc.nextInt();
		
		int arr[]= new int[length];
		
		 int sum = 0; 
		
		for (int i = 0; i < length; i++) {
			
			arr[i]=sc.nextInt();
			
		
			
			sum = sum+arr[i];
			
		}
		
		System.out.println("sum of the given arrays "+sum);
	}
	
	
 
}
