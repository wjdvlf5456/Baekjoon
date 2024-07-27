package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex9063_대지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int xMax = 0;
		int yMax = 0;

		int xMin = 0;
		int yMin = 0;

		int t = Integer.parseInt(st.nextToken());

		int[] xx = new int[t];
		int[] yy = new int[t];

		int x = 0;
		int y = 0;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			xx[i] = x;
			yy[i] = y;

		}

		int result = 0;

		Arrays.sort(xx);
		Arrays.sort(yy);
		xMax = xx[t - 1];
		xMin = xx[0];

		yMax = yy[t - 1];
		yMin = yy[0];

		if (xMax - xMin == 0 || yMax - yMin == 0 || t == 1) {
			bw.append("0");
			bw.flush();
		} else {
			result = (xMax - xMin) * (yMax - yMin);
			bw.append(Integer.toString(result));
			bw.flush();

		}

		bw.close();
		br.close();

	}

}
