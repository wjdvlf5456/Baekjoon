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

		int[] nArr = new int[5];
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			nArr[i] = Integer.parseInt(br.readLine());
			sum += nArr[i];
		}

		Arrays.sort(nArr);

		bw.append(Integer.toString(sum / 5));
		bw.newLine();
		bw.append(Integer.toString(nArr[2]));

		bw.close();
		br.close();

	}

}
