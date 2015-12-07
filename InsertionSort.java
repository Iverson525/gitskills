package com.bookswork;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double[] list={2,9,5,4,8,1,6};
	insertionSort(list);
	for(int i=0;i<list.length;i++){
		System.out.printf("%.2f ",list[i]);
	}
	
	}
	public static void insertionSort(double[] list){
		for(int i=1;i<list.length;i++){
			double currenElem=list[i];
			int k;
			for( k=i-1;k>=0&&list[k]>currenElem;k--){
				list[k+1]=list[k];
			}
			list[k+1]=currenElem;
		}
	}
}
