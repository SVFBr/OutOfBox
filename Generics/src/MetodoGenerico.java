
/**
 * 
 * Método genérico: um método para vários tipos.
 * 
 */

public class MetodoGenerico {

	public static <T> void printArray(T[] inputArray) {

		for (T element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] integerArray = { 1, 2, 3, 4, 5 };
		String[] stringArray = { "Método", "Genérico" };
		Character[] charArray = { 'O', 'l', 'á' };

		System.out.println("Array de inteiros: ");
		printArray(integerArray);

		System.out.println("\nArray de strings: ");
		printArray(stringArray);

		System.out.println("\nArray de caracteres: ");
		printArray(charArray);

	}

}
