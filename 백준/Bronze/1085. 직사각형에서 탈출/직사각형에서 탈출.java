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

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int resX = 0;
		int resY = 0;

		int result = 0;

		if (w - x < x) {
			resX = w - x;
		} else if (w - x >= x) {
			resX = x;
		}

		if (h - y < y) {
			resY = h - y;
		} else if (h - y >= y) {
			resY = y;
		}

		if (resX < resY) {
			result = resX;
		} else {
			result = resY;
		}

		bw.append(Integer.toString(result));

		bw.flush();

		bw.close();
		br.close();

	}
}
