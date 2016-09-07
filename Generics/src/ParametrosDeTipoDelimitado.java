
/**
 * 
 * M�todo gen�rico com extens�o de Comparable.
 * 
 * */


public class ParametrosDeTipoDelimitado {

	public static <T extends Comparable<T>> T maior(T x, T y, T z) {

		T max = x; // x assume que � o m�ximo

		if (y.compareTo(max) > 0) {
			max = y; // y assume que � o m�ximo
		}
		if (z.compareTo(max) > 0) {
			max = z; // z assume que � o m�ximo
		}

		return max;

	}

	public static void main(String[] args) {

		System.out.printf("Maior de %d, %d e %d �: %d\n\n", 1, 2, 3, maior(1, 2, 3));

		System.out.printf("Maior de %.1f,%.1f e %.1f �: %.1f\n\n", 1.1, 1.5, 2.0, maior(1.1, 1.5, 2.0));

		System.out.printf("Maior de %s, %s e %s �: %s\n", "Java", "Abap", "Delphi", maior("Java", "Abap", "C#"));

	}

}
