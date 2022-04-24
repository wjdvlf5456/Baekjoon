package com.baekjoon.ex03;

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] get = new int[2];

		for (int i = 1; i <= num; i++) {		// 테스트 케이스
			int sum = 0;
			get[0] = sc.nextInt();
			get[1] = sc.nextInt();
			for (int j = 0; j <= 1; j++) {		// 2번
				sum = sum + get[j];
			}
			System.out.println("Case #" + i + ": " + get[0] + " + " + get[1] + " = " + sum);
		}

		sc.close();

	}

}
