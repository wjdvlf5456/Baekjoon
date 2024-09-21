import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<Integer, Integer> nMap = new HashMap<>();

		int N;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			N = Integer.parseInt(br.readLine());
			if (nMap.containsKey(N)) {
				nMap.put(N, nMap.get(N) + 1);

			} else {
				nMap.put(N, 1);
			}

			sum += N;
		}

		bw.append(Integer.toString(sum / 10));
		bw.newLine();

		int maxVal = 0;
		int key = 0;

		for (int i : nMap.keySet()) {
			if (nMap.get(i) > maxVal) {
				maxVal = nMap.get(i);
				key = i;
			}
		}

		bw.append(Integer.toString(key));

		bw.close();
		br.close();

	}

}
