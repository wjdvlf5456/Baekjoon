package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 출처: https://yermi.tistory.com/entry/%EB%B0%B1%EC%A4%80BOJ-2154%EB%B2%88-%EC%88%98-%EC%9D%B4%EC%96%B4-%EC%93%B0%EA%B8%B0-3-JAVA-%EC%9E%90%EB%B0%94

public class Ex2154_수이어쓰기3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		String str = st.nextToken();

		for (int i = 1; i < 1000000; i++) {
			sb.append(i);
		}

		System.out.println(sb.indexOf(str)+1);

		br.close();

	}

}


