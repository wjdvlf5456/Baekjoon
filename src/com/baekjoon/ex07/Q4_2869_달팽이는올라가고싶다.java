package com.baekjoon.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4_2869_달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		int current = 0;
		int count = 0;

		while (current < x) {
			current += a;
			count++;
			if (current >= x) {
				break;
			}

			current -= b;

		}
		
		System.out.println(count);

		br.close();

	}

}
