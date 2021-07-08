package EjerciciosItroduccion;

import java.util.Random;

public class ejer25 {

	public static void ejer25() {
//		Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
//		muestre traspuesta. ¿Que es una matriz traspuesta?

		Integer[][] matriz = new Integer[4][4];
		llenarMatriz(matriz, 4);
		mostrarMatriz(matriz, 4);
		mostrarMatrizTrans(matriz, 4);
	}

	// Llleno Matriz con numeros random
	public static void llenarMatriz(Integer[][] matriz, int n) {
		int random;
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
//				random = (int) Math.floor((Math.random() * (20) ));
				random = r.nextInt(20 - 10 + 1) + 10;
				matriz[i][j] = random;
			}
		}
	}

	// Muestro Matriz
	public static void mostrarMatrizTrans(Integer[][] matriz, int n) {
		System.out.println("Transpuesta");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print("[ " + matriz[j][i] + " ]");
			}
			System.out.println();
		}
	}

	// Muestro Matriz
	public static void mostrarMatriz(Integer[][] matriz, int n) {
		System.out.println("Normal");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print("[ " + matriz[i][j] + " ]");
			}
			System.out.println();
		}
	}
}
