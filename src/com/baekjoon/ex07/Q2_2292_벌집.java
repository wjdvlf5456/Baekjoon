package com.baekjoon.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_2292_벌집 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int i = 6;
		int count = 1;

		while (n > 1) {
			n = n - i;
			count++;
			i += 6;

		}

		System.out.println(count);

		br.close();

	}

}
