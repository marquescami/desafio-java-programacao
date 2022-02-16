package testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import desafio.Q2Senha;

public class Q2SenhaTest {

	@Test
	public void contaCaracteresDeveriaSerUm() {
		String senhaParaVerificacao = "aaaa3***a";
		Q2Senha q2Senha = new Q2Senha();
		int senhaSegura = q2Senha.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(1, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerDois() {
		String senhaParaVerificacao = "123456A";
		Q2Senha q2Senha = new Q2Senha();
		int senhaSegura = q2Senha.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(2, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerZero() {
		String senhaParaVerificacao = "Ya3&ab";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(0, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerTres() {
		String senhaParaVerificacao = "Ya3";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(3, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerQuatro() {
		String senhaParaVerificacao = "!#";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(4, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerCincoEspecial1() {
		String senhaParaVerificacao = "!";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(5, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerCincoEspecial2() {
		String senhaParaVerificacao = "@";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(5, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerCincoEspecial3() {
		String senhaParaVerificacao = "#";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(5, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerCincoEspecial4() {
		String senhaParaVerificacao = "$";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(5, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerCincoEspecial5() {
		String senhaParaVerificacao = "%";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(5, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerCincoEspecial6() {
		String senhaParaVerificacao = "^";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(5, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerCincoEspecial7() {
		String senhaParaVerificacao = "&";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(5, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerCincoEspecial8() {
		String senhaParaVerificacao = "*";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(5, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerDoisEspecial9() {
		String senhaParaVerificacao = "Ca2(";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(2, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerTresEspecial10() {
		String senhaParaVerificacao = "Ya)";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(3, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerDoisEspecial11() {
		String senhaParaVerificacao = "bO-l";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(2, senhaSegura);
	}

	@Test
	public void contaCaracteresDeveriaSerTresEspecial12() {
		String senhaParaVerificacao = "wO+";
		Q2Senha senhaForte = new Q2Senha();
		int senhaSegura = senhaForte.contaCaracteres(senhaParaVerificacao);
		Assert.assertEquals(3, senhaSegura);
	}
}
