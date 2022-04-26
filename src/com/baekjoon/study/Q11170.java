package com.baekjoon.study;

import java.util.Scanner;

public class Q11170 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int i = 1; i <= test; i++) {

			if (test < 1 && test > 20) {
				System.out.println("다시 입력해주세요");
			} else {
				int numN = sc.nextInt();
				int numM = sc.nextInt();
				

				for (int j = numN; numM - j == 0; j++) {
					int sum = 0;

					while (j != 0) {
						if (j % 10 == 0) {
							sum += 1;
							System.out.println("sum = "+sum+"j는 "+j);
						}
						j = j / 10;
					}
					System.out.println("sum = "+sum+"j는 "+j);

				}
				System.out.println("sum = "+"i는 "+i);

			}
		}

		sc.close();

	}

}
