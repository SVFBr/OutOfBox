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

		for (int i = 0; i < n - i; i++) {
			System.out.print(a[i]);
			if (i >= n / 2)
				break;
			System.out.print(a[n - (i + 1)]);

			// Teste de retorno para parada
			// System.out.println(Math.abs(i) + "abs");

		}
	}
}
