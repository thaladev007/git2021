package org.base;

import java.util.Scanner;

public class Average {


      public static void main(String[] args) {
		
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.println("Enter the array length :");
    	  
    	  int length = sc.nextInt();
    	  
    	  int arr[]= new int[length]; 
    	  
    	  System.out.println("Enter the elements of the array");
    	  
    	   int sum = 0;
    	   int count=0;
    	   int avg=0;
    	  
    	  for (int i=0; i<length;i++) {
    		  
    		  arr[i]=sc.nextInt();
    		  
    		 count=i+1;
    		  
    		 sum = sum+arr[i];
    	  }
    	
    	  avg = sum/count;
    	  float avg1 = avg;
    	  
    	  System.out.println("Average of the given array is :"+avg1);
	}
}
