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

		int[] box = new int[N];
		int[] book = new int[M];

		int result = 0;

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			box[i] = Integer.parseInt(st.nextToken());

			result += box[i];

		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			book[i] = Integer.parseInt(st.nextToken());
			result -= book[i];
		}

		bw.append(Integer.toString(result));

		bw.flush();

		bw.close();
		br.close();

	}

}
