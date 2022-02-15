package testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import desafio.Q2Senha;

public class Q2SenhaTest {

	@Test
	public void countCharactersDeveriaSerUm() {
		String senhaParaVerificacao = "aaaa3***a";
		Q2Senha q2Senha = new Q2Senha();
		int senhaSegura = q2Senha.countCharacters(senhaParaVerificacao);
		Assert.assertEquals(1, senhaSegura);
	}
}
