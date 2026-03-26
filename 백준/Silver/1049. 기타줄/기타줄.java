import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int minPack = 0;
		int minEach = 0;

		st = new StringTokenizer(br.readLine());
		minPack = Integer.parseInt(st.nextToken());
		minEach = Integer.parseInt(st.nextToken());

		int mp = 0;
		int me = 0;

		for (int i = 1; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			mp = Integer.parseInt(st.nextToken());
			me = Integer.parseInt(st.nextToken());
			if (minPack >= mp) {
				minPack = mp;
			}

			if (minEach >= me) {
				minEach = me;
			}
		}

		int result = 0;

		if (minEach * 6 <= minPack) {
			result += minEach * n;
		} else {

			result += (n / 6) * minPack;

			if ((n % 6) * minEach >= minPack) {
				result += minPack;
			} else {
				result += (n % 6) * minEach;
			}
		}

		System.out.println(result);

		br.close();

	}

}
