import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				if (x >= -((long) Math.pow(2, 15)) && x <= (((long) Math.pow(2, 15)) - 1))
					System.out.println("* short");
				if (x >= -((long) Math.pow(2, 31)) && x <= (((long) Math.pow(2, 31)) - 1))
					System.out.println("* int");
				if (x >= (Long.MIN_VALUE) && x <= (Long.MAX_VALUE))
					System.out.println("* long");
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}
}
