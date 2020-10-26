package Avaliacao;

//import java.util.Arrays;

public class NextNumber {

	public static void main(String[] args) {

		Integer n = 5689;

		System.out.println(numMaior(n));
	}

	public static String numMaior(Integer n) {
		String result = "";
		if (n > 0) {
			
			String[] array = parseToStringArray(n);
			String aux;
			int tam = array.length;

			for (int i = 0; i < tam - 1; i++) {

				for (int j = 0; j < tam - 1 - i; j++) {

					if (array[j].compareToIgnoreCase(array[j + 1]) < 0) {
						aux = array[j];
						array[j] = array[j + 1];
						array[j + 1] = aux;
					}
				}
			}
			for (int i = 0; i < array.length; i++) {
				result += array[i];
			}
		}
		return result;
	}

	private static String[] parseToStringArray(Integer n) {
		String[] array = new String[n.toString().length()];
		char[] caracteres = Integer.toString(n).toCharArray();
		for (int i = 0; i < caracteres.length; i++) {
			array[i] = String.valueOf(caracteres[i]);
		}
		return array;
	}


}
