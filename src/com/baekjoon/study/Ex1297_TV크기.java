package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1297_TV크기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int D = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		int DD = D * D;

		double HHH = (double) (H * H) / (H * H + W * W);
		double WWW = (double) (W * W) / (H * H + W * W);
		int DDH = (int) Math.sqrt(DD * HHH);
		int DDW = (int) Math.sqrt(DD * WWW);

		bw.append(Integer.toString(DDH));
		bw.append(" ");
		bw.append(Integer.toString(DDW));
		
		bw.flush();

		bw.close();
		br.close();

	}

}
