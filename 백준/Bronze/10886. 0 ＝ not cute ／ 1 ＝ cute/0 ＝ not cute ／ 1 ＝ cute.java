import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		int Y = 0;
		int N = 0;

		String cute;

		for (int i = 0; i < t; i++) {
			cute = br.readLine();

			if (cute.equals("1")) {
				Y++;
			} else {
				N++;
			}

		}
		if (Y <= N) {
			bw.append("Junhee is not cute!");
		} else {
			bw.append("Junhee is cute!");
		}
		
		bw.flush();

		bw.close();
		br.close();

	}

}
