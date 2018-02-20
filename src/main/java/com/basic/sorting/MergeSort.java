package com.basic.sorting;

import java.util.Scanner;

public class MergeSort {

	private int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- != 0){
			int n = in.nextInt();
			int arr[] = new int[n];

			//take inpput
			for(int i=0;i<n;i++){
				arr[i] = in.nextInt();
			}

			MergeSort sort = new MergeSort();
			sort.arr = arr;
			sort = merge(sort,0,arr.length-1);

			for(int i=0;i<n;i++){
				System.out.print(sort.arr[i]+" ");
			}
		}


		in.close();
	}



	private static MergeSort merge(MergeSort sort, int start, int end){

		if(start < 0)
			return sort;
		else if (end > sort.arr.length)
			return sort;
		else if(start >= end){
			//start merge
			return sort;
		}
		else{
			MergeSort sort1 = merge(sort,start,(((int)Math.floor(start+end)/2) -1));
			MergeSort sort2  = merge(sort,(((int)Math.floor(start+end)/2) +1),end);
			
			System.out.print(sort1.arr.toString()+" ");
			System.out.println(sort2.arr.toString());
			//merge
			//int[]arr3 = new int[arr1.length+arr2.length];
			
			int i=0,j=0,k=0;
			int t=0;
			for(; k< sort.arr.length && i< sort1.arr.length && j< sort2.arr.length;k++){
				if(sort1.arr[i] < sort2.arr[j]){
					sort.arr[k]=sort1.arr[i];
					i++;
					t++;
				}else{
					sort.arr[k]=sort2.arr[j];
					j++;
					t++;
				}
			}
			if(i<sort1.arr.length){
				for( ;i<sort1.arr.length;i++){
					sort.arr[t++]=sort1.arr[i];
				}
			}
			if(j<sort2.arr.length){
				for( ;j<sort2.arr.length;j++){
					sort.arr[t++]=sort2.arr[j];
				}
			}
			return sort;
		}
		
	}
}