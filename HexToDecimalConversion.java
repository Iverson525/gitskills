/**
 *十六进制转二进制
 */
package com.bookswork;

import java.util.Scanner;

public class HexToDecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		System.out.println(hexToDecimal(s.toUpperCase()));

	}
	public static int hexToDecimal(String hex){
		int decimalValue=0;
		for(int i=0;i<hex.length();i++){
			char hexChar=hex.charAt(i);
			decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int hexCharToDecimal(char ch){
		if(ch>='A'&&ch<='F')
			return 10+ch-'A';
		else
			return ch-'0';
	}
}
