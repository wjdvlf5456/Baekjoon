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
		int m = Integer.parseInt(st.nextToken());

		int gcd = 0;	// 최대공약수
		int lcm = 0;	// 최소공배수

		for (int i = 1; i <= n && i <= m; i++) {
			if (n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}
		
		lcm = n*m/gcd;
		
		bw.append(Integer.toString(gcd));
		bw.newLine();
		bw.append(Integer.toString(lcm));
		

		bw.close();
		br.close();

	}

}
