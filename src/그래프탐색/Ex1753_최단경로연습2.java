package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1753_최단경로연습2 {

	static int N, M;
	static int INF = 10000;
	static int[][] map;
	static int[] path;
	static boolean[] visited;
	static boolean oneLine = false;

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
			backtracking(i, 1);
			if (oneLine) {
				break;
			}

		}

		if (oneLine) {
			System.out.println("O");

		} else {
			System.out.println("X");

		}

		br.close();

	}

	static void backtracking(int start, int depth) {
		if (depth == N && map[path[0]][path[N - 1]] == 1) {
			oneLine = true;
			return;

		}

		visited[start] = true;

		for (int i = 1; i <= N; i++) {
			if (visited[i] == false && map[start][i] == 1) {
				visited[i] = true;
				path[depth] = i;
				backtracking(i, depth + 1);

				visited[i] = false;

			}

		}

	}

}
