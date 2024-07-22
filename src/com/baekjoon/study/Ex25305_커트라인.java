package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Ex25305_커트라인 {
	public static void main(String[] args) throws IOException {

		List<Integer> sList = new ArrayList<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			sList.add(Integer.parseInt(st.nextToken()));
		}

		sList.sort(Collections.reverseOrder());

		System.out.println(sList.get(k - 1));

		br.close();

	}

}
