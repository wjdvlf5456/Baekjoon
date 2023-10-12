package com.baekjoon.ex09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2556_최댓값 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] numArray = new int[9][9];

		int maxNum = 0;
		int a = 0;
		int b = 0;

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				numArray[i][j] = Integer.parseInt(st.nextToken());

			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (numArray[i][j] >= maxNum) {
					maxNum = numArray[i][j];
					a = i + 1;
					b = j + 1;
				}

			}
		}

		System.out.println(maxNum);
		System.out.println(a + " " + b);

		br.close();

	}

}
