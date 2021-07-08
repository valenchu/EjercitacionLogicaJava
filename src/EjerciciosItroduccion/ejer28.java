package EjerciciosItroduccion;

import java.util.Random;

public class ejer28 {
	public static void ejer28() {
//		Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz 
//		P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está 
//		contenida dentro de la matriz M. Para ello se debe verificar si entre todas las 
//		submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o 
//		columnas, existe al menos una que coincida con la matriz P. En ese caso, el 
//		programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
//		primer elemento de la submatriz P
		Integer[][] matrizA = new Integer[10][10], matrizB = new Integer[3][3], tercera = new Integer[3][3];
		boolean comprobar = false;
		String[] most = new String[3];
		llenarMatriz(matrizA, matrizB, 10, 3);
		mostrarMatriz(matrizA, matrizB, 10, 3);
		most = tercerMatriz(matrizA, matrizB, 10, 3, tercera);
		mostrarMatriz(matrizB, tercera, 3, 3);
		comprobar = comprobarMatriz(matrizB, tercera);

		if (comprobar == true) {
			System.out.println("La matriz se encuentra en la principal");
			for (String string : most) {
				System.out.println(string);
			}
		} else {
			System.out.println("No se encontro una copia en la matriz principal de la matriz de 3x3");
		}
	}

	// 10 //3
	public static String[] tercerMatriz(Integer[][] matrizA, Integer[][] matrizB, int a, int b, Integer[][] tercera) {
		String[] variables = new String[3];
		// Primer for cuenta cantidad de igualdades que se encuentran en matriA 10X10
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {
				for (int k = 0; k < a; k++) {
					for (int y = 0; y < a; y++) {
						if (j > 0) {
							break;
						} else {
							if (i != 3) {

								if ((matrizA[k][y] == matrizB[i][j])) {
									int ver = con(matrizA, k, y, matrizB, i, j, b, a, tercera);
									if (ver == b) {
										if (i == 0) {
											variables[0] = "Matriz 3x3 se encuentra en punto Matriz 10x10 Fila " + k
													+ " Columna " + y;
										} else if (i == 1) {
											variables[1] = "Matriz 3x3 se encuentra en punto Matriz 10x10 Fila " + k
													+ " Columna " + y;
										} else if (i == 2) {
											variables[2] = "Matriz 3x3 se encuentra en punto Matriz 10x10 Fila " + k
													+ " Columna " + y;
										}
										i = i + 1;
									}
								}
							} else {
								break;
							}
						}
					}
				}
			}
		}
		return variables;

	}

//Busqueda de matriz
	public static int con(Integer[][] matrizA, int k, int y, Integer[][] matrizB, int o, int l, int lonMatrB, int longa,
			Integer[][] tercera) {
		int con = 0, conb = 0;
		boolean log, coma = false, comb = false;
		int va = 0;
		int vb = 0;
		// Recorro las filas para ver si se repite las veces que se pide
		for (int i = 0; i < lonMatrB; i++) {
			// Compruebo que la fila tenga 3 de distancia o que la columna tenga 3 de
			// distancia
			log = ((y <= longa - 2) && (k <= longa - 2)) ? true : false;
			if (log) {

				// Guardo variable y la comparo. Si i tiene un 1 o 2 sumo a la fila y comparo
				// siguiente valor
				// para vereficar que se repite 3 veces los valores y comprobar que existe en la
				// matriz 10x10
				va = matrizA[k][y + i];
				vb = matrizB[o][l + i];
				if (va != vb) {
					// Se guarda coma true verificando que 1 de los valores no es verdadero tonces
					// no
					// existe matriz
					coma = true;
					// con igualado a 2 lo que hace es hacerme salir del for mas abajo
					con = 2;
					break;
				} else {
					con++;
				}
			} else {
				System.out.println("----------------------fuera de rango");
			}
			// Si con == a longitud i lo iguala a longitud y deja de comprobar
			if (con == lonMatrB) {
				i = lonMatrB;
			}
		}
		// Igualo todo a cero para verificar ahora las Columnas
		va = 0;
		vb = 0;
		con = 0;
		// For de columnas
		for (int i = 0; i < lonMatrB - o; i++) {
			// Compruebo distancia como en el anterior for
			log = ((y <= longa - 2) && (k <= longa - 2)) ? true : false;
			if (log) {
				// Guardo variables
				va = matrizA[k + i][y];
				vb = matrizB[o + i][l];
				// Si en algun momento es distinto guarda comb como true que entro
				if (va != vb) {
					comb = true;
					con = 2;
					break;
				} else {
					con++;
				}
			} else {
				System.out.println("----------------------fuera de rango");
			}
			if (con == lonMatrB) {
				i = lonMatrB;
			}
		}
		// Si comb != de true osea que se encontro la matriz completa y
		// Si coma != de true entra si ambos son distinto de true entra y rellena la
		// tercer matriz que es la que comparare luego para verificar que existe
		if (comb != true && coma != true) {
			// Compruebo distancia
			log = ((y <= longa - 2) && (k <= longa - 2)) ? true : false;
			if (log) {
				// con un for guardo la matriz
				for (int i = 0; i < lonMatrB; i++) {
					tercera[o][l] = matrizA[k][y];
					tercera[o][l + i] = matrizA[k][y + i];
					// conb lo que hace es sumar si sumo 3 hace salto en la fila para buscar en
					// siguiente fila del
					// vector 3x3
					conb++;
				}
			}
		}
		k = 0;
		y = 0;
		o = 0;
		l = 0;
		lonMatrB = 0;
		longa = 0;
		return conb;
	}

	// Compruebo la matriz con esto
	public static boolean comprobarMatriz(Integer[][] matrizB, Integer[][] tercera) {
		boolean abc;
		int a = tercera.length;
		if (matrizB.length == tercera.length) {
			abc = true;
			for (int i = 0; i < a; i++) {
				for (int j = 0; i < a; i++) {
					if (matrizB[i][j] != tercera[i][j]) {
						abc = false;
					}
				}
			}
		} else {
			abc = false;
		}
		return abc;

	};

	// Llleno Matriz con numeros random
	public static void llenarMatriz(Integer[][] matrizA, Integer[][] matrizB, int a, int b) {
		int random;
		Random r = new Random();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
//					random = (int) Math.floor((Math.random() * (20) ));
//					r.nextInt(20 - 10 + 1) + 10;
				random = r.nextInt(50 - 10 + 1) + 10;
				matrizA[i][j] = random;
			}
		}
		// Lleno con verdadero matriz 10x10
//		matrizA[4][1] = 36;
//		matrizA[4][2] = 5;
//		matrizA[4][3] = 67;
		matrizA[4][4] = 36;
		matrizA[4][5] = 5;
		matrizA[4][6] = 67;
		matrizA[5][4] = 89;
		matrizA[5][5] = 90;
		matrizA[5][6] = 75;
		matrizA[6][4] = 14;
		matrizA[6][5] = 22;
		matrizA[6][6] = 26;
//		matrizA[6][7] = 14;
//		matrizA[6][8] = 22;
//		matrizA[6][9] = 26;
		// lleno B
		matrizB[0][0] = 36;
		matrizB[0][1] = 5;
		matrizB[0][2] = 67;
		matrizB[1][0] = 89;
		matrizB[1][1] = 90;
		matrizB[1][2] = 75;
		matrizB[2][0] = 14;
		matrizB[2][1] = 22;
		matrizB[2][2] = 26;
	}

	// Muestro Matriz
	public static void mostrarMatriz(Integer[][] matriz, Integer[][] matrizB, int n, int b) {
		System.out.println("Normal A");
		for (int i = 0; i < n; i++) {
			System.out.print("{");

			for (int j = 0; j < n; j++) {
				if (j == 0) {
					System.out.print("" + matriz[i][j] + ",");
				} else if (j == n - 1) {
					System.out.print("" + matriz[i][j] + "");
				} else {
					System.out.print("" + matriz[i][j] + ",");
				}
			}
			System.out.println("},");

		}
		System.out.println("Normal B");
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b; j++) {

				System.out.print("[ " + matrizB[i][j] + " ]");
			}
			System.out.println();
		}
	}

}
