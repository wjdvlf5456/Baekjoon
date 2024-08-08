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

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int m;

		m = Integer.parseInt(st.nextToken());

		int min = m;
		int max = m;

		for (int i = 1; i < N; i++) {
			m = Integer.parseInt(st.nextToken());

			if (m > max) {
				max = m;
			}
			if (m < min) {
				min = m;
			}
		}
		int result = max * min;

		bw.append(Integer.toString(result));

		bw.flush();

		bw.close();
		br.close();

	}

}
