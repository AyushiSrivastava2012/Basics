package com.basic.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- != 0){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = in.nextInt();
			}

			for(int i=1;i<n;i++){
				Boolean swapped = false;
				for(int j=0;j<n-i;j++){
					if(arr[j]>arr[j+1]){
						int tmp = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=tmp;
						swapped = true;
					}
				}
				if(!swapped)
					break;
			}

			//print
			for(int i=0;i<n;i++){
				System.out.print(arr[i] +" ");
			}
		}


		in.close();
	}
}
