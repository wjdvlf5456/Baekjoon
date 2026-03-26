import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static boolean visited[];
	private static List<Integer>[] adjList;
	private static int[] arrived;
	private static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		adjList = new ArrayList[N];
		visited = new boolean[N];
		arrived = new int[N];
		for (int i = 0; i < N; i++) {
			adjList[i] = new ArrayList<>();
		}

		int u, v;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			u = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());
			addEdges(u - 1, v - 1);
		}

		for (int i = 0; i < adjList.length; i++) {
			Collections.sort(adjList[i]);
		}
		count = 1;

		dfs(R - 1);
		for (int i = 0; i < arrived.length; i++) {
			System.out.println(arrived[i]);
		}

		br.close();
	}

	public static void addEdges(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}

	public static void dfs(int v) {
		visited[v] = true;
		arrived[v] = count;
		count++;
		for (int neighbor : adjList[v]) {
			if (visited[neighbor] == false) {
				dfs(neighbor);
			}
		}

	}

}
