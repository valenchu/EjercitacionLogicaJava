package POO;

import java.util.Scanner;

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

	// Metodo que muestra cuantas veces se repite un caracter ingresado por el
	// usuario en la frase
	public boolean vecesRepetido(String letra) {
		// El boolean comprueba que haya ingresado 1 solo caracter
		boolean comprobarLetra = (letra.length() > 1) ? false : true;
		String caracter;
		int contador = 0;
		for (int i = 0; i < this.longitud; i++) {
			// Tomo letra a letra con substring
			caracter = this.frase.substring(i, i + 1);
			if (letra.equalsIgnoreCase(caracter)) {
				contador++;
			}
		}
		System.out.println("--------------||||--------------");
		System.out.println("El caracter [" + letra + "] se repite [" + contador + "] veces");
		return comprobarLetra;
	}

	// Metodo que compara longitud de frase de la clase con la ingresada por el
	// usuario
	public void compararLongitud(String frase) {
		int longitudFraseActual = frase.length();
		int longitudFraseClase = this.longitud;
		String resp = "";
		if (longitudFraseActual > longitudFraseClase) {
			resp = "La frase ingresada actualmente es mayor en tamaño a la de la clase";
		} else if (longitudFraseActual == longitudFraseClase) {
			resp = "La frase ingresada actualmente es igual en tamaño a la de la clase";
		} else {
			resp = "La frase ingresada actualmente es menor en tamaño a la de la clase";
		}
		System.out.println("--------------||||--------------");
		System.out.println(resp);
	}

	// Metodo que une dos cadenas
	public String unirFrases(String frase) {
		String fraseClase = this.frase;
		boolean inicio = false, finall = false;
		// Verifico si la frase termina con espacio
		// Si termina con espacio concateno simplemente
		// si no termina con espacio concateno con un espacio
		inicio = fraseClase.endsWith(" ");
		StringBuilder str = new StringBuilder(fraseClase);
		if (inicio == true) {
			str.append(frase);
		} else {
			str.append(" ").append(frase);
		}
		System.out.println("--------------||||--------------");
		return str.toString();
	}

	// Metodo reemplazo de letra "a"
	public String reemplazar(String letra) {
		String caracterComparar, fraseResultante = "";
		boolean comprobarIgualdad = false;
		for (int i = 0; i < this.longitud; i++) {
			// Guardo el caracter a verificar
			caracterComparar = this.frase.substring(i, i + 1);
			// Verifico si el caracter tomado arriba es igual a "a"
			comprobarIgualdad = "a".contains(String.valueOf(caracterComparar).toLowerCase());
			// Creo objeto StringBuilder y le paso el string que voy a concatenar para dar
			// la frase resultante
			StringBuilder str = new StringBuilder(fraseResultante);
			// Si la comprobacionde la igualdad de si el caracter ingresado es igual a "a"
			// meto en la variable el caracter que se debe reemplazar
			// si no meto el caracter comun y corriente Ejemplo "a" es igual a "a" tonces
			// meto en caracterComparar
			// el simbolo o letra que quiere que reemplace el usuario si no es igual a "a"
			// guardo la misma letra y la
			// concateno abajo
			caracterComparar = (comprobarIgualdad == true) ? letra : caracterComparar;
			// str.append lo que hace es ir concatenando las letras una a una
			str.append(caracterComparar);
			// desp de concatenarlas las guardo en frase resultante para retornar la frase
			// toda concatenada
			// Cuando se habla de concatenar se habla de unir frases o letras en este caso
			fraseResultante = str.toString();
		}
		System.out.println("--------------||||--------------");
		return fraseResultante;
	}

	// Metodo que comprueba si dicha letra esta en la frase o no
	public boolean contiene(String letra) {
		boolean resultado = false;
		char caracter;
		int cont = 0;
		for (int i = 0; i < this.longitud; i++) {
			// Tomo letra a letra y la guardo en caracter
			caracter = this.frase.charAt(i);
			// Verifico si la letra tomada es igual a la letra o caracter solicitado por el
			// usuario
			resultado = letra.contains(String.valueOf(caracter).toLowerCase());
			// Si resultado es true significa que se encontro tonces suma 1 a contado
			if (resultado == true) {
				cont++;
			}
		}
		// Retorno el valor booleando obtenido del procedimiento
		// si contador es distinto de 0 significa que al menos una vez se encontro el
		// caracter en la frase retorna true
		// si no, no se cencontro, tonces retorna false
		return resultado = (cont != 0) ? true : false;
	}

//MENU-------------------------------------------------
	public void menu() {
		System.out.println("--------------||||--------------");
		System.out.println("1- Muestra la cantidad de vocales");
		System.out.println("2- Invierte la frase");
		System.out.println("3- Muestra la cantidad de veces que se repite una letra en la frase");
		System.out.println("4- Compara las longitudes de la frase");
		System.out.println("5- Une la frase de la clase con la frase que ingresa");
		System.out.println("6- Reemplaza el caracter A de la frase \ncon el caracter que ingrese");
		System.out.println("7- Comprobar si la letra solicitada esta en la frase o no");
		System.out.println("0- Para salir del programa");
	}

	// Metodo de acciones del MENU
	public void accionesMenu(int accion) {
		Scanner sn = new Scanner(System.in);
		String letra = "";
		boolean p = false;
		switch (accion) {
		case 1:
			System.out.println("---- MOSTRANDO CANT DE VOCALES ----");
			mostrarVocales();
			break;
		case 2:
			System.out.println("---- INVIRTIENDO FRASE ----");
			invertirFrase();
			break;
		case 3:

			do {
				System.out.println("Ingrese una letra para ver cuantas veces se repite en la frase");
				letra = sn.nextLine();
				System.out.println("---- COMPROBANDO REPETICION DE LETRA EN FRASE ----");
				p = vecesRepetido(letra);
				if (p == false) {
					System.out.println("Ingreso mas de 1 caracter");
				}
			} while (p != true);
			break;
		case 4:

			System.out.println("Inserte la frase que quiera comparar longitud");
			letra = sn.nextLine();
			System.out.println("---- COMPROBANDO LONGITUDES ----");
			compararLongitud(letra);
			break;
		case 5:

			System.out.println("Inserte la frase que quiera concatenar o unir");
			letra = sn.nextLine();
			letra = unirFrases(letra);
			System.out.println("---- CONCATENANDO FRASES ----");
			System.out.println("Frase resultante : [" + letra + "]");
			break;
		case 6:
			do {
				System.out.println("Ingrese caracter a reemplazar por A en la frase");
				letra = sn.nextLine();
				p = (letra.length() > 1) ? false : true;
				if (p == true) {
					System.out.println("---- REEMPLAZANDO A POR [" + letra + "] ----");
					letra = reemplazar(letra);
					System.out.println("Frase resultante : [" + letra + "]");
				} else {
					System.out.println("Ingreso mas de 1 caracter para reemplazar en la frase las A");
				}
			} while (p != true);
			break;
		case 7:
			do {
				System.out.println("Ingrese la letra a verificar si esta en la frase o no");
				letra = sn.nextLine();
				p = (letra.length() > 1) ? false : true;
				if (p == true) {
					boolean result = contiene(letra);
					System.out.println("---- VERIFICANDO [" + letra + "] EN FRASE ----");
					if (result == true) {
						System.out.println("La letra [" + letra + "] se encuentra en la frase");
					} else {
						System.out.println("La letra [" + letra + "] no se encuentra en la frase");
					}
				} else {
					System.out.println("Ingreso mas de 1 caracter para buscar en la frase");
				}
			} while (p != true);
			break;
		case 0:
			System.out.println("---- SALIENDO DEL PROGRAMA ----");
			break;
		default:
			System.out.println("La accion ingresada no se encuentra intentelo de nuevo");
			break;
		}
	}

}
