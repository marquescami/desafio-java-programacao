package desafio;

public class Q1Caractere {

	public static String desenhaCaractere(int n) {
		String espaco = " ";
		String caractere = "*";
		String retorno = "";
		int count = 2;

		for (int i = 0; i < n; i++) {
			for (int j = n; j > 0; j--) {
				if (j < count) {
					retorno += caractere;
				} else {
					retorno += espaco;
				}
			}
			if (i < n - 1) {
				retorno += ("\n");
			}
			count++;
		}
		//metodo para impressao escada
		//Q1Caractere.imprime(retorno);
		return retorno;
	}
	public static void imprime(String degraus) {
		System.out.println(degraus);
	}
}
