/**2015.12.3
 * 回文数
 */
package com.bookswork;
import java.util.*;
public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		input.close();
		if(isPalindrome(s))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
	public static boolean isPalindrome(String s){
		int low=0;
		int high=s.length()-1;
		while(low<high){
			if(s.charAt(low)!=s.charAt(high))
					return false;
			low++;
			high--;
		}
		return true;
	}

}
