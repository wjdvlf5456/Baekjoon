import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Map<String, Integer> nMap = new TreeMap<>();

		String word;

		for (int i = 0; i < N; i++) {
			word = br.readLine();
			nMap.put(word, word.length());
		}

		int i = 1;
		int count = 0;

		while (count < nMap.size()) {
			for (String j : nMap.keySet()) {
				if (nMap.get(j) == i) {
					bw.append(j);
					bw.newLine();
					count++;
				}
			}
			i++;
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
