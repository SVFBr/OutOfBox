/**
 * Dada uma sequ�ncia de n�meros em um array, retorne esses n�meros ordenados de
 * forma alternada, ou seja, o menor n�mero, seguido do maior, seguido do
 * segundo menor, seguindo do segundo maior, e assim por diante.
 * 
 **/

// Entrada: 1 2 3 4 5
// Sa�da: 1 5 2 4 3

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
