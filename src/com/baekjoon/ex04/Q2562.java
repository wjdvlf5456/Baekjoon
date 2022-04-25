package com.baekjoon.ex04;

public class Q2562 {

	public static void main(String[] args) {

		int[] num = new int[9];

		int max = 0;
		int numwhere=0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*99)+1;

			if (num[i] > max) {
				max = num[i];
				numwhere=i;

			}

		}
		System.out.println(max);
		System.out.println(numwhere);

	}

}
