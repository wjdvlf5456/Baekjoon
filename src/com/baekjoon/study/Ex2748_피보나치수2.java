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

		long num0 = 0;
		long num1 = 1;

		int i = 2;
		long fib = 0;

		if (num == 0) {
			System.out.println(num0);
		} else if (num == 1) {
			System.out.println(num1);

		} else {
			while (i <= num) {
				fib = num0 + num1;
				num0 = num1;
				num1 = fib;

				i++;
			}
			System.out.println(fib);

		}
		br.close();

	}

}
