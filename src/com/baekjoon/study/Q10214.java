package com.baekjoon.study;

import java.util.Scanner;

public class Q10214 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		int ys = sc.nextInt();
		int kr = sc.nextInt();

		for (int i = 1; i <= test; i++) {
			if (ys > kr) {
				System.out.println("Yonsei");
			} else if (ys < kr) {
				System.out.println("Korea");
			} else {
				System.out.println("Draw");
			}

		}

		sc.close();

	}

}
