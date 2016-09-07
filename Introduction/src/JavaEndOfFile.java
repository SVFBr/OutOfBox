import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaEndOfFile {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			int n = 0;
			String input = br.readLine();

			while (input != null) {
				System.out.printf("%d %s\n", ++n, input);
				input = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}