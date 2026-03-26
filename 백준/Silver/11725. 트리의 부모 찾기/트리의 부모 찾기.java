import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static List<Integer>[] adjList;
	private static List<Integer>[] parents;
	private static boolean[] visited;
	private static int curr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st;

		adjList = new ArrayList[N + 1];
		visited = new boolean[N + 1];

		parents = new ArrayList[N + 1];
		curr = 0;

		for (int i = 0; i <= N; i++) {
			adjList[i] = new ArrayList<>();
		}
		for (int i = 0; i <= N; i++) {
			parents[i] = new ArrayList<>();
		}

		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			addEdge(a, b);
		}

		dfs(1);

		int[] answer = new int[N + 1];

		for (int i = 1; i < parents.length; i++) {
			if (parents[i].size() > 1) {
				for (int j = 0; j < parents[i].size() - 1; j++) {
					answer[parents[i].get(j)] = parents[i].get(j + 1);
				}
			}
		}

		for (int i = 2; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		br.close();
	}

	public static void addEdge(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);

	}

	public static void dfs(int v) {
		visited[v] = true;
		// System.out.println(v);

		for (int neighbor : adjList[v]) {
			curr = v;
			if (visited[neighbor] == false) {
				dfs(neighbor);
			}
			parents[curr].add(v);

		}

	}

}
