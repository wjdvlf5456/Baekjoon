package com.baekjoon.study;

import java.util.Scanner;

public class Q11170 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int i = 1; i <= test; i++) {
			int numN = sc.nextInt();
			int numM = sc.nextInt();

			int sum = 0;
			for (int j = numN; j <= numM; j++) {
				int number = j;
				if (number == 0) {
					sum++;
					continue;
				}
				while (number > 1) {
					if (number % 10 == 0) {
						sum++;

					}
					number = number / 10;
				}
			}
			System.out.println(sum);
		}

		sc.close();

	}

}
