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
		int L = Integer.parseInt(st.nextToken());

		int[] friends = new int[N];
		Arrays.fill(friends, 0);
		friends[0] = 1;

		int i = 0;
		int count = 0;

		while (true) {
			if (friends[i] == M) {
				break;
			}

			if (friends[i] % 2 == 1) {
				i = (i + L) % N;
			} else {
				i = (i - L + N) % N;
			}

			friends[i]++;
			count++;

		}
		bw.append(Integer.toString(count));

		bw.flush();

		bw.close();
		br.close();

	}
}
