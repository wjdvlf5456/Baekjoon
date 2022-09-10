package com.baekjoon.ex07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1712_손익분기점 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());	// 고정 비용
		int b = Integer.parseInt(st.nextToken());	// 가변 비용
		int c = Integer.parseInt(st.nextToken());	// 제품 가격

		// 판매량
		int salesRate = 0;

		if (b >= c) {
			salesRate = -1;
		} else {
			salesRate = a / (c - b) + 1;
		}
		bw.write(Integer.toString(salesRate));

		bw.close();
		br.close();
	}

}
