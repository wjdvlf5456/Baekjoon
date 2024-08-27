import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int K = Integer.parseInt(br.readLine());

		String word = br.readLine();
		String[] wArr = word.split("(?<!^)");

		int row = word.length() / K;
		if (word.length() % K > 0) {
			row++;
		}

		String[][] proc = new String[row][K];

		int numb = 0;
		for (int i = 0; i < row; i++) {

			if (i % 2 == 1) {	// 짝수행인 경우
				for (int j = K - 1; j >= 0; j--) {
					proc[i][j] = wArr[numb];
					numb++;
				}

			} else {			// 홀수행인 경우
				for (int j = 0; j < K; j++) {
					proc[i][j] = wArr[numb];
					numb++;
				}
			}
		}

		for (int i = 0; i < K; i++) {
			for (int j = 0; j < row; j++) {
				bw.append(proc[j][i]);
			}
		}
		
		bw.flush();

		bw.close();
		br.close();

	}
}
