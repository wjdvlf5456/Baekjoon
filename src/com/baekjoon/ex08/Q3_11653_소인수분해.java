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

		List<Integer> dList = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count < 1) {
				dList.add(i);
			}

		}

		int i = 0;

		while (n > 1) {
			if (n % dList.get(i) == 0) {
				n = n / dList.get(i);
				System.out.println(dList.get(i));

			} else {
				i++;

			}

		}

		br.close();

	}

}
