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

		boolean[] cups = new boolean[4];

		cups[1] = true;

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int n, m;

		boolean bubble = false;

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			bubble = cups[n];
			cups[n] = cups[m];
			cups[m] = bubble;

		}

		for (int i = 0; i < cups.length; i++) {
			if (cups[i] == true) {
				bw.append(Integer.toString(i));
			}
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
