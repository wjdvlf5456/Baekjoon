import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		StringTokenizer st = new StringTokenizer(br.readLine());

		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());

		int count = 0;

		for (int i = 0; i < month; i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				count += 31;

			} else if (i == 4 || i == 6 || i == 9 || i == 11) {
				count += 30;

			} else if (i == 2) {
				count += 28;

			}
		}

		int answer = (count + day) % 7;

		System.out.println(week[answer]);

		br.close();

	}

}
