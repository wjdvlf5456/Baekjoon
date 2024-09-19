package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1284_집주소 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String numb;
		String[] numbs;

		int sum = 0;

		while (true) {
			numb = br.readLine();
			sum = 0;
			if (numb.equals("0")) {
				break;
			}
			numbs = numb.split("(?<!^)");
			sum += numb.length() + 1;
			for (int i = 0; i < numbs.length; i++) {
				if (numbs[i].equals("1")) {
					sum += 2;
				} else if (numbs[i].equals("0")) {
					sum += 4;
				} else {
					sum += 3;
				}
			}
			bw.append(Integer.toString(sum));
			bw.newLine();

		}

		bw.flush();

		bw.close();
		br.close();

	}

}
