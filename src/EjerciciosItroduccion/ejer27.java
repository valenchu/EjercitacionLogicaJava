package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer27 {

	public static void ejer27() {
//		Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
//		donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
//		programa que permita introducir un cuadrado por teclado y determine si este 
//		cuadrado es mágico o no. El programa deberá comprobar que los números 
//		introducidos son correctos, es decir, están entre el 1 y el 9
		Integer[][] matriz = new Integer[3][3];
		boolean ve = false;
		llenarMatriz(matriz, 3);
		mostrarMatriz(matriz, 3);
		ve = verificarMatriz(matriz, 3);
		if (ve == true) {
			System.out.println("ES MATRIZ MAGICA");
		} else {
			System.out.println("NO ES MATRIZ MAGICA");
		}
	}

	// Llleno Matriz con numeros
	public static void llenarMatriz(Integer[][] matriz, int n) {
		int random = 0;
		Scanner sn = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// El try comprueba que no meta letras o simbolos
				try {
					System.out.println("Ingrese el numero de la fila " + i + " columna " + j + " de la matriz");
					random = sn.nextInt();
					// Este else comprueba que no meta numeros menores a 1 o mayores que 9
					if ((random > 0) && (random < 10)) {
						matriz[i][j] = random;
					} else {
						System.out.println("Ingreso un numero que no esta entre 1 y 9");
						j--;
					}
				} catch (Exception e) {
					System.out.println("Ingreso algo que no es un numero intentelo de nuevo");
					sn.next();
					j--;
				}
			}
		}
		// Matriz magica para comprobar
//		matriz[0][0] = 2;
//		matriz[0][1] = 7;
//		matriz[0][2] = 6;
//		matriz[1][0] = 9;
//		matriz[1][1] = 5;
//		matriz[1][2] = 1;
//		matriz[2][0] = 4;
//		matriz[2][1] = 3;
//		matriz[2][2] = 8;
	}

//Verifico matriz magica
	public static boolean verificarMatriz(Integer[][] matriz, int n) {
		Integer[] filas = new Integer[n], columnas = new Integer[n];
		int sumaP = 0, sumaS = 0, contador = 0, a = 0, b = 0;
		boolean com = false, com2 = false;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// sumo diagonal principal y secundaria
				if (i == j) {
					sumaP = sumaP + matriz[i][j];
				}
				if (i + j == n - 1) {
					sumaS = sumaS + matriz[i][j];
				}
				// sumo filas y columnas
				a += matriz[i][j];
				filas[contador] = a;
				b += matriz[j][i];
				columnas[contador] = b;
			}
			a = 0;
			b = 0;
			contador++;
		}
		// comparo que las filas sean igual a las columnas
		// Si no lo son salta un true diciendo que hay una distinta
		for (int i = 0; i < n; i++) {
			if (filas[i] != columnas[i]) {
				com = true;
			}
		}
		// Verifico diagonales principales
		com2 = ((sumaP == sumaS)) ? true : false;
		// Verifico los dos booleanos y retorno una respuesta
		// respuesta true son magicas respuesta false no lo son
		com = (com != true && com2 == true) ? true : false;
		return com;
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
