package testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import desafio.Q3Anagrama;

public class Q3AnagramaTest {

	@Test
	public void countAnagramaDeveriaSerTres() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "ifailuhkqq";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(3, verificaAnagrama);
	}
}