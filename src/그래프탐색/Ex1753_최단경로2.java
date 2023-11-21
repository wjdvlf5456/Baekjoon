package 그래프탐색;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1753_최단경로2 {

	static int N, M;
	static int INF = 1001;
	static int[][] map;
	static int[][] cMap;
	static int[] dist;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int startNum = Integer.parseInt(st.nextToken());

		map = new int[N + 1][N + 1];
		cMap = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				map[i][j] = INF;
			}

		}

		int u;
		int v;
		int w;

		dist = new int[N + 1];
		visited = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());

			map[u][v] = w;
			map[v][u] = w;

		}
		dijkstra(startNum);

		for (int i = 1; i <= N; i++) {
			if (i == startNum) {

			} else if (dist[i] > 1000) {
				sb.append("INF").append(" ");

			} else {
				sb.append(String.valueOf(dist[i])).append(" ");
			}

		}
		bw.write(sb.toString());
		bw.close();
		br.close();

	}

	static int getMin() {
		int min = INF;
		int index = 0;

		for (int i = 1; i <= N; i++) {
			if (dist[i] < min && !visited[i]) {
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

		for (int i = 1; i < N; i++) {
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
