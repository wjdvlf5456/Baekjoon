import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] words;
		Map<String, String> wMap = new HashMap<>();

		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0) {
				break;
			}
			words = new String[N];

			for (int i = 0; i < N; i++) {
				words[i] = br.readLine();
				wMap.put(words[i].toLowerCase(), words[i]);
				words[i] = words[i].toLowerCase();
			}

			Arrays.sort(words);

			bw.append(wMap.get(words[0]));
			bw.newLine();

		}

		bw.flush();

		bw.close();
		br.close();

	}

}
