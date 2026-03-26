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

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		int i = 1;
		int count = 0;
		while (true) {
			count = 0;

			if (i % a == 0) {
				count++;
			}
			if (i % b == 0) {
				count++;
			}
			if (i % c == 0) {
				count++;
			}
			if (i % d == 0) {
				count++;
			}
			if (i % e == 0) {
				count++;
			}
			if (count >= 3) {
				bw.append(Integer.toString(i));

				break;
			}

			i++;

		}

		bw.flush();

		bw.close();
		br.close();

	}

}
