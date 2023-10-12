package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex27866_문자와문자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] stArr;
		StringTokenizer st = new StringTokenizer(br.readLine());
		stArr = st.nextToken().split("(?<!^)");

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		System.out.println(stArr[n - 1]);

		br.close();

	}

}
