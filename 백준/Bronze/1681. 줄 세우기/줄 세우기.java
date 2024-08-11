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

		int N = Integer.parseInt(st.nextToken());

		String L = st.nextToken();

		int i = 1;
		String ii = "";
		int count = 0;
		Boolean flag = false;

		while (count < N) {
			ii = Integer.toString(i);
			flag = false;

			for (int j = 0; j < ii.length(); j++) {
				if (ii.charAt(j) == L.charAt(0)) {
					flag = true;
					break;
				}
			} // for

			if (flag == false) {
				count++;
			}
			
			i++;

		}

		bw.append(ii);

		bw.flush();

		bw.close();
		br.close();

	}

}
