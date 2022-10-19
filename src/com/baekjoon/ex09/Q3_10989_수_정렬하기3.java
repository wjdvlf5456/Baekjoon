package com.baekjoon.ex09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3_10989_수_정렬하기3 {

	public static void main(String[] args) throws IOException {

		List<Integer> nList = new ArrayList<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			nList.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(nList);

		for (int i = 0; i < nList.size(); i++) {
			sb.append(nList.get(i));
			sb.append("\n");

		}
		System.out.println(sb);

		br.close();

	}

}
