import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
		int result = 0;

		if (xMax - xMin == 0 || yMax - yMin == 0 || t == 1) {
			bw.append("0");
			bw.flush();
		} else {
			result = (xMax - xMin) * (yMax - yMin);
			bw.append(Integer.toString(result));
			bw.flush();

		}

		bw.close();
		br.close();

	}

}
