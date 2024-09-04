package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex10773_제로 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<String> nList = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());

		String numb;

		for (int i = 0; i < N; i++) {
			numb = br.readLine();

			if (numb.equals("0")) {
				nList.remove(nList.size() - 1);
			} else {
				nList.add(numb);
			}

		}
		int result = 0;

		for (String i : nList) {
			result += Integer.parseInt(i);
		}
		bw.append(Integer.toString(result));

		bw.flush();
		bw.close();
		br.close();

	}

}
