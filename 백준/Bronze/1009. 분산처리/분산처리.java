import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 0;

		int result = 0;

		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			result = a;

			for (int j = 0; j < b - 1; j++) {
				result = (result * a % 10);

			}

			if (result > 9) {
				result = result % 10;
			}
			if (result == 0) {
				result = 10;
			}

			System.out.println(result);
			result = 0;

		}

		br.close();

	}

}
