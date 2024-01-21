package 반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q25304_영수증 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int all = Integer.parseInt(br.readLine());
		int types = Integer.parseInt(br.readLine());

		int sum = 0;

		int price;
		int many;

		StringTokenizer st;

		for (int i = 0; i < types; i++) {
			st = new StringTokenizer(br.readLine());

			price = Integer.parseInt(st.nextToken());
			many = Integer.parseInt(st.nextToken());

			sum += price * many;

		}

		if (sum == all) {
			bw.write("Yes");
		} else {
			bw.write("No");

		}

		bw.flush();
		bw.close();
		br.close();

	}

}
