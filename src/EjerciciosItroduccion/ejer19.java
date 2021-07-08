package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer19 {
	public static void ejer19() {
//		Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
//		si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//		* * * * 
//		*     *
//		*     *
//		* * * *
		String n = "*";
		Integer nEle;
		Scanner sn = new Scanner(System.in);
		System.out.println("Ingrese cantidad de elementos para el cuadrado");
		nEle = sn.nextInt();
		// Fila superior
		for (int i = 0; i < nEle; i++) {
			System.out.print("*");
		}
		System.out.println();

		// Centro del cuadrado
		for (int i = 0; i < nEle - 2; i++) {
			System.out.print("*");

			for (int j = 0; j < nEle - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		// Fila inferior
		for (int i = 0; i < nEle; i++) {
			System.out.print("*");
		}

	}

}
