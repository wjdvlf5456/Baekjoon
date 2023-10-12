package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex11720_숫자의합 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nArr;

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		nArr = st.nextToken().split("(?<!^)");

		int count = 0;

		for (int i = 0; i < n; i++) {
			count += Integer.parseInt(nArr[i]);

		}

		bw.write(Integer.toString(count));

		bw.flush();
		bw.close();
		br.close();

	}

}
