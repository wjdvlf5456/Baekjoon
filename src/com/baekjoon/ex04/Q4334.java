package com.baekjoon.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4334 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());	//숫자 몇개 입력하는지
		
		int[] arrays = new int[n];
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		for (int i = 0; i < arrays.length; i++) {
			arrays[i]=Integer.parseInt(st.nextToken());
			sum = sum + arrays[i];
		}
		System.out.println(sum/n);
		
		
		double average = 0;
		
		for (int a : arrays) {
			if (sum/n < a) {
			average = average+1;
			}
		}
		double many = (average/n)*100;
		System.out.println(String.format("%.3f", many));
		
	}

}
