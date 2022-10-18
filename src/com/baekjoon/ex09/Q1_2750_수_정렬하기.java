package com.baekjoon.ex09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1_2750_수_정렬하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int numbers = Integer.parseInt(st.nextToken());

		int[] nar = new int[numbers];

		for (int i = 0; i < numbers; i++) {
			nar[i] = Integer.parseInt(br.readLine());

		}

		Arrays.sort(nar);

		for (int i = 0; i < nar.length; i++) {
			System.out.println(nar[i]);
		}

		br.close();

	}

}
