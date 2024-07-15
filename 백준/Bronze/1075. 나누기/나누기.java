import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());

		int result = 0;

		N = (N / 100) * 100;

		for (int i = 0; i < 100; i++) {
			if (N % F == 0) {
				result = i;
				break;
			}
			N++;

		}

		if (result < 10) {
			System.out.print(0);
		}
		System.out.println(result);

		br.close();

	}

}
