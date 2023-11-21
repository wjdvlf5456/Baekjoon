package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex18352_특정거리의도시찾기 {

	static int N;
	static int INF = 100000;
	static int[][] map;
	static int[] dist;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());	// 간선의 수
		int x = Integer.parseInt(st.nextToken());	// 출발점

		map = new int[N + 1][N + 1];
		dist = new int[N + 1];
		visited = new boolean[N + 1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = INF;
			}

		}

		int u;
		int v;
		int w;

		for (int i = 1; i <= m; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);

			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());

			map[u][v] = w;
			map[v][u] = w;

		}

		dijkstra(x);
		System.out.println(Arrays.toString(dist));

		br.close();

	}

	static int getMin() {
		int min = INF;
		int index = 0;
		for (int i = 1; i <= N; i++) {
			if (dist[i] < min && visited[i] == false) {
				min = dist[i];
				index = i;
			}

		}

		return index;
	}

	static void dijkstra(int start) {
		for (int i = 1; i <= N; i++) {
			dist[i] = map[start][i];

		}
		visited[start] = true;
		for (int i = 1; i <= N; i++) {
			int crt = getMin();
			visited[crt] = true;
			for (int j = 1; j <= N; j++) {
				if (visited[j] == false) {
					if (dist[crt] + map[crt][j] < dist[j]) {
						dist[j] = dist[crt] + map[crt][j];
					}

				}

			}

		}

	}

}
