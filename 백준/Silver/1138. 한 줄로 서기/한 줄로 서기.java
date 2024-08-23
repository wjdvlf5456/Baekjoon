import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<Integer> nList = new ArrayList<>();
		Map<Integer, Integer> nMap = new HashMap<>();

		int N = Integer.parseInt(br.readLine());

		// 키 순서
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= N; i++) {
			nMap.put(i, Integer.parseInt(st.nextToken()));
		}

		for (int i = 1; i <= N; i++) {
			if (nMap.get(i) == 0) {
				nList.add(i);
				nMap.remove(i);

				break;
			}
		}

		int count = 0;

		for (int k = 1; k <= N; k++) {

			for (int i = 1; i <= N; i++) {
				if (nMap.get(i) == null) {
					continue;
				}

				count = 0;

				for (int j = 0; j < nList.size(); j++) {
					if (nList.get(j) > i) {
						count++;
					}

				}
				if (nMap.get(i) == count) {
					nList.add(i);
					nMap.remove(i);
					break;
				}

			}
		}

		for (int i : nList) {
			bw.append(Integer.toString(i) + " ");
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
