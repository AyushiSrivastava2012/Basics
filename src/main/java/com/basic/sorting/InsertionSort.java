package com.basic.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- != 0){
			int n = in.nextInt();
			int arr[] = new int[n];

			for(int i=0;i<n;i++){
				arr[i] = in.nextInt();
			}

			for(int i=0;i<n;i++){
				int key = arr[i];
	            int j = i-1;
	 
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j>=0 && arr[j] > key)
	            {
	                arr[j+1] = arr[j];
	                j = j-1;
	            }
	            arr[j+1] = key;

			}

			//print
			for(int i=0;i<n;i++){
				System.out.print(arr[i] +" ");
			}
		}


		in.close();
	}
}
