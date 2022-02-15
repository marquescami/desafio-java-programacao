package desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Q3Anagrama {
	private String palavra;
	private Map<String, Map<String, Integer>> map = new HashMap<>();

	public long quantidadeAnagramas(String palavra) {
		this.palavra = palavra;
		List<String> subStrings = getSubStrings();

		for (String subString : subStrings) {
			char[] caracteres = subString.toCharArray();
			Arrays.sort(caracteres);
			String subStringOrdenada = new String(caracteres);

			if (map.containsKey(subStringOrdenada)) {
				Map<String, Integer> mapValue = map.get(subStringOrdenada);
				mapValue.put(subString, Objects.requireNonNullElse(mapValue.get(subString), 1) + 1);
			} else {
				map.put(subStringOrdenada, new HashMap<>(Map.of(subString, 1)));
			}
		}
		var quantidadeAnagramas = map.values().stream().filter(value -> value.values().stream().count() > 1
				|| value.values().stream().filter(count -> count > 1).count() > 0).count();
		return quantidadeAnagramas;
	}

	public List<String> getAnagramas() {
		List<String> anagramas = new ArrayList<>();

		for (Map<String, Integer> mapValues : map.values()) {
			if (mapValues.values().size() > 1) {
				anagramas.add(mapValues.keySet().toString());
				continue;
			}

			for (Map.Entry<String, Integer> value : mapValues.entrySet()) {
				if (value.getValue() > 1) {
					anagramas.add(String.format("[ %s, %s ]", value.getKey(), value.getKey()));
				}
			}
		}
		return anagramas;
	}

	private List<String> getSubStrings() {
		List<String> subStrings = new ArrayList<>();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i; j < palavra.length(); j++) {
				subStrings.add(palavra.substring(i, j + 1));
			}
		}
		return subStrings;
	}

}