package com.baekjoon.ex08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1_1978_소수찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int[] data = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(st.nextToken());

		}

		Arrays.sort(data);

		// 소수의 개수
		int demical = 0;

		for (int i = 0; i < data.length; i++) {
			int count = 0;
			if (data[i] >= 2) {
				for (int j = 2; j < data[i]; j++) {
					if (data[i] % j == 0) {
						count++;
					}

				}
				if (count < 1) {
					demical++;
				}

			}
		}

		System.out.println(demical);

		br.close();
	}

}
