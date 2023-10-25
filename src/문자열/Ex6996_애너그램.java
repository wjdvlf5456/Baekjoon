package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Ex6996_애너그램 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb;
		String str;

		str = br.readLine();

		StringTokenizer st = new StringTokenizer(str);

		int testcase = Integer.parseInt(st.nextToken());

		List<String> wList = new ArrayList<>();

		String[] first;
		String[] second;

		String fWord;
		String sWord;

		boolean flag = false;

		for (int i = 0; i < testcase; i++) {
			flag = false;
			sb = new StringBuilder();
			str = br.readLine();
			st = new StringTokenizer(str);

			fWord = st.nextToken();
			sWord = st.nextToken();

			first = fWord.split("(?<!^)");
			second = sWord.split("(?<!^)");

			Arrays.sort(first);
			Arrays.sort(second);

			if (first.length != second.length) {
				flag = false;
			} else {
				for (int j = 0; j < first.length; j++) {
					if (!first[j].equals(second[j])) {
						flag = false;
						break;
					} else {
						flag = true;

					}

				}

			}

			bw.write(fWord);
			bw.write(" & ");
			bw.write(sWord);
			bw.write(" are");
			
			if (flag == false) {
				bw.write(" NOT");
			}

			bw.write(" anagrams.");
			bw.newLine();
			
			bw.flush();

		}

		bw.close();
		br.close();

	}

}
