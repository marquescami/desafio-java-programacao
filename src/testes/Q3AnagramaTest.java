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

	@Test
	public void countAnagramaDeveriaSerDois() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "ovo";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(2, verificaAnagrama);
	}

	@Test
	public void countAnagramaDeveriaSerDoisEx2() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "camila";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(2, verificaAnagrama);
	}

	@Test
	public void countAnagramaDeveriaSerSeis() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "funcionaria";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(6, verificaAnagrama);
	}

	@Test
	public void countAnagramaDeveriaSerSeisEx2() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "contratada";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(6, verificaAnagrama);
	}

	@Test
	public void countAnagramaDeveriaSerDoisEx3() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "capgemini";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(2, verificaAnagrama);
	}

	@Test
	public void countAnagramaDeveriaSerDoisEx4() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "proway";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(0, verificaAnagrama);
	}

	@Test
	public void countAnagramaDeveriaSerTresEx2() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "pessoas";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(3, verificaAnagrama);
	}

	@Test
	public void countAnagramaDeveriaSerZeroEx2() {
		Q3Anagrama q3Anagrama = new Q3Anagrama();
		String palavra = "comida";
		long verificaAnagrama = q3Anagrama.quantidadeAnagramas(palavra);
		Assert.assertEquals(0, verificaAnagrama);
	}
}