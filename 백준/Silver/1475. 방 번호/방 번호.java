import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String room = br.readLine();

		int[] numb = new int[9];
		for (int i = 0; i < numb.length; i++) {
			numb[i] = 0;
		}

		for (int i = 0; i < room.length(); i++) {
			switch (room.charAt(i)) {
			case '0':
				numb[0]++;
				break;
			case '1':
				numb[1]++;
				break;
			case '2':
				numb[2]++;
				break;
			case '3':
				numb[3]++;
				break;
			case '4':
				numb[4]++;
				break;
			case '5':
				numb[5]++;
				break;
			case '6':
				numb[6]++;
				break;
			case '7':
				numb[7]++;
				break;
			case '8':
				numb[8]++;
				break;
			case '9':
				numb[6]++;
				break;

			default:
				break;
			}
		}

		if (numb[6] % 2 == 1) {
			numb[6] = numb[6] / 2 + 1;
		} else {
			numb[6] = numb[6] / 2;
		}

		Arrays.sort(numb);

		bw.append(Integer.toString(numb[8]));

		bw.flush();

		bw.close();
		br.close();

	}

}
