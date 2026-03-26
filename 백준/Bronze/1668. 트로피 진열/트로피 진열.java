import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] nArr = new int[N];

		int left = 1;
		Boolean flag = false;

		for (int i = 0; i < N; i++) {
			nArr[i] = Integer.parseInt(br.readLine());
		}

		int max = nArr[0];

		for (int i = 1; i < N; i++) {
			if (nArr[i] > max) {
				left++;
				max = nArr[i];
			}

		}

		max = nArr[N - 1];
		int right = 1;

		for (int i = N - 2; i >= 0; i--) {
			if (nArr[i] > max) {
				right++;
				max = nArr[i];
			}

		}

		bw.append(Integer.toString(left));
		bw.newLine();
		bw.append(Integer.toString(right));

		bw.flush();

		bw.close();
		br.close();

	}
}
