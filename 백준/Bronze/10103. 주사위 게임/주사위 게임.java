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

		int t = Integer.parseInt(br.readLine());

		int a = 100;
		int b = 100;

		int aa;
		int bb;
		StringTokenizer st;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			aa = Integer.parseInt(st.nextToken());
			bb = Integer.parseInt(st.nextToken());

			if (aa == bb) {
				continue;
			} else if (aa > bb) {
				b -= aa;
			} else if (aa < bb) {
				a -= bb;
			}

		}

		bw.append(Integer.toString(a));
		bw.newLine();
		bw.append(Integer.toString(b));

		bw.close();
		br.close();

	}

}
