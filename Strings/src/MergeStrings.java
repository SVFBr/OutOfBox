/**
 * Implemente um método que faça o merge de duas strings, que recebendo A e B,
 * gere um resultado contendo os caracteres alternadamente de cada uma,
 * começando por A. Se uma das strings for menor, todos os caracteres restantes
 * da outra deverão ser adicionados no final da string resultante.
 * 
 * Para um outra muito interessante e possível linda de pensamento, ver solução
 * Day6LetsReview no package com.hackerrank.challenges ;)
 * 
 */

// a = Acegilnp
// b = Bdf jm
// resultado: ABcdefg ijlmn p

public class MergeStrings {

	public static void main(String[] args) {

		String a = "Acegilnp";
		String b = "Bdf jm ";
		int iA = 0;
		int iB = 0;
		StringBuilder quebra = new StringBuilder();

		for (int i = 0; i <= (a.length() + b.length()); i++) {

			if (iA < a.length()) {
				quebra.append(a.charAt(iA));
				iA++;
			}
			if (iB < b.length()) {
				quebra.append(b.charAt(iB));
				iB++;
			}

		}
		System.out.println(quebra);
	}
}
