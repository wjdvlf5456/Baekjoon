package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1236_성지키기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String[] x;
		Boolean flag = false;
		String[][] castle = new String[n][m];

		int count = 0;

		for (int i = 0; i < n; i++) {
			x = br.readLine().split("(?<!^)");
			for (int j = 0; j < m; j++) {
				castle[i][j] = x[m];
			}
		}

		for (int i = 0; i < n; i++) {
			flag = false;
			for (int j = 0; j < m; j++) {
				if (castle[i][j].equals("X")) {
					flag = true;
					break;
				}

			}
			if (flag == false) {
				count++;

			}

		}

		br.close();

	}

}
