package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1914_하노이탑 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int[][] nArr = new int[n+1][4];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 4; j++) {
				if(j==1) {
					nArr[i][j] = i;
					
				}else {
					nArr[i][j] = 0;
					
				}
			}

		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(nArr[i][j] +" ");
			}
			System.out.println("");
		}

		
		int d = moving(8);
		System.out.println("d: "+d);
		br.close();
		

	}
	
	

	public static int moving(int n) {
		
		
		if (n==1) {
			System.out.println(n);
			return n;
		} else {
			System.out.println(n);
			return moving(n-1);
		}

	};

}
