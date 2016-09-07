
import java.util.Scanner;

/**
 *		Testes de formatação de Output com Printf 
 * */


public class JavaOutputFormatting {

	public static void main(String[] args) {

		String s1 = "";
		int x = 0;
		String s2 = "";
		int x2 = 0;
		String s3 = "";
		int x3 = 0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			s1 = sc.next();
			x = sc.nextInt();

			s2 = sc.next();
			x2 = sc.nextInt();

			s3 = sc.next();
			x3 = sc.nextInt();
		}
		System.out.println("================================");
		System.out.printf("%-14s %03d %n", s1, x);
		System.out.printf("%-14s %03d %n", s2, x2);
		System.out.printf("%-14s %03d %n", s3, x3);
		System.out.println("================================");

	}

}


