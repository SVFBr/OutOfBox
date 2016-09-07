import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Recebe um string quebra em subString para avalia��o da menor e maior quebra
 * lexogr�fica
 */

public class JavaStringCompare {

	public static void main(String[] args) {

		System.out.print("Digite uma palavra:");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.print("Tamanho da subString: ");
		int k = s.nextInt();
		System.out.println(" ");

		SortedSet quebra = new TreeSet();
		for (int i = 0; i <= input.length() - k; i++) {
			quebra.add(input.substring(i, i + k));
			System.out.println(quebra);
			
		}

		System.out.println(" ");
		System.out.println("Menor quebra lexogr�fica: " + quebra.first());
		System.out.println("Maior quebra lexogr�fica: " + quebra.last());

	}
}
