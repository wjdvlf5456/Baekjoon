package 백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex01_Q15649_N과M {

	static boolean[] bool;
	static int[] mm;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str);

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		bool = new boolean[n];
		mm = new int[m];

		dfs(n, m, 0);

		bw.flush();
		bw.close();
		br.close();

	}

	static void dfs(int n, int m, int depth) {
		if (depth == m) {

			// for (int i = 0; i < mm.length; i++) {
			// System.out.print(mm[i] + " ");
			// }
			for (int i : mm) {
				System.out.print(i + " ");

			}

			System.out.println("");
			return;
		}

		for (int i = 0; i < n; i++) {
			if (bool[i] == false) {

				bool[i] = true;
				mm[depth] = i + 1;
				dfs(n, m, depth + 1);

				bool[i] = false;

			}
		}

	}

}
