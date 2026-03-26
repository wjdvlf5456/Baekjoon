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

		int N = Integer.parseInt(br.readLine());

		boolean[] flag = new boolean[26];

		Arrays.fill(flag, false);

		String[] word;
		int sum;

		for (int i = 0; i < N; i++) {
			word = br.readLine().split("(?<!^)");
			sum = 0;
			Arrays.fill(flag, false);
			for (int j = 0; j < word.length; j++) {
				flag[(int) word[j].charAt(0) - 65] = true;
			}
			for (int j = 0; j < flag.length; j++) {
				if (flag[j] == false) {
					sum += (j + 65);
				}
			}
			bw.append(Integer.toString(sum));
			bw.newLine();
		}
		bw.flush();

		bw.close();
		br.close();

	}

}
