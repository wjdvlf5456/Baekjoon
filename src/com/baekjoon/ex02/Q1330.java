package com.baekjoon.ex02;

import java.util.Scanner;

public class Q1330 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numA = sc.nextInt();
		int numB = sc.nextInt();
		
		
		if (numA>numB) {
			System.out.println(">");
			
		}else if(numA<numB) {	
			System.out.println("<");
			
		} else {
			System.out.println("==");

		}
		
		sc.close();
		
	}

}
