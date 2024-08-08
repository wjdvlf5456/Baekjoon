package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex10817_세수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int result = 0;

		if ((a >= b && b >= c) || (a <= b && b <= c)) {
			result = b;
		} else if ((b >= c && c >= a) || (b <= c && c <= a)) {
			result = c;
		} else if ((c >= a && a >= b) || (c <= a && a <= b)) {
			result = a;
		} else {

		}

		bw.append(Integer.toString(result));

		bw.flush();
		bw.close();
		br.close();

	}

}
