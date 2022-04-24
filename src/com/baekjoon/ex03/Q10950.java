package com.baekjoon.ex03;

import java.util.Scanner;

public class Q10950 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int sum = 0;
			for (int j = 0; j < 2; j++) {
				sum = sum + sc.nextInt();
				
			}
			System.out.println(sum);
			
		}
		
		sc.close();
		
	}

}
