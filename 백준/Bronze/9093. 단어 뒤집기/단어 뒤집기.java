import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int t = Integer.parseInt(st.nextToken());
		int n = 0;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			n = st.countTokens();
			for (int j = 0; j < n; j++) {
				String[] d = st.nextToken().split("(?<!^)");

				for (int k = d.length - 1; k >= 0; k--) {
					bw.append(d[k]);
				}
				bw.append(" ");

			}
			bw.flush();

		}
		bw.close();
		br.close();

	}

}
