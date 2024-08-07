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
		
		

		int[] abc = new int[3];

		for (int i = 0; i < abc.length; i++) {
			abc[i] = Integer.parseInt(st.nextToken());
		}
		
		



		bw.flush();
		bw.close();
		br.close();

	}

}
