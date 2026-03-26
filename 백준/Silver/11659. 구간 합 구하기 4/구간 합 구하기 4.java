import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] sumArr = new int[N + 1];
		sumArr[0] = 0;

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i < sumArr.length; i++) {
			sumArr[i] = sumArr[i - 1] + Integer.parseInt(st.nextToken());

		}

		int ii = 0;
		int jj = 0;

		int result;

		for (int i = 0; i < M; i++) {
			result = 0;
			st = new StringTokenizer(br.readLine());
			ii = Integer.parseInt(st.nextToken());
			jj = Integer.parseInt(st.nextToken());

			result = sumArr[jj] - sumArr[ii - 1];

			bw.append(Integer.toString(result));
			bw.newLine();
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
