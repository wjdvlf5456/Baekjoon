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

		long[] numArray = new long[num + 1];

		numArray[0] = 0;
		numArray[1] = 1;
		numArray[2] = 1;

		for (int i = 3; i < numArray.length; i++) {
			numArray[i] = numArray[i - 2] + numArray[i - 1];
		}

		System.out.println(numArray[num]);

		br.close();

	}

}
