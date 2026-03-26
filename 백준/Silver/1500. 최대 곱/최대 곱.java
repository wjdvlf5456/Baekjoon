import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		Long S = Long.valueOf(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		long avg = S / K;

		Long[] nArr = new Long[K];

		for (int i = 0; i < nArr.length; i++) {
			S -= avg;
			nArr[i] = avg;
		}

		Long result = (long) 1;

		if (S > 0) {
			for (int i = 0; i < nArr.length; i++) {
				if (S == 0) {
					break;
				}

				nArr[i]++;
				S--;
			}
		}

		for (int i = 0; i < nArr.length; i++) {
			result = result * nArr[i];
		}

		bw.append(Long.toString(result));

		bw.flush();

		bw.close();
		br.close();

	}

}
