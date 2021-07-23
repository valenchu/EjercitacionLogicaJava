package POO;

public class CadenaEjer8POO {
	// Atributos
	private String frase;
	private int longitud;

	// Constructores
	// lleno
	public CadenaEjer8POO(String frase, int longitud) {
		this.frase = frase;
		this.longitud = longitud;
	}

	// Vacio
	public CadenaEjer8POO() {
	}

	// GetterANDSetters
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// Metodos
	// Este metodo cuenta las vocales dentro de la cadena
	public void mostrarVocales() {
		String laFrase = this.frase;
		char caracter;
		boolean pruebaCaracter;
		laFrase = laFrase.toLowerCase();
		int contadorVocalesA = 0, contadorVocalesE = 0, contadorVocalesI = 0, contadorVocalesO = 0,
				contadorVocalesU = 0;
		for (int i = 0; i < this.longitud; i++) {
			caracter = laFrase.charAt(i);
			// Tomo el caracter con String.valueOf(caracter)
			// con contains comparo si ese caracter esta dentro de la cadena "aeiou"
			// si esta dentro de la cadena deja pruebaCaracter en true
			pruebaCaracter = "aeiou".contains(String.valueOf(caracter));
			// Si prueba caracter es true ingreso al switch en el switch cuento las vocales
			if (pruebaCaracter == true) {
				switch (caracter) {
				case 'a':
					contadorVocalesA++;
					break;
				case 'e':
					contadorVocalesE++;
					break;
				case 'i':
					contadorVocalesI++;
					break;
				case 'o':
					contadorVocalesO++;
					break;
				case 'u':
					contadorVocalesU++;
					break;

				default:
					break;
				}
			}
		}
		System.out.println("--------------||||--------------");
		System.out.println("La frase tiene: " + contadorVocalesA + " vocales A");
		System.out.println("La frase tiene: " + contadorVocalesE + " vocales E");
		System.out.println("La frase tiene: " + contadorVocalesI + " vocales I");
		System.out.println("La frase tiene: " + contadorVocalesO + " vocales O");
		System.out.println("La frase tiene: " + contadorVocalesU + " vocales U");

	}

	// Este metodo invierte la frase ingresada
	public void invertirFrase() {
		String laFrase = this.frase;
		// Creo objeto StringBuilder
		// Este objeto tiene un metodo llamado reverse() que invierte los caracteres
		// dentro de la cadena como se ve en el ejemplo
		StringBuilder cadena = new StringBuilder(laFrase);
		laFrase = cadena.reverse().toString();
		System.out.println("--------------||||--------------");
		System.out.println("Frase en INVERTIDA");
		System.out.println(laFrase);
	}
	//Metodo que muestra cuantas veces se repite un caracter ingresado por el usuario en la frase
	public boolean vecesRepetido(String letra) {
		//El boolean comprueba que haya ingresado 1 solo caracter
		boolean comprobarLetra = (letra.length() > 1)?false:true;
		boolean comprobarCaracterEnFrase = false;
		char caracter ;
		int contador = 0;
		for(int i = 0; i<this.longitud; i++) {
			//Tomo letra a letra con charAt
			caracter = this.frase.charAt(i);
			
			comprobarCaracterEnFrase = 
		}
		
		return comprobarLetra;
	}

}
