package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1 {

	static int N;
	static int[][] map;
	static boolean[] visited;
	static int[] path;
	static boolean inOneLine = false;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		N = Integer.parseInt(st.nextToken());
		map = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		path = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}

		}

		for (int i = 1; i <= N; i++) {
			path[0] = i;
			back(i, 1);
			if (inOneLine) {
				break;
			}

		}

		if (inOneLine) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}

		br.close();

	}

	static void back(int n, int depth) {
		if (depth == N && map[path[0]][path[N - 1]] == 1) {
			inOneLine = true;
			return;

		}

		visited[n] = true;

		for (int i = 1; i <= N; i++) {
			if (visited[i] == false && map[n][i] == 1) {
				visited[i] = true;
				path[depth] = i;
				back(i, depth + 1);
				visited[i] = false;

			}

		}

	}

}
