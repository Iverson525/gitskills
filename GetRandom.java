package com.bookswork;

public class GetRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int getRandom(int... numbers) {
		   int a=1+(int)(Math.random()*20);
		   for(int i=0;i<numbers.length;i++)
			   for(int j=0;j<numbers.length;j++){
				   if(a==numbers[j]) 
				   {
					   a=1+(int)(Math.random()*20);
				   }
			   }
		   return a;
		 }
}
