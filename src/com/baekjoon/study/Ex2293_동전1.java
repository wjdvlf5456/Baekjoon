package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2293_동전1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] nArr = new int[n];
		 
		for (int i = 0; i < nArr.length; i++) {
			st = new StringTokenizer(br.readLine());
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		
		
		
		br.close();
		
	}
	

}
