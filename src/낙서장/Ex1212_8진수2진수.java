package 낙서장;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1212_8진수2진수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int eight = Integer.parseInt(Integer.toOctalString(n),8);
		
		System.out.println(eight);
		
		
		

		bw.flush();
		bw.close();
		br.close();

	}

}
