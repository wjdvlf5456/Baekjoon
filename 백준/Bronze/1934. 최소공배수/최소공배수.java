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

		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		int a;
		int b;

		int max = 0;
		int min = 0;

		int j;
		int result = 0;

		for (int i = 0; i < T; i++) {
			max = 1;
			min = 1;
			st = new StringTokenizer(br.readLine());

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			result = 0;

			if (a > b) {
				max = a;
				min = b;
			} else if (a < b) {
				max = b;
				min = a;
			} else {
				result = a;
				bw.append(Integer.toString(result));
				bw.newLine();
				continue;
			}
			j = 1;

			while (true) {
				if (max * j % min == 0) {
					result = max * j;
					break;
				}

				j++;
			}

			bw.append(Integer.toString(result));
			bw.newLine();
		}
		bw.flush();

		bw.close();
		br.close();
	}

}
