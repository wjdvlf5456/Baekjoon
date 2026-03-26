import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static Queue<Integer> q;
	private static List<Integer>[] adjList;
	private static boolean[] visited;
	private static StringBuilder sb;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N, M, V;

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		q = new LinkedList<>();
		adjList = new ArrayList[N];
		visited = new boolean[N];
		sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			adjList[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int u, v;

			st = new StringTokenizer(br.readLine());

			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			addEdge(u - 1, v - 1);

		}
		
		for (int i = 0; i < N; i++) {
			Collections.sort(adjList[i]);
		}

		dfs(V - 1);
		sb.append("\n");

		Arrays.fill(visited, false);
		bfs(V - 1);
		
		System.out.println(sb);
		//System.out.println(Arrays.toString(adjList));

		br.close();
	}

	public static void addEdge(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}

	public static void dfs(int v) {
		visited[v] = true;
		sb.append(Integer.toString(v + 1) + " ");
		for (int neighbor : adjList[v]) {
			if (!visited[neighbor]) {
				dfs(neighbor);
			}
		}
	}

	public static void bfs(int u) {
		q.offer(u);
		visited[u] = true;

		while (!q.isEmpty()) {
			int curr = q.peek();
			q.poll();
			sb.append(Integer.toString(curr + 1) + " ");
			for (int next : adjList[curr]) {
				if (!visited[next]) {
					q.offer(next);
					visited[next] = true;
				}
			}
		}
	};
}
