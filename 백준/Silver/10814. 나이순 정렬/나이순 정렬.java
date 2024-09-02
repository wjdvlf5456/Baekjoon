import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;

		ArrayList<String> nList;
		Map<Integer, ArrayList<String>> nMap = new TreeMap<>();

		int a;
		String b;

		for (int i = 0; i < n; i++) {
			nList = new ArrayList<>();

			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = st.nextToken();

			if (nMap.get(a) != null) {
				nList = nMap.get(a);
			}

			nList.add(b);
			nMap.put(a, nList);
		}

		for (int i : nMap.keySet()) {
			for (int j = 0; j < nMap.get(i).size(); j++) {
				bw.append(Integer.toString(i) + " " + nMap.get(i).get(j));
				bw.newLine();
			}
		}

		bw.flush();

		bw.close();
		br.close();

	}
}
