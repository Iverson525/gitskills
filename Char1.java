/**
 * 社会保险号是否正确
 */
package com.bookswork;
import java.util.*;
public class Char1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			System.out.println("输入社保号(格式DDD-DD-DDDD)");
			String s=input.nextLine();
			input.close();
			if(valid(s))
				System.out.println("Valid SSN");
			else
				System.out.println("Invalid SSN");
	}
	public static boolean valid(String s){
		if(s.length()!=11)
			return false;
		else{
			for(int i=0;i<s.length();i++){
				if(i==3||i==6)
					i++;
				if(!Character.isDigit(s.charAt(i))||s.charAt(3)!='-'||s.charAt(6)!='-'){
					return false;
				}
			}

		}
		return true;
	}
}
