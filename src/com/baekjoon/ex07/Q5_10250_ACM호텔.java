package com.baekjoon.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5_10250_ACM호텔 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int testData = Integer.parseInt(st.nextToken());
		String[] testcase = new String[testData];

		for (int i = 0; i < testData; i++) {

			st = new StringTokenizer(br.readLine());

			int height = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int customer = Integer.parseInt(st.nextToken());
			

			String result = "";

			// 꼭대기층 도달시
			if (customer % height == 0) {
				result = height + String.format("%02d", (customer / height)+1);

			} else {
				result = customer % height + String.format("%02d", (customer / height)+1);

			}

			testcase[i] = result;
		}
		
		for (int i = 0; i < testcase.length; i++) {
			System.out.println(testcase[i]);
		}

		br.close();

	}

}
