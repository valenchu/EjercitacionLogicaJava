package Integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class prueba {

	public static void main(String[] args) {
//		Integer num = -123454321;
//		System.out.println("Es capicua el numero = " + num + "? " + numCapicua(num));
//		int inicio = 455, cantCaramelos = 1585, cantPresos = 500;
//		int resultado = prisioneroDulce(inicio, cantCaramelos, cantPresos);
//		System.out.println("El prisionero que tuvo el caramelo podrido esta en la posicion = " + resultado);
//		ArrayList<String> listaMedias = new ArrayList<String>();
//		HashSet<String> listaM = new HashSet<String>();
//		listaMedias.add("A");
//		listaMedias.add("B");
//		listaMedias.add("A");
//		listaMedias.add("B");
//		listaMedias.add("C");
//		listaMedias.add("A");
//		listaMedias.add("F");
//		listaMedias.add("Z");
//		listaMedias.add("C");
//		listaMedias.add("H");
//		listaM = mediasAmigas(listaMedias);
//		listaM.forEach(p -> System.out.print(p + ","));
		//Resuelve desp de esto para evaluacion
		EvaluacionTesteo e = new EvaluacionTesteo();
//		boolean result = e.parCieloPiso(2, 2, -3);
//		String result = e.geringoso("hola");
		String result = e.inversa("raton ");
		System.out.println(result);

	}

	public static boolean numCapicua(Integer numero) {
		Integer aux = numero, cifra = 0, inverso = 0;
		boolean verificar = false;
		if (aux == null) {
			verificar = false;
		} else {
			if (aux > 0 && aux < 10) {// Verifico que no sea un solo digito
				verificar = true;
			} else {
				while (aux != 0) {// si el numero es distinto de 0 recorro numero
					cifra = aux % 10;// saco el resto del numero
					inverso = (inverso * 10) + (cifra);// Voy dando vuelta el numero 1 a uno para ver si es capicua
					aux = aux / 10;// Voy dividiendo hasta que queda en cero para dejar de repetir el proceso
				}
				if (numero.equals(inverso)) {// Verifico si numero es igual a inverso que es el que fui dando vuelta
					// tonces es capicua si no no es capicua
					verificar = true;
				} else {
					verificar = false;
				}
			}
		}
		return verificar;
	}

	public static int prisioneroDulce(int inicio, int cantCaramelos, int cantDePresos) {
		int resultado = 0;
		for (int i = inicio; inicio < cantDePresos; i++) { // instancio i con la variable inicio
			cantCaramelos--;// resto 1 caramelo por cada vuelta
			if (cantCaramelos == 0) {// Si los caramelos son igual a cero
				resultado = i;// guardo el prisionero que recibio el podrido
				break;
			}
			if (i == cantDePresos) {// Si la i es igual a la cantidad de preso reinicio bucle ya que caramelos no es
									// == a 0
				i = 0;
			}

		}
		return resultado;
	}

	public static HashSet<String> mediasAmigas(ArrayList<String> listaMedias) {
		int fin = listaMedias.size();// Tomo el tamaño de la lista para recorrerla
		HashSet<String> result = new HashSet<String>();
		for (int i = 0; i < fin; i++) {
			int cant = Collections.frequency(listaMedias, listaMedias.get(i));// Recorro la lista, con frecuency toma
																				// los
			// datos que se repiten en la lista y el segundo parametro el dato que se
			// repite, en este caso la letra que
			// adquiero con listamedias.get(i)
			if (cant >= 2) {// si la cantidad es mayor o igual a 2 hay un par tonces la guardo en uns
							// hashset
				// las guardo en un hashSet para que no me repita letras
				result.add(listaMedias.get(i));
			}
		}

		return result;// retorno hasset y lo muestro por pantalla

	}

}
