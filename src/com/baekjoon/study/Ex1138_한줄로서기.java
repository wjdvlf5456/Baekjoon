package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex1138_한줄로서기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<Integer> nList = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());

		int[] height = new int[N + 1];
		height[0] = -1;

		// 이미 줄에 섰는지 판독
		Boolean[] flag = new Boolean[N + 1];
		flag[0] = true;

		for (int i = 1; i <= N; i++) {
			flag[i] = false;
		}

		// 키 순서
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			height[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= N; i++) {
			if (height[i] == 0) {
				nList.add(i);
				flag[i] = true;
				break;
			}
		}

		int count = 0;

		while (nList.size() < N - 1) {

			for (int i = 1; i <= N; i++) {
				count = 0;
				if (flag[i] == true) {
					continue;
				}

				for (int j = 0; j < nList.size(); j++) {
					if (i < nList.get(j)) {
						count++;
					}

				}

				if (count == height[i]) {
					nList.add(i);
					flag[i] = true;
				}

			}
		}

		for (int n : nList) {
			bw.append(Integer.toString(n) + " ");

		}
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == false) {
				bw.append(Integer.toString(i));
				break;
			}
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
