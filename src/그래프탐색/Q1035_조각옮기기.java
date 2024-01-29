package 그래프탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1035_조각옮기기 {

	public static void main(String[] args) throws IOException {

		List<String> where = new ArrayList<String>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[][] vector = new String[5][5];
		String[] word = new String[5];

		int height = 0;
		int width = 0;
		int count = 0;

		for (int i = 0; i < 5; i++) {
			word = br.readLine().split("(?<!^)");
			for (int j = 0; j < 5; j++) {
				if (word[j].equals("*")) {
					where.add((i + 1) + "," + (j + 1));
					height += i + 1;
					width += j + 1;
					count++;

				}

				vector[i][j] = word[j];
			}
		}
		
		String centroid = height/count +","+ width/count;
		System.out.println(centroid);
		
		
		System.out.println(where.toString());

		br.close();

	}

}
