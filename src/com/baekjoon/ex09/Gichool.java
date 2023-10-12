package com.baekjoon.ex09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Gichool {

	public static void main(String[] args) throws IOException {

		List<String> sList = new ArrayList<String>();

		Reader fr = new FileReader("/Users/choijungphil/javaStudy/workspace/Baekjoon/src/com/baekjoon/test.txt");
		BufferedReader br = new BufferedReader(fr);
		int i = 0;
		while (true) {
			sList.add(br.readLine());
			if (sList.get(i) == null) {
				sList.remove(i);

				break;
			}
			i++;
		}

		for (int j = 0; j < sList.size(); j++) {
			System.out.println(sList.get(j));
		}

		
		Writer fw = new FileWriter("/Users/choijungphil/javaStudy/workspace/Baekjoon/src/com/baekjoon/pass.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		Writer ffw = new FileWriter("/Users/choijungphil/javaStudy/workspace/Baekjoon/src/com/baekjoon/fail.txt");
		BufferedWriter bfw = new BufferedWriter(ffw);

		for (int j = 0; j < sList.size(); j++) {
			StringTokenizer st = new StringTokenizer(sList.get(j));

			int student = Integer.parseInt(st.nextToken());

			int average = 0;
			for (int k = 0; k < 5; k++) {
				average += Integer.parseInt(st.nextToken());
			}

			if (average / 5 >= 30) {
				bw.write(sList.get(j));
				bw.newLine();
				
			} else {
				bfw.write(sList.get(j));
				bfw.newLine();
			}

		}


		bfw.close();
		bw.close();
		br.close();

	}

}
