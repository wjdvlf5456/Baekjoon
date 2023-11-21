package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1753_최단경로 {

	static int N, M;
	static int INF = 1001;
	static int[][] map;
	static int[] distance;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		str = br.readLine();
		st = new StringTokenizer(str);
		int startNum = Integer.parseInt(st.nextToken());

		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = INF;
			}

		}

		int u;
		int v;
		int w;

		distance = new int[N];
		visited = new boolean[N];

		for (int i = 0; i < M; i++) {
			str = br.readLine();
			st = new StringTokenizer(str);
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());

			map[u - 1][v - 1] = w;

		}

		dijkstra(startNum - 1);
		for (int i = 0; i < N; i++) {
			if (i + 1 == startNum) {
				System.out.println(0);

			} else if (distance[i] > 1000) {
				System.out.println("INF");

			} else {
				System.out.println(distance[i]);
			}

		}

		br.close();

	}

	static int getMin() {
		int min = INF;
		int index = 0;

		for (int i = 0; i < N; i++) {
			if (distance[i] < min && !visited[i]) {
				min = distance[i];
				index = i;
			}
		}

		return index;
	}

	static void dijkstra(int start) {
		for (int i = 0; i < N; i++) {
			distance[i] = map[start][i];
		}

		visited[start] = true;

		for (int i = 0; i < N; i++) {
			int crt = getMin();		// 노드의 현재 위치
			visited[crt] = true;

			for (int j = 0; j < N; j++) {
				if (visited[j] == false) {
					if (distance[crt] + map[crt][j] < distance[j]) {
						distance[j] = distance[crt] + map[crt][j];
					}
				}

			}

		}

	}

}
