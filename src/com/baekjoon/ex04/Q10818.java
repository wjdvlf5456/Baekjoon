package com.baekjoon.ex04;

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[sc.nextInt()];

		int min = 1000000;
		int max = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(min + " " + max);

		sc.close();

	}

}
