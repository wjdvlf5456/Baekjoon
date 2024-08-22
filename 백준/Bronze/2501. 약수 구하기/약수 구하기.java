import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int count = 0;

		Boolean flag = false;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
			if (count == k) {
				flag = true;
				count = i;

				break;
			}

		}

		if (flag == true) {
			bw.append(Integer.toString(count));
		}else {
			bw.append("0");
			
		}

		bw.flush();

		bw.close();
		br.close();

	}

}
