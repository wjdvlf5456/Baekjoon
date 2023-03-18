package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Ex2309_일곱난쟁이 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> dList = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			dList.add(Integer.parseInt(st.nextToken()));
			sum = sum + dList.get(i);

		}

		int interupt = 0;
		
		
		for (int i = 0; i < 9; i++) {
			if (interupt==1) {
				break;
			}
			for (int j = i + 1; j < 9; j++) {
				if (sum - dList.get(i) - dList.get(j) == 100) {
					dList.remove(i);
					dList.remove(j-1);
					interupt = 1;
					break;
				}

			}
		}
		Collections.sort(dList);
		
		for (int i = 0; i < dList.size(); i++) {
			System.out.println(dList.get(i));
		}
		

		br.close();

	}

}
