package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Ex1181_단어정렬 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		String[] stArray = new String[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			stArray[i] = st.nextToken(); 

		}

		// 단어정렬하기
		Arrays.sort(stArray, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {		// 길이순으로 먼저 정렬하기
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();	// 사전순으로 정렬하기
				}
			}

		});

		
		for (int i = 0; i < stArray.length; i++) {
			System.out.println(stArray[i]);
		}
		

		br.close();

	}

}
