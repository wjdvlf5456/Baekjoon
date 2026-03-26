import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int time = 0;

		// 남은 새
		int n = Integer.parseInt(br.readLine());

		int k = 0;

		while (true) {

			k++;

			if (n < k) {
				k = 1;
			}

			n = n - k;
			time++;

			if (n <= 0) {
				break;
			}
		}

		bw.append(Integer.toString(time));

		bw.flush();

		bw.close();
		br.close();

	}

}
