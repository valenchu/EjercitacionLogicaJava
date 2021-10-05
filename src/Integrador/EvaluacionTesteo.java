package Integrador;

public class EvaluacionTesteo {

	public Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
		int result = numEnt % 2;
		boolean verificarPar = false, verificarValorAnt = false, veriNumLargo = false;
		// Numero Int
		if (result == 0) {
			verificarPar = true;
		} else {
			verificarPar = false;
		}

		// numero Double
		double parteDecimal = numReal % 1;
		int parteEntera = (int) (numReal - parteDecimal);
		int redondearNum = (int) Math.round(numReal);
		if (redondearNum == (parteEntera + 1)) {
			verificarValorAnt = false;
		} else if (redondearNum == (parteEntera)) {
			verificarValorAnt = true;
		}

		// numero Long
		if (numLargo > 0 || numLargo == 0) {
			veriNumLargo = true;
		} else {
			veriNumLargo = false;
		}

		// Verifico los booleanos
		if (verificarPar == true && verificarValorAnt == true && veriNumLargo == true) {
			return true;
		} else {
			return false;
		}
	}

	public String geringoso(String palabra) {
		palabra = palabra.toLowerCase();
		String resultado = "";
		String ver = "";
		for (int i = 0; i < palabra.length(); i++) {
			String vocal = palabra.substring(i, i + 1);
			ver += vocal;
			switch (vocal) {
			case "a":
				resultado = 'p' + vocal;
				ver += resultado;
				break;
			case "e":
				resultado = 'p' + vocal;
				ver += resultado;
				break;
			case "i":
				resultado = 'p' + vocal;
				ver += resultado;
				break;
			case "o":
				resultado = 'p' + vocal;
				ver += resultado;
				break;
			case "u":
				resultado = resultado.substring(0, palabra.length()) + 'p' + vocal
						+ resultado.substring(palabra.length());
				break;

			default:

				break;
			}

		}
		return ver;

	}

	public String inversa(String palabra) {
		String inversa = "";
		palabra = palabra.toLowerCase();
		for (int i = palabra.length(); i > 0; i--) {
			inversa += palabra.substring(i - 1, i);
		}
		return inversa;
	}

}
