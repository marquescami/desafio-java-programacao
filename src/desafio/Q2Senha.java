package desafio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2Senha {

	public int countCharacters(String password) {

		int count = 0;

		Pattern digito = Pattern.compile("(\\d)");
		Pattern letraMaiuscula = Pattern.compile("([A-Z])");
		Pattern letraMinuscula = Pattern.compile("([a-z])");
		Pattern spChar = Pattern.compile("(\\W)");

		Matcher Digito = digito.matcher(password);
		Matcher LetraMaiuscula = letraMaiuscula.matcher(password);
		Matcher LetraMinuscula = letraMinuscula.matcher(password);
		Matcher Especial = spChar.matcher(password);

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

		if ((count + password.length()) < 6) {
			count = count + 6 - (count + password.length());
		}

		return count;
	}

}
