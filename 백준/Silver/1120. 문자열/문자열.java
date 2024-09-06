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

		String A = st.nextToken();
		String B = st.nextToken();

		String[] aArr = A.split("(?<!^)");
		String[] bArr = B.split("(?<!^)");

		int dist = B.length() - A.length();

		int count = 0;
		int k = 0;
		int min = 999999999;
		for (int i = 0; i <= dist; i++) {
			count = 0;
			k = i;
			for (int j = 0; j < aArr.length; j++) {
				if (aArr[j].equals(bArr[k]) == false) {
					count++;
				}

				k++;
			}

			if (min > count) {
				min = count;
			}

		}
		bw.append(Integer.toString(min));

		bw.flush();

		bw.close();
		br.close();

	}

}
