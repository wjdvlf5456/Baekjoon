package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1436_영화감독숌 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int result = 0;
		String d = "";
		int count = 0;

		for (int i = 666; i < 1000000000; i++) {
			d = Integer.toString(i);
			if (d.contains("666")) {
				count++;
			}
			if (count == N) {
				result = i;
				break;
			}
		}

		bw.append(Integer.toString(result));

		bw.flush();
		bw.close();
		br.close();

	}

}
