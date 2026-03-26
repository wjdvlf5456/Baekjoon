import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		BigInteger a = new BigInteger(br.readLine());
		String sign = br.readLine();
		BigInteger b = new BigInteger(br.readLine());

		if (sign.equals("+")) {
			bw.append(a.add(b).toString());
		} else if (sign.equals("*")) {
			bw.append((a.multiply(b)).toString());
		}

		bw.flush();

		bw.close();
		br.close();
	}
}
