import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				bw.append("*");
			}
			for (int j = 0; j < N-i; j++) {
				bw.append(" ");
			}
			for (int j = 0; j < N-i; j++) {
				bw.append(" ");
			}
			for (int j = 0; j < i; j++) {
				bw.append("*");
			}
			bw.newLine();
		}
		
		for (int i = N-1; i >0; i--) {
			for (int j = 0; j < i; j++) {
				bw.append("*");
			}
			for (int j = 0; j < N-i; j++) {
				bw.append(" ");
			}
			for (int j = 0; j < N-i; j++) {
				bw.append(" ");
			}
			for (int j = 0; j < i; j++) {
				bw.append("*");
			}
			bw.newLine();
		}
		
		

		bw.close();
		br.close();

	}
}
