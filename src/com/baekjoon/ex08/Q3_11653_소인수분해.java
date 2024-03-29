package com.baekjoon.ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q3_11653_소인수분해 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		for (int i = 2; i <= n; i++) {

			int count = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					count++;
				}

			}

			if (count < 1) {

				while (n % i == 0) {

					n = n / i;
					bw.write(Integer.toString(i));
					bw.write("\n");

				}

			}

			if (n < 2) {
				break;
			}

		}

		bw.close();
		br.close();

	}

}
