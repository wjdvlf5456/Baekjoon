package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1526_가장큰금민수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String d = br.readLine();

		int N;

		Boolean flag = true;

		while (true) {
			N = Integer.parseInt(d);
			flag = true;

			for (int i = 0; i < d.length(); i++) {
				if (d.charAt(i) == '4' || d.charAt(i) == '7') {

				} else {
					N--;
					flag = false;

					break;
				}
			}

			if (flag == false) {
				d = Integer.toString(N);
			} else {
				bw.append(d);
				break;
			}
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
