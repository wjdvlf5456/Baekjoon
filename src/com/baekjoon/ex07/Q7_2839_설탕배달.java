package com.baekjoon.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7_2839_설탕배달 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int result = 0;

		if (n % 3 == 0 || n % 5 == 0 || n % 8 == 0 || n % 5 == 3 || n % 8 == 3 || n % 8 == 5) {

		} else {
			result = -1;

		}

		System.out.println(result);

		br.close();

	}

}
