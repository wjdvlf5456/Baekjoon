package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q28278_스택2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Integer> stack = new Stack<Integer>();

		int N = Integer.parseInt(br.readLine());
		int M;
		int Num;

		StringTokenizer st;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());

			if (M == 1) {
				Num = Integer.parseInt(st.nextToken());
				stack.push(Num);

			} else if (M == 2) {
				if (stack.size()==0) {
					System.out.println(-1);
				} else {
					System.out.println(stack.lastElement());
					stack.pop();
				}

			} else if (M == 3) {
				System.out.println(stack.size());

			} else if (M == 4) {
				if (stack.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

			} else if (M == 5) {
				if (stack.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(stack.lastElement());
				}

			} else {
				continue;
			}

		}

		br.close();

	}

}
