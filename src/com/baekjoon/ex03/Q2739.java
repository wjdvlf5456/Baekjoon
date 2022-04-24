package com.baekjoon.ex03;

import java.util.Scanner;

public class Q2739 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			
			for (int j = num; j < num+1 ; j++) {
				System.out.println(j+" * "+i+" = "+j*i);	//	공백있으면 오류
			}
			
		}
		
		sc.close();
		
	}

}
