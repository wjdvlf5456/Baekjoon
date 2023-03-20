package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Ex7568_덩치 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> bMap = new TreeMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int bigGuy = Integer.parseInt(st.nextToken());

		for (int i = 0; i < bigGuy; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			bMap.put(x, y);

		}
		

		System.out.println(bMap.values());
		
		
		br.close();

	}

}
