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

		Map<String, Integer> pMap = new TreeMap<>();

		String word = br.readLine();
		String[] pa = word.split("(?<!^)");
		for (int i = 0; i < pa.length; i++) {

			if (pMap.get(pa[i]) != null) {
				pMap.put(pa[i], pMap.get(pa[i]) + 1);
			} else {
				pMap.put(pa[i], 1);
			}
		}

		boolean flag = true;	// 홀수면 false, 짝수면 true;

		int count = 0;

		for (int d : pMap.values()) {	// 단어의 개수가 홀수인 단어가 존재하는 지
			if (d % 2 == 1) {
				flag = false;
				count++;
			}
		}
		boolean flag2 = true;

		if (count > 1) {
			flag2 = false;

		} else {
			if (word.length() % 2 == 1) {	// 홀수
				if (flag == false) {
					flag2 = true;
				} else {
					flag2 = false;
				}
			} else {						// 짝수
				if (flag == false) {
					flag2 = false;
				} else {
					flag2 = true;
				}
			}

		}

		StringBuilder sb = new StringBuilder();
		String center = "";
		for (String cn : pMap.keySet()) {
			if (pMap.get(cn) % 2 == 1) {
				center = cn;
				break;
			}
		}

		if (flag2 == false) {
			bw.append("I'm Sorry Hansoo");
		} else {
			for (String w : pMap.keySet()) {
				for (int i = 0; i < pMap.get(w) / 2; i++) {
					bw.append(w);
					sb.append(w);
				}
			}

			sb.reverse();
			if (flag == false) {
				bw.append(center);
			}
			bw.append(sb.toString());

		}

		bw.flush();

		bw.close();
		br.close();

	}

}
