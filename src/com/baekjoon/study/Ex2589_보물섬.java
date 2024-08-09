package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex2589_보물섬 {

	static String[] iii;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int column = Integer.parseInt(st.nextToken());
		int row = Integer.parseInt(st.nextToken());

		String[][] land = new String[column][row];

		String[] input;

		for (int i = 0; i < column; i++) {
			input = br.readLine().split("(?<!^)");

			for (int j = 0; j < row; j++) {
				land[i][j] = input[j];
			}
		}

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(land[i][j] + " ");
			}
			System.out.println("");
		}

		bw.close();
		br.close();
	}

	// 함수 생성

}
