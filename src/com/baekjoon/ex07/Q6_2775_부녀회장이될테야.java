package com.baekjoon.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_2775_부녀회장이될테야 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int test = Integer.parseInt(st.nextToken());

		// 층별몇호별로 미리 배열에 값 입력
		int[][] house = new int[15][15];

		for (int i = 0; i <= 14; i++) {
			for (int j = 1; j <= 14; j++) {
				if (i == 0) {
					house[i][j] = j;
				} else {
					int sum = 0;
					for (int k = 1; k <= j; k++) {
						sum += house[i - 1][k];
					}
					house[i][j] = sum;

				}

			}
		}

		
		for (int i = 0; i < test; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());

			System.out.println(house[k][n]);

		}

		
		br.close();

	}

}
