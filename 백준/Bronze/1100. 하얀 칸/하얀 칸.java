import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] chess = new String[8];

		int count = 0;
		int j = 0;

		for (int i = 0; i < 8; i++) {
			chess = br.readLine().split("(?<!^)");

			if (i % 2 == 0) {
				j = 0;
			} else {
				j = 1;
			}

			for (; j < chess.length; j = j + 2) {
				if (chess[j].equals("F")) {
					count++;
				}

			}

		}
		System.out.println(count);

		br.close();

	}

}
