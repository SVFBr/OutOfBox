
/**
 * 
 * Método genérico com extensão de Comparable.
 * 
 * */


public class ParametrosDeTipoDelimitado {

	public static <T extends Comparable<T>> T maior(T x, T y, T z) {

		T max = x; // x assume que é o máximo

		if (y.compareTo(max) > 0) {
			max = y; // y assume que é o máximo
		}
		if (z.compareTo(max) > 0) {
			max = z; // z assume que é o máximo
		}

		return max;

	}

	public static void main(String[] args) {

		System.out.printf("Maior de %d, %d e %d é: %d\n\n", 1, 2, 3, maior(1, 2, 3));

		System.out.printf("Maior de %.1f,%.1f e %.1f é: %.1f\n\n", 1.1, 1.5, 2.0, maior(1.1, 1.5, 2.0));

		System.out.printf("Maior de %s, %s e %s é: %s\n", "Java", "Abap", "Delphi", maior("Java", "Abap", "C#"));

	}

}
