import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] abc = new int[3];

		for (int i = 0; i < abc.length; i++) {
			abc[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(abc);

		bw.append(Integer.toString(abc[1]));

		bw.flush();
		bw.close();
		br.close();

	}

}
