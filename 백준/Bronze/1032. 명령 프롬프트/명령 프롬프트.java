import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		String[] result;
		result = br.readLine().split("(?<!^)");

		String[] daum;

		for (int i = 1; i < n; i++) {
			daum = br.readLine().split("(?<!^)");

			for (int j = 0; j < result.length; j++) {
				if (result[j].equals(daum[j])) {

				} else {
					result[j] = "?";
				}

			}

		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

		br.close();

	}

}
