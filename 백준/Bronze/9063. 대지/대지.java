import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int xMax = -10000;
		int yMax = -10000;

		int xMin = 10000;
		int yMin = 10000;

		int t = Integer.parseInt(st.nextToken());

		int x = 0;
		int y = 0;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			if (x > xMax) {
				xMax = x;
			}
			if (x <= xMin) {
				xMin = x;

			}

			if (y > yMax) {
				yMax = y;
			}
			if (y <= yMin) {
				yMin = y;
			}

		}

		if (xMax - xMin == 0 || yMax - yMin == 0 || t == 1) {
			System.out.println(0);
		} else {
			System.out.println((xMax - xMin) * (yMax - yMin));

		}

		br.close();

	}

}
