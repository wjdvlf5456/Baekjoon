package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex2460_지능형기차2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = 0;
		int people = 0;
		StringTokenizer st;

		int down = 0;
		int up = 0;

		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			down = Integer.parseInt(st.nextToken());
			up = Integer.parseInt(st.nextToken());

			people -= down;
			if (max < people) {
				max = people;
			}
			people += up;
			if (max < people) {
				max = people;
			}

		}
		bw.append(Integer.toString(max));
		bw.flush();

		bw.close();
		br.close();

	}

}
