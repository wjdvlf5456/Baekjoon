import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count;

		for (int i = 0; i < 3; i++) {
			count = 0;
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 4; j++) {
				if (st.nextToken().equals("0")) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("E");
			} else if (count == 1) {
				System.out.println("A");
			} else if (count == 2) {
				System.out.println("B");
			} else if (count == 3) {
				System.out.println("C");
			} else if (count == 4) {
				System.out.println("D");
			}
		}

		br.close();
	}

}
