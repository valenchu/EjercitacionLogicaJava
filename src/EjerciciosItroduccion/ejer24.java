package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer24 {

	public static void ejer24() {
//		Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//		cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
		Integer[] vec = null, devolucion = new Integer[5];
		Scanner sn = new Scanner(System.in);
		String num, exist, dig;
		int tam;
		boolean log;
		// Tamaño del array
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
		devolucion = recorrerMostrar(vec);

		for (int i = 0; i < devolucion.length; i++) {
			num = (devolucion[i].equals(1)) ? "numero" : "numeros";
			exist = (devolucion[i].equals(1)) ? "Existe" : "Existen";
			dig = (devolucion[i].equals(1)) ? "digito" : "digitos";
			if ((i <= 4) && (devolucion[i] > 0)) {
				System.out.println(exist + " " + devolucion[i] + " " + num + " de " + (i + 1) + " " + dig);
			}
		}

	}

	// lleno vector num random
	public static void llenarVec(Integer[] vec) {
		int tam, random;
		tam = vec.length;
		for (int i = 0; i < tam; i++) {
			random = (int) Math.floor((Math.random() * 99999) + 1);
			vec[i] = random;
		}
	}

	// Recorrer vector
	public static Integer[] recorrerMostrar(Integer[] vec) {
		int tam = 0, contA = 0, contB = 0, contC = 0, contD = 0, contE = 0, tamCadena = 0;
		String cadena = "";
		tam = vec.length;
		Integer[] devolver = new Integer[5];

		for (int i = 0; i < tam; i++) {
			cadena = vec[i].toString();
			tamCadena = cadena.length();
			switch (tamCadena) {
			case 1:
				contA++;
				break;
			case 2:
				contB++;
				break;
			case 3:
				contC++;
				break;
			case 4:
				contD++;
				break;
			case 5:
				contE++;
				break;

			default:
				System.out.println("Sobrepasa los digitos definidos");
				break;
			}
		}
		devolver[0] = contA;
		devolver[1] = contB;
		devolver[2] = contC;
		devolver[3] = contD;
		devolver[4] = contE;
		return devolver;
	}

}
