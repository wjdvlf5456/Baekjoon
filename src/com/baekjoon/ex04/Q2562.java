package com.baekjoon.ex04;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[9];

		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();
		num[5] = sc.nextInt();
		num[6] = sc.nextInt();
		num[7] = sc.nextInt();
		num[8] = sc.nextInt();

		int max = 0;
		int numwhere = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];
				numwhere = i;

			}

		}
		System.out.println(max);
		System.out.println(numwhere);

		sc.close();
	}

}
