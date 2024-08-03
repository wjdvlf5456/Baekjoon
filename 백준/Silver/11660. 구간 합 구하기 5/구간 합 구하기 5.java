import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] matrix = new int[N + 1][N + 1];
		int[][] prefixSum = new int[N + 1][N + 1];	// 미리 행렬의 합을 더한 값을 저장하는 행렬

		for (int i = 0; i < matrix.length; i++) {
			if (i > 0) {
				st = new StringTokenizer(br.readLine());

			}
			for (int j = 0; j < matrix.length; j++) {
				if (i == 0 || j == 0) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = Integer.parseInt(st.nextToken());
					prefixSum[i][j] = matrix[i][j] - prefixSum[i - 1][j - 1] + prefixSum[i - 1][j]
							+ prefixSum[i][j - 1];

				}

			}
		}

		int x1;
		int y1;
		int x2;
		int y2;

		int sum;

		for (int i = 0; i < M; i++) {
			sum = 0;

			st = new StringTokenizer(br.readLine());

			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());

			sum = prefixSum[x2][y2] + prefixSum[x1 - 1][y1 - 1] - prefixSum[x2][y1 - 1] - prefixSum[x1 - 1][y2];

			bw.append(Integer.toString(sum));
			bw.newLine();
			bw.flush();
		}

		bw.close();
		br.close();
	}
}
