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

		int[] arr = new int[3];

		arr[0] = Integer.parseInt(st.nextToken());
		arr[1] = Integer.parseInt(st.nextToken());
		arr[2] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);

		int A = arr[0];
		int B = arr[1];
		int C = arr[2];

		String[] abc = br.readLine().split("(?<!^)");

		for (int i = 0; i < 3; i++) {
			if (abc[i].equals("A")) {
				bw.append(Integer.toString(A));

			} else if (abc[i].equals("B")) {
				bw.append(Integer.toString(B));

			} else if (abc[i].equals("C")) {
				bw.append(Integer.toString(C));
			}

			bw.append(" ");
		}

		bw.flush();
		bw.close();
		br.close();

	}

}
