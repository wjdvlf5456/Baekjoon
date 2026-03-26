import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String cups = br.readLine();

		String[] change = cups.split("(?<!^)");

		boolean[] flag = new boolean[3];

		flag[0] = true;
		flag[1] = false;
		flag[2] = false;

		boolean bubble;

		for (int i = 0; i < change.length; i++) {

			if (change[i].equals("A")) {
				bubble = flag[1];
				flag[1] = flag[0];
				flag[0] = bubble;

			} else if (change[i].equals("B")) {
				bubble = flag[2];
				flag[2] = flag[1];
				flag[1] = bubble;

			} else if (change[i].equals("C")) {
				bubble = flag[0];
				flag[0] = flag[2];
				flag[2] = bubble;
			}
		}

		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == true) {
				bw.append(Integer.toString(i + 1));
				break;
			}
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
