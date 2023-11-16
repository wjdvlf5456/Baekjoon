package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex01_Q1260_DFS와BFS {

	static int N;
	static boolean[] used;
	static boolean[][] bool;
	static int[] nodes;
	static List<List<Integer>> nodeList;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 첫줄
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		N = Integer.parseInt(st.nextToken());
		int line = Integer.parseInt(st.nextToken());
		int startNode = Integer.parseInt(st.nextToken());

		int leftNode = 0;
		int rightNode = 0;

		nodes = new int[N + 1];
		used = new boolean[N + 1];
		bool = new boolean[N + 1][N + 1];

		for (int i = 0; i < N; i++) {
			nodes[i] = i + 1;

		}

		// 선이 어느 노드에 연결되어있는지 입력
		for (int i = 0; i < line; i++) {
			str = br.readLine();
			if (str.equals("") || str == null || str == "") {
				break;
			}
			st = new StringTokenizer(str);

			leftNode = Integer.parseInt(st.nextToken());
			rightNode = Integer.parseInt(st.nextToken());

			bool[leftNode - 1][rightNode - 1] = true;
			bool[rightNode - 1][leftNode - 1] = true;

		}

		// dfs
		dfs(startNode);
		System.out.println("");

		// bfs
		nodeList = new ArrayList<List<Integer>>();
		List<Integer> bfsNode = new ArrayList<>();
		bfsNode.add(startNode);
		nodeList.add(bfsNode);

		used = new boolean[N];

		System.out.print(startNode + " ");
		for (int i = 0; i < bool.length; i++) {
			bfsNode = new ArrayList<>();
			for (int j = 0; j < bool.length; j++) {
				if (bool[i][j] == true) {
					bfsNode.add(j + 1);
				}

			}
			nodeList.add(bfsNode);
		}

		int curNumb = 0;
		int nextNode;
		List<Integer> curList = new ArrayList<>();
		curList.add(startNode);

		int dddddd = 0;

		for (int i = 0; i < nodeList.size(); i++) {

			for (int e = 0; e < curList.size(); e++) {
				startNode = curList.get(e);
				for (int j = 0; j < nodeList.get(curList.get(e)).size(); j++) {
					dddddd = nodeList.get(curList.get(e)).get(j);

					if (used[dddddd - 1] == false) {
						System.out.print(dddddd + " ");

					}
				}

				for (int j = 0; j < nodeList.get(startNode - 1).size(); j++) {
					curNumb = nodeList.get(startNode - 1).get(j);
					if (used[curNumb - 1] != true) {
						used[curNumb - 1] = true;
						for (int k = 0; k < nodeList.get(curNumb).size(); k++) {
							nextNode = nodeList.get(curNumb).get(k);
							if (used[nextNode - 1] != true) {
								curList.add(nextNode);
								used[nextNode - 1] = true;

							}

						}

					}
				}
				//

			}

		}

		br.close();
	}

	static void dfs(int n) {
		used[n - 1] = true;
		System.out.print(n + " ");

		for (int i = 0; i < bool.length; i++) {
			if (used[i] != true && bool[n - 1][i] == true) {
				n = i + 1;
				dfs(n);
			}

		}

	}
}