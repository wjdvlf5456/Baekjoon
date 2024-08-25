import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] d = br.readLine().split("(?<!^)");

		List<Integer> nList = new ArrayList<>();

		for (int i = 0; i < d.length; i++) {
			nList.add(Integer.parseInt(d[i]));
		}

		nList.sort(Collections.reverseOrder());

		for (int i : nList) {
			bw.append(Integer.toString(i));
		}
		
		bw.flush();
		
		bw.close();
		br.close();

	}

}
