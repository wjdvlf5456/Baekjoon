package com.baekjoon.ex07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_1193_분수찾기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int count = 1;
		int i = 1;
		int sum = 0;
		int temp = x;

		while (x > 0) {
			x -= i;
			sum += i;
			i++;
			count++;

		}

		String result = "";
		temp = sum - temp + 1;

		// 홀수면 좌측이 1부터 시작
		if (count % 2 == 1) {
			result = (count - temp) + "/" + temp;

			// 짝수면 우측이 1부터 시작
		} else {
			result = temp + "/" + (count - temp);

		}

		System.out.println(result);

		br.close();

	}

}
