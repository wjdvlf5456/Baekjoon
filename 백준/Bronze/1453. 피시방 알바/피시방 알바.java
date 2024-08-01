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

		int t = Integer.parseInt(br.readLine());

		Boolean[] flag = new Boolean[100];

		for (int i = 0; i < flag.length; i++) {
			flag[i] = false;
		}

		StringTokenizer st = new StringTokenizer(br.readLine());
		int number = 0;
		int count = 0;

		for (int i = 0; i < t; i++) {
			number = Integer.parseInt(st.nextToken());
			if (flag[number - 1] == false) {
				flag[number - 1] = true;

			} else if (flag[number - 1] == true) {
				count++;

			}

		}

		if (t == 1) {
			bw.append("0");
		} else {
			bw.append(Integer.toString(count));

		}

		bw.flush();

		bw.close();
		br.close();

	}

}
