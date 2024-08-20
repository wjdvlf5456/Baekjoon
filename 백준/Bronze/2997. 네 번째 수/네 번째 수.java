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

		int[] nArr = new int[3];

		StringTokenizer st = new StringTokenizer(br.readLine());

		nArr[0] = Integer.parseInt(st.nextToken());
		nArr[1] = Integer.parseInt(st.nextToken());
		nArr[2] = Integer.parseInt(st.nextToken());

		Arrays.sort(nArr);
		int result = 0;
		int diff = 0;

		if (nArr[2] - nArr[1] == nArr[1] - nArr[0]) {
			diff = nArr[2] - nArr[1];
			result = nArr[2] + diff;
		} else if (nArr[2] - nArr[1] > nArr[1] - nArr[0]) {
			diff = nArr[1] - nArr[0];
			result = nArr[2] - diff;
		}else {
			diff = nArr[2] - nArr[1];
			result = nArr[1] - diff;
		}

		bw.append(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();

	}

}
