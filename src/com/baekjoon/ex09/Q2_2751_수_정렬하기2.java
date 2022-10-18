package com.baekjoon.ex09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Q2_2751_수_정렬하기2 {

	public static void main(String[] args) throws IOException {

		List<Integer> nList = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int numb = Integer.parseInt(st.nextToken());

		for (int i = 0; i < numb; i++) {
			nList.add(Integer.parseInt(br.readLine()));

		}

		Collections.sort(nList);

		for (int i = numb - 1; i >= 0; i--) {
			sb.append(nList.get(i));
			sb.append("\n");

		}

		System.out.println(sb);

		br.close();
	}

}
