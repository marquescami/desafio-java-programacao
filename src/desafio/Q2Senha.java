package desafio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2Senha {

	public int contaCaracteres(String senha) {

		int count = 0;

		Pattern digito = Pattern.compile("(\\d)");
		Pattern letraMaiuscula = Pattern.compile("([A-Z])");
		Pattern letraMinuscula = Pattern.compile("([a-z])");
		Pattern spChar = Pattern.compile("(\\W)");

		Matcher Digito = digito.matcher(senha);
		Matcher LetraMaiuscula = letraMaiuscula.matcher(senha);
		Matcher LetraMinuscula = letraMinuscula.matcher(senha);
		Matcher Especial = spChar.matcher(senha);

		if (!Digito.find()) {
			count++;
		}
		if (!LetraMaiuscula.find()) {
			count++;
		}
		if (!LetraMinuscula.find()) {
			count++;
		}
		if (!Especial.find()) {
			count++;
		}

		if ((count + senha.length()) < 6) {
			count = count + 6 - (count + senha.length());
		}

		return count;
	}

}
