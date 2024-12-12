import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static List<Integer>[] adjList;
	private static boolean visited[];
	private static List<Integer> arrived;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		visited = new boolean[N];
		arrived = new ArrayList<>();
		adjList = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			adjList[i] = new ArrayList<>();

		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			addEdges(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
		}

		for (int i = 0; i < N; i++) {
			adjList[i].sort(Collections.reverseOrder());
		}

		dfs(R - 1);

		int[] resArr = new int[N];
		for (int i = 0; i < resArr.length; i++) {
			resArr[i] = 0;
		}

		int count = 1;

		for (int i : arrived) {
			resArr[i] = count;
			count++;
		}
		for (int i = 0; i < resArr.length; i++) {
			System.out.println(resArr[i]);
		}

		br.close();

	}

	public static void addEdges(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}

	public static void dfs(int v) {
		visited[v] = true;
		arrived.add(v);
		for (int neighbor : adjList[v]) {
			if (!visited[neighbor]) {
				dfs(neighbor);

			}
		}

	}

}
