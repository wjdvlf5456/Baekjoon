package com.baekjoon.ex03;

import java.util.Scanner;

public class Q11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int sum = 0;
			for (int j = 0; j < 2; j++) {
				sum = sum + sc.nextInt();
			}
			System.out.println("Case #"+i+": " + sum);
		}

		sc.close();

	}

}
