package com.baekjoon.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1672_DNA해독 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<String> nList = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());

		String DNA = br.readLine();
		String[] words = DNA.split("(?<!^)");
		for (int i = 0; i < words.length; i++) {
			nList.add(words[i]);
		}

		nList.sort(Collections.reverseOrder());

		while (nList.size() > 1) {

			if (nList.get(0).equals("A") && nList.get(1).equals("A")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "A");

			} else if (nList.get(0).equals("G") && nList.get(1).equals("G")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "G");
			} else if (nList.get(0).equals("C") && nList.get(1).equals("C")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "C");
			} else if (nList.get(0).equals("T") && nList.get(1).equals("T")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "T");

			} else if (nList.get(0).equals("A") && nList.get(1).equals("G")
					|| nList.get(0).equals("G") && nList.get(1).equals("A")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "C");
			} else if (nList.get(0).equals("A") && nList.get(1).equals("C")
					|| nList.get(0).equals("C") && nList.get(1).equals("A")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "A");
			} else if (nList.get(0).equals("A") && nList.get(1).equals("T")
					|| nList.get(0).equals("T") && nList.get(1).equals("A")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "G");

			} else if (nList.get(0).equals("G") && nList.get(1).equals("C")
					|| nList.get(0).equals("C") && nList.get(1).equals("G")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "T");
			} else if (nList.get(0).equals("G") && nList.get(1).equals("T")
					|| nList.get(0).equals("T") && nList.get(1).equals("G")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "A");

			} else if (nList.get(0).equals("C") && nList.get(1).equals("T")
					|| nList.get(0).equals("T") && nList.get(1).equals("C")) {
				nList.remove(0);
				nList.remove(0);
				nList.add(0, "G");
			}

		}

		bw.append(nList.get(0));

		bw.flush();

		bw.close();
		br.close();

	}

}
