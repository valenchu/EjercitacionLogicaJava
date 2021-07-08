package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer20 {
	public static void ejer20() {
//		. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
//		número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//		5 *****
//		3 ***
//		11 ***********
//		2 **}
		int[] num = new int[4];
		Scanner sn = new Scanner(System.in);
		llenarArray(num);
		mostrarArray(num);
	}

	// Lleno el array
	public static void llenarArray(int[] num) {
		int tam;
		Scanner sn = new Scanner(System.in);
		tam = num.length;
		for (int i = 0; i < tam; i++) {
			System.out.println("Ingrese 4 numeros entre 1 y 20");
			num[i] = sn.nextInt();
			if (num[i] > 0 && num[i] < 21) {
				System.out.println("Numero CORRECTO faltan " + ((tam - 1) - i));
				System.out.println("----------------");
			} else {
				System.out.println("Numero INCORRECTO restando i ingrese nuevamente la posicion " + (i - 1));
				System.out.println("----------------");
				i--;
			}
		}
	}

	// Muestro el array
	public static void mostrarArray(int[] num) {
		int tam, n;
		String conc = "";
		tam = num.length;
		for (int i = 0; i < tam; i++) {
			n = num[i];
			for (int j = 0; j < n; j++) {
				conc = conc + "*";
			}
			System.out.println(num[i] + " = " + conc);
			conc = "";
		}

	}
}
