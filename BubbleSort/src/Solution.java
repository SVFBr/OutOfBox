
public class Solution {

	/**
	 * 
	 * Bubble Sort: Ordena o vetor através da comparação dos elementos
	 * adjacentes (dois a dois). Ele percorre o vetor várias vezes até que a
	 * ordenação esteja feita, por isso mesmo não é o mais performático. Sendo
	 * assim, não é indicado para ordenação de grande quantidade de dados.
	 * 
	 */

	public static void main(String[] args) {

		int[] vet = { 50, 40, 30, 60, 20, 10 };

		System.out.println("Vetor original:");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}
		}

		System.out.println("\n\nVetor ordenado:");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}
}
