import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = 0;
		int min = 100;
		int sum = 0;

		for (int i = 0; i < 7; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());

			if (n % 2 == 1) {
				sum += n;
				if (min > n) {
					min = n;
				}
			}

		}
		
		if (sum<=0) {
			System.out.println(-1);
		} else {

			System.out.println(sum);
			System.out.println(min);
		}


		br.close();
	}

}
