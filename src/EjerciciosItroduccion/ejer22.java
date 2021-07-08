package EjerciciosItroduccion;

import java.util.Arrays;

public class ejer22 {

	public static void ejer22() {
//		Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
//		los muestre por pantalla en orden descendente.
		Integer[] vec = new Integer[100];
		// llenar mostrar vec con numeros randoms ordenado
		llenarVec(vec);
		mostrarVec(vec);
		// llenar y mostrar vec con numeros de 1 a 100
		llenarVecNormal(vec);
		mostrarVecNormal(vec);
	}

	// Llleno vector con numeros random
	public static void llenarVec(Integer[] vec) {
		int tam, random;
		tam = vec.length;
		for (int i = 0; i < tam; i++) {
			random = (int) Math.floor((Math.random() * 100) + 1);
			vec[i] = random;
		}

	}

	// muestro vector menor a mayor numeros randoms de 0 a 100
	public static void mostrarVec(Integer[] vec) {
		int tam, menor;
		tam = vec.length;

		for (int i = 0; i < tam; i++) {
			for (int j = 1; j < (tam - 1); j++) {
				if (vec[j - 1] > vec[j]) {
					menor = vec[j - 1];
					vec[j - 1] = vec[j];
					vec[j] = menor;
				}
			}
		}
		System.out.println("Array ordenado con 100 numeors\n " + Arrays.toString(vec));
	}

	// lleno vector con numero 1 a 100
	public static void llenarVecNormal(Integer[] vec) {
		int tam, random;
		tam = vec.length;
		for (int i = 1; i < tam; i++) {
			vec[i] = i;

		}

	}

	// muestro vector con numero 100 a 1 descendente
	public static void mostrarVecNormal(Integer[] vec) {
		int tam, random;
		tam = vec.length;
		System.out.println(tam);
		for (int i = tam - 1; i > 0; i--) {
			System.out.println("Mostrando vec de 0 a 100");
			System.out.println(vec[i]);
		}

	}

}
