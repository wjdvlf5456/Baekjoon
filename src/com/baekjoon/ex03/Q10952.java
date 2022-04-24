package com.baekjoon.ex03;

import java.util.Scanner;

public class Q10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int sum = 0;
			for (int i = 1; i <= 2; i++) {
				int num = sc.nextInt();
				sum = sum + num;
			}
			if (sum + sum == 0 && sum * sum == 0) {
				break;
			}

			System.out.println(sum);
		}

		sc.close();

	}

}
