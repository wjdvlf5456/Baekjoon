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

		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int cluster = Integer.parseInt(br.readLine());

		long count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				continue;
			}
			if (arr[i] % cluster == 0) {
				count += arr[i] / cluster;

			} else {
				count += 1 + arr[i] / cluster;

			}

		}
		
		long result = count * cluster;

		bw.append(Long.toString(result));
		bw.flush();

		bw.close();
		br.close();
	}
}
