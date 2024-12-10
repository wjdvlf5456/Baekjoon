import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static List<Integer>[] adjList;
	private static boolean visited[];
	private static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cpu = Integer.parseInt(br.readLine());
		int edges = Integer.parseInt(br.readLine());

		visited = new boolean[cpu];
		adjList = new ArrayList[cpu];
		count = 0;

		for (int i = 0; i < cpu; i++) {
			adjList[i] = new ArrayList<>();
		}

		StringTokenizer st;

		for (int i = 0; i < edges; i++) {
			st = new StringTokenizer(br.readLine());
			addEdges(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);

		}
		dfs(0);
		if (count<=0) {
			System.out.println(0);
		}else {
			System.out.println(count-1);
		}

		br.close();
	}

	public static void addEdges(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}

	public static void dfs(int v) {
		visited[v] = true;
		count++;
		//System.out.println(v);
		for (int neighbor : adjList[v]) {
			if (!visited[neighbor]) {
				dfs(neighbor);
			}
		}

	}

}
