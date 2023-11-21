package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1753_최단경로연습 {

	static int N, M;
	static int INF = 10000;
	static int[][] map;
	static int[] minValue;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		str = br.readLine();

		int startNode = Integer.parseInt(str);

		int u;
		int v;
		int w;

		minValue = new int[N + 1];
		visited = new boolean[N + 1];
		map = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = INF;

			}

		}

		for (int i = 1; i <= M; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);

			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());

			map[u][v] = w;
		}

		dijkstra(startNode);

		System.out.println(Arrays.toString(minValue));

		br.close();

	}

	static int getMin() {
		int min = INF;
		int index = 0;

		for (int i = 1; i <= N; i++) {
			if (minValue[i] < min && visited[i] == false) {
				min = minValue[i];
				index = i;
			}
		}

		return index;
	}

	static void dijkstra(int start) {
		for (int i = 1; i <= N; i++) {
			minValue[i] = map[start][i];

		}

		visited[start] = true;

		for (int i = 1; i <= N; i++) {
			int crt = getMin();
			visited[crt] = true;
			for (int j = 1; j <= N; j++) {
				if (visited[j] == false) {
					if (minValue[crt] + map[crt][j] < minValue[j]) {
						minValue[j] = minValue[crt] + map[crt][j];

					}

				}

			}

		}

	}

}
