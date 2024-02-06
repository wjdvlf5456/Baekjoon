package 스택;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q28278_스택2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		Stack<String> stack = new Stack<String>();

		int N = Integer.parseInt(br.readLine());
		
		String M;
		String Num;

		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			M = st.nextToken();

			if (M.equals("1")) {
				Num = st.nextToken();
				stack.push(Num);
				continue;

			} else if (M.equals("2")) {
				if (stack.size() == 0) {
					bw.write("-1");
				} else {
					bw.write(stack.lastElement());
					stack.pop();
				}

			} else if (M.equals("3")) {
				bw.write(Integer.toString(stack.size()));

			} else if (M.equals("4")) {
				if (stack.size() == 0) {
					bw.write("1");
				} else {
					bw.write("0");
				}

			} else if (M.equals("5")) {
				if (stack.size() == 0) {
					bw.write("-1");
				} else {
					bw.write(stack.lastElement());
				}

			}
			bw.newLine();

		}
		bw.flush();
		bw.close();
		br.close();

	}

}
