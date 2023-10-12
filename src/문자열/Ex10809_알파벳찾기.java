package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex10809_알파벳찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		String word = st.nextToken();
		boolean flag = false;

		for (int i = 97; i < 123; i++) {
			
			for (int j = 0; j < word.length(); j++) {
				if ((int) word.charAt(j) == i) {
					sb.append(j + " ");
					flag = true;
					break;

				}

			}

			if (flag == false) {
				sb.append("-1 ");
			}

			flag = false;

			
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
		br.close();

	}

}

// 97 122