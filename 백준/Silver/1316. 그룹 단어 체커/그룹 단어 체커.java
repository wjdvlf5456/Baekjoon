import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		String word;
		Boolean[] flag = new Boolean[26];

		Arrays.fill(flag, false);

		// 97~122
		int wh;
		char now;

		int count = 0;
		Boolean check = false;

		for (int i = 0; i < N; i++) {
			word = br.readLine();
			check = false;
			Arrays.fill(flag, false);

			for (int j = 0; j < word.length(); j++) {
				now = word.charAt(j);
				wh = (int) now - 97;
				if (j > 0 && now != word.charAt(j - 1) && flag[wh] == true) {
					check = false;
					break;
				} else {
					check = true;

				}
				flag[wh] = true;

			}

			if (check == true) {
				count++;
			}

		}

		bw.append(Integer.toString(count));

		bw.flush();

		bw.close();
		br.close();

	}

}
