import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger N = new BigInteger(st.nextToken(), 2);
		BigInteger M = new BigInteger(st.nextToken(), 2);

		BigInteger result = N.add(M);
		String res = result.toString(2);
		bw.append(res);

		bw.flush();

		bw.close();
		br.close();

	}

}
