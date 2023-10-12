package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex2941_크로아티아알파벳 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String text = br.readLine();
		String[] croatia = text.split("(?<!^)");
		boolean flag = false;

		List<String> tList = new ArrayList<>();
		String[] croatiaAlphabet = { "c", "d", "l", "n", "s", "z" };
		for (int i = 0; i < croatiaAlphabet.length; i++) {
			tList.add(croatiaAlphabet[i]);
		}

		for (int i = 0; i < text.length(); i++) {
			if (flag == true) {
				if (croatia[i - 1].equals("c")) {
					if (croatia[i].equals("=") || croatia[i].equals("-")) {
						flag = true;
					} else {
						flag = false;
					}
				} else {
					flag = false;

				}

			} else {

				if (tList.contains(croatia[i])) {
					flag = true;
					System.out.println(i);

				} else {
					flag = false;

				}
			}
			if (flag == true) {
				System.out.println("flag == true"+i);

			} else {
				System.out.print(croatia[i] + "");
				flag = false;

			}

		}

		bw.flush();
		bw.close();
		br.close();

	}

}
