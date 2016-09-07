
/**
 * 
 * M�todo gen�rico: um m�todo para v�rios tipos.
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
		String[] stringArray = { "M�todo", "Gen�rico" };
		Character[] charArray = { 'O', 'l', '�' };

		System.out.println("Array de inteiros: ");
		printArray(integerArray);

		System.out.println("\nArray de strings: ");
		printArray(stringArray);

		System.out.println("\nArray de caracteres: ");
		printArray(charArray);

	}

}
