package testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import desafio.Q1Caractere;

public class Q1CaractereTest {

	@Test
	public void desenhaCaractereSeis() {
		String verificacao;
		int linha = 1;
		int asterisco = 0;
		int espaco = 0;
		int n = 6;
		int valido = 0;
		char caractereAsterisco = '*';
		char caractereEspaco = ' ';

		verificacao = Q1Caractere.desenhaCaractere(n);

		for (int i = 0; i < verificacao.length(); i++) {
			char caracter = verificacao.charAt(i);
			if (caracter == caractereAsterisco) {
				asterisco++;
			} else if (caracter == caractereEspaco) {
				espaco++;
			}
			if (caracter == '\n') {
				if (asterisco != linha || espaco != n - linha) {
					valido++;
					break;
				}
				asterisco = 0;
				espaco = 0;
				linha++;
			}
		}
		Assert.assertEquals(0, valido);
	}

}
