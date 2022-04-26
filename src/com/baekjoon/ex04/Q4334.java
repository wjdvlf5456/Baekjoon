package com.baekjoon.ex04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4334 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		int howmany = Integer.parseInt(br.readLine());	//케이스가 몇개 인지	==int howmany = sc.nextInt();
		
		for (int i = 0; i < howmany; i++) {	
			
			int n = Integer.parseInt(br.readLine());	//학생 수가 몇 명인지
			
			int[] arrays = new int[n];
			st = new StringTokenizer(br.readLine());
			
			int sum = 0;
			for (int j = 0; j < arrays.length; j++) {
				arrays[j]=Integer.parseInt(st.nextToken());
				sum = sum + arrays[j];
			}
			System.out.println(sum/n);
			
			double average = 0;
			
			for (int a : arrays) {
				if (sum/n < a) {
				average = average+1;
				}
			}
			double many = (average/n)*100;
			System.out.println(String.format("%.3f", many));	//Math.round()는 소수점 아래가 0이면 표현하지 않아서 String.format을 사용한다.
		}
		
		
	}

}
