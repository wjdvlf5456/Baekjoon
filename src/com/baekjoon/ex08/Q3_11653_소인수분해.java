package com.baekjoon.ex08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q3_11653_소인수분해 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		for (int i = 2; i <= n; i++) {

			int count = 0;
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					count++;
					break;
				}

			}

			if (count < 1) {
				while (n % i == 0) {
					n = n / i;
					System.out.println(i);
				}

			}
			if (n < 2) {
				break;
			}

		}

		br.close();

	}

}
