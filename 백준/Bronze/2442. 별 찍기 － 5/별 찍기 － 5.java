import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				bw.append(" ");
			}
			for (int j = 1; j < 2 * i; j++) {
				bw.append("*");
			}
			bw.newLine();
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
