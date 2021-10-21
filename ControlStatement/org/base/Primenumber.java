package org.base;

import java.util.Scanner;

public class Primenumber {
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value : ");
		
		int num = sc.nextInt();
		
		boolean flag = true;
		
		for (int i = 2; i <num; i++) {
			
			if(i%num==0) {
				flag=false;
				break;
			}
		}
			if(flag) {
				
				System.out.println(num+"is a prime number");
				
			}
			
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
