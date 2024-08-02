import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (c - b >= b - a && c - b > 1) {
			System.out.println(c - b - 1);
		} else if (c - b < b - a && b - a > 1) {
			System.out.println(b - a - 1);

		} else {
			System.out.println(0);
		}

		br.close();
	}

}
