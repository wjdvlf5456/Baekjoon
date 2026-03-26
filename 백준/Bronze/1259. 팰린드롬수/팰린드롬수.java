import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String n = "";

		StringBuilder sb = new StringBuilder();

		while (true) {
			n = br.readLine();

			if (n.charAt(0) == '0') {
				break;
			} else {
				sb.append(n);
				sb.reverse();

				if (sb.toString().equals(n)) {
					bw.append("yes");
				} else {
					bw.append("no");
				}
				sb.delete(0, sb.length());

				bw.flush();
				bw.newLine();

			}

		}

		bw.close();
		br.close();

	}

}
