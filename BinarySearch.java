package com.bookswork;
/**
 * 功能：二分查找
 * @author Administrator
 *
 */
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] List=new int[10];
		System.out.println("输入数组元素:");
		for(int i=0;i<List.length;i++){
			 List[i]=input.nextInt();
		}
		int[] L=sort(List);
		System.out.println("排序后的数组:");
		for(int i=0;i<L.length;i++){
			System.out.printf("%d ",L[i]);
		}
		System.out.println();
		System.out.println("输入要查找的值:");
		int x=input.nextInt();
		int s=binarySeach(L,x);
		System.out.println("所查找值得位置:");
		System.out.println(s+1);
		
	}
	

	public static int[] sort(int[] List){
		int t;
		for(int i=0;i<List.length-1;i++)
			for(int j=0;j<List.length-i-1;j++){
				if(List[j]>List[j+1]){
					t=List[j];
					List[j]=List[j+1];
					List[j+1]=t;
				}
			}
		return List;
	}
	public static int binarySeach(int[] List,int key){
		int high=List.length-1;
		int low=0;
		while(high>=low){
			int mid=(high+low)/2;
			if(key<List[mid]){
				high=mid-1;
			}	
			else if(key==List[mid]){
				return mid;
			}
			else
				low=mid+1;
				
			
		}
		return -low-1;
	}
}
