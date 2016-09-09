/**
 * Dada uma sequência de números em um array, retorne esses números ordenados de
 * forma alternada, ou seja, o menor número, seguido do maior, seguido do
 * segundo menor, seguindo do segundo maior, e assim por diante.
 * 
 **/

// Entrada: 1 2 3 4 5
// Saída: 1 5 2 4 3

public class MergeArrays {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		int n = a.length;

		System.out.println("Tamanho do array: " + n);
		System.out.println("");

		for (int i = 0; i < n - i; i++) {

			System.out.println(a[i]);
			System.out.println(a[n - (i + 1)] + ".");

		}
	}
}
