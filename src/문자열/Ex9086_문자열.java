package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex9086_문자열 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(st.nextToken());

		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine());
			//sb = new StringBuilder();
			sb.append(st.nextToken());
			bw.write(sb.charAt(0));
			bw.write(sb.charAt(sb.length() - 1));
			bw.newLine();
			sb.delete(0, sb.length());
			bw.flush();

		}

		bw.close();
		br.close();

	}

}
