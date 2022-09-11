package com.baekjoon.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4_2869_달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {

		/* 반례모음
		 9 1 100			13
		 2 1 5 				4
		 100 99 1000000000	999999901			999999901 == 1000000000-99
		
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		// 하루동안 이동하는 거리
		int perDay = a - b;
		int night = x - b;

		int result = 0;

		// 나머지가 있으면 하루 추가
		if (night % perDay > 0) {
			result = night / perDay + 1;

		} else {
			result = night / perDay;

		}

		System.out.println(result);

		br.close();

	}

}
