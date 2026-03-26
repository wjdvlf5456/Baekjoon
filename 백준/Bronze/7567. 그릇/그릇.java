import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] plates = br.readLine().split("(?<!^)");

		int height = 10;

		for (int i = 1; i < plates.length; i++) {
			if (plates[i].equals(plates[i-1])) {
				height += 5;
			} else {
				height += 10;
			}

		}

		String result = Integer.toString(height);
		bw.append(result);
		bw.flush();

		bw.close();
		br.close();

	}

}
