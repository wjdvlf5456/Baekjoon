package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2748_피보나치수2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());

		long dp1 = 0;
		long dp2 = 1;
		long fib = 0;

		if (num == 0) {
			System.out.println(dp1);
		} else if (num == 1) {
			System.out.println(dp2);
		} else {

			for (int i = 2; i <= num; i++) {
				fib = dp1 + dp2;
				dp1 = dp2;
				dp2 = fib;
			}
			System.out.println(fib);

		}

		br.close();

	}

}
