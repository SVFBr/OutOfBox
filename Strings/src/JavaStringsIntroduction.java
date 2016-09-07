import java.util.Scanner;

/**
 * Recebe duas strings e transforma a primeira letra de cada uma delas em UpperCase
 * Informa se primeira palavra é lexograficamente maior que a segunda, com True ou False.
 */

public class JavaStringsIntroduction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira palavra:");
		String A = sc.next();
		System.out.print("Digite a segunda palavra:");
		String B = sc.next();


		// Se A é maior que B lexicograficamente
		if (A.compareTo(B) > 0) {
			System.out.println("1ª palavra é lexograficamente maior");
		} else {
			System.out.println("2ª palavra é lexograficamente maior");
		}

		// Primeira letra das Strings em UpperCase
		System.out.println("Transforma primeira letra em UpperCase: " + Character.toString(A.charAt(0)).toUpperCase() + A.substring(1) + " "
				+ Character.toString(B.charAt(0)).toUpperCase() + B.substring(1));
	}

}
