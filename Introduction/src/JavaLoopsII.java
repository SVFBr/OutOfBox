
/**
 *
 * Sample Input
2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

 * */

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {

		int a, b, c, n, i = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		while (i < n) {
			int sum = 0;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();

			for (int j = 0; j < c; j++) {
				if (j < 1)
					sum += a + ((int) Math.pow(2, j) * b);
				else
					sum += ((int) Math.pow(2, j) * b);
				System.out.printf("%s ", sum);
			}
			System.out.println();
			i++;
		}
	}
}