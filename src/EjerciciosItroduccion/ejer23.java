package EjerciciosItroduccion;

import java.util.Arrays;
import java.util.Scanner;

public class ejer23 {

	public static void ejer23() {
//		Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
//		pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
//		encuentra el numero y si se encuentra repetido
		Integer[] vec = null, vecDo = new Integer[2];
		int tam, num;
		boolean log = false;
		Scanner sn = new Scanner(System.in);
		do {
			try {
				System.out.println("Ingrese tamaño del array");
				tam = sn.nextInt();
				vec = new Integer[tam];
				log = true;
			} catch (Exception e) {
				System.out.println("Error de ingreso de datos");
				log = false;
				sn.next();
			}
		} while (log == false);
		llenarVec(vec);
		mostrarVec(vec);

		System.out.println("Ingrese el numero a buscar en el vector");
		num = sn.nextInt();
		vecDo = buscarNum(vec, num);
		if (vecDo[1] != -1) {
			System.out.println(
					"El numero " + num + " esta en la posicion " + vecDo[0] + " y se repite " + vecDo[1] + " veces");
		} else {
			System.out.println("No se encontro numero en el vector");
		}

	}

	// lleno vector num random
	public static void llenarVec(Integer[] vec) {
		int tam, random;
		tam = vec.length;
		for (int i = 0; i < tam; i++) {
			random = (int) Math.floor((Math.random() * 50) + 1);
			vec[i] = random;
		}
	}

	// muestro vector
	public static void mostrarVec(Integer[] vec) {
		int tam, cont;
		tam = vec.length;
		cont = 0;
		System.out.println(Arrays.toString(vec));
	}

	public static Integer[] buscarNum(Integer[] vec, int buscar) {
		String a;
		Integer[] vecD = new Integer[2];
		vecD[0] = -1;
		int tam, cont = 0, ini = 0;
		tam = vec.length;

		for (int i = 0; i < tam; i++) {
			if (vec[i].equals(buscar)) {
				if (vecD[0].equals(-1)) {
					vecD[0] = i;
				}
				cont++;
			}
		}
		if (cont == 0) {
			vecD[1] = -1;
		} else {
			vecD[1] = cont;
		}
		return vecD;
	}
}
