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

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

		}

		int start = arr[0];
		int count = 0;
		int max = 0;
		Boolean flag = false;

		for (int i = 1; i < arr.length; i++) {
			if (start > arr[i]) {
				count++;
				if (max < count) {
					max = count;
				}
			} else {
				count = 0;
				start = arr[i];
				flag = true;

			}

		}
		if (flag == false) {
			bw.append(Integer.toString(n - 1));

		} else {
			bw.append(Integer.toString(max));

		}

		bw.flush();

		bw.close();
		br.close();
	}

}
