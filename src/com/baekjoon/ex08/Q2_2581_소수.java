package com.baekjoon.ex08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q2_2581_소수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		List<Integer> nList = new ArrayList<Integer>();

		for (int i = m; i <= n; i++) {

			// 1에서 시작할 경우 제외
			if (i < 2) {
				continue;
			} else {

				int count = 0;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {		// 한번이라도 나눠질 경우 소수X
						count++;
					}
				}

				if (count < 1) {
					nList.add(i);
				}
			}

		}

		int sum = 0;

		// 소수가 있을 경우
		if (nList.size() > 0) {
			for (int i = 0; i < nList.size(); i++) {
				sum += nList.get(i);
			}

			System.out.println(sum);
			System.out.println(nList.get(0));

		// 소수가 없을 경우
		} else {
			System.out.println(-1);

		}

		br.close();

	}

}
