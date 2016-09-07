
public class Classe<T> {

	private T t;

	public void adiciona(T t) {
		this.t = t;
	}

	public T retorna() {
		return t;
	}

	public static void main(String[] args) {

		Classe<Integer> integerClasse = new Classe<Integer>();
		integerClasse.adiciona(new Integer(100));
		System.out.println("Classe Integer diz: " + integerClasse.retorna());

		Classe<String> stringClasse = new Classe<String>();
		stringClasse.adiciona(new String("Olá"));
		System.out.println("\nClasse String diz: " + stringClasse.retorna());

	}

}
