package com.baekjoon.ex03;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numN = sc.nextInt();
		int numX = sc.nextInt();

		for (int i = 1; i <= numN; i++) {
			int min = sc.nextInt();
			if (min < numX) {
				System.out.print(min + " ");

			} else {

			}
		}

		sc.close();

	}

}
