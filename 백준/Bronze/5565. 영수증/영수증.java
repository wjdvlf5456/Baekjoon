import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int all = Integer.parseInt(br.readLine());

		for (int i = 0; i < 9; i++) {
			all = all - Integer.parseInt(br.readLine());

		}

		bw.append(Integer.toString(all));

		bw.flush();
		bw.close();
		br.close();


	}

}
