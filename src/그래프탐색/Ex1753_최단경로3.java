package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1753_최단경로3 {

	static int N, M;			// 노드의 수, 간선의 수 
	static int INF = 100000;	// 무한
	static int[][] map;			// 노드사이의 비용
	static boolean[] visited;	// 방문여부
	static int[] dist;			// 최소거리 담을 배열

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

		map = new int[N + 1][N + 1];
		dist = new int[N + 1];
		visited = new boolean[N + 1];

		int a;
		int b;
		int c;

		for (int i = 1; i <= N; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			map[a][b] = c;
			map[b][a] = c;

		}

		dijkstra(start);

		for (int i = 1; i <= N; i++) {
			if (!(i == start)) {
				System.out.print(dist[i] + " ");

			}
		}

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
