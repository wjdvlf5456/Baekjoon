import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] nArr;
		StringBuilder sb = new StringBuilder();
		String tWord = "";
		int fNumb = 0;
		int result = 0;

		for (int i = 0; i < N; i++) {
			nArr = br.readLine().split("(?<!^)");
			for (int j = 0; j < nArr.length; j++) {
				if (j != 3) {
					sb.append(nArr[j]);
				}

				if (j == 2) {
					tWord = sb.toString();
					sb.delete(0, 3);
				} else if (j == 7) {
					fNumb = Integer.parseInt(sb.toString());
					sb.delete(0, 5);

				}
			}
			result = (((int) tWord.charAt(0) - 65) * 26 * 26 + ((int) tWord.charAt(1) - 65) * 26
					+ ((int) tWord.charAt(2) - 65)) - fNumb;

			if (Math.abs(result) <= 100) {
				bw.append("nice");
			} else {
				bw.append("not nice");
			}
			bw.newLine();

		}

		bw.flush();
		bw.close();
		br.close();

	}

}
