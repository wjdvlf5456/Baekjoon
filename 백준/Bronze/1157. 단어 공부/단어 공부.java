import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> sMap = new HashMap<>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] sArr = br.readLine().split("(?<!^)");
		int yy = 0;

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = sArr[i].toUpperCase();
			if (sMap.containsKey(sArr[i])) {
				yy = sMap.get(sArr[i]);
				sMap.put(sArr[i], yy + 1);
			} else {
				sMap.put(sArr[i], 1);
			}

		}

		int max = 0;
		Boolean flag = false;
		String result = "";

		for (String string : sMap.keySet()) {
			if (max < sMap.get(string)) {
				max = sMap.get(string);
				flag = false;
				result = string;

			} else if (max == sMap.get(string)) {
				flag = true;

			}

		}

		if (flag == true) {
			System.out.println("?");
		} else {
			System.out.println(result);
		}

		br.close();

	}

}
