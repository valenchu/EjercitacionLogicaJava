package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer6 {

	public static void ejer6() {
//		Escribir un programa que lea un n�mero entero por teclado y muestre por pantalla 
//		el doble, el triple y la ra�z cuadrada de ese n�mero. Nota: investigar la funci�n 
//		Math.sqrt().
		Scanner sn = new Scanner(System.in);
		Double num,numDoble,numTriple,numCuadrada;
		System.out.println("Ingrese un numero para sacar, su doble, su triple y su raiz cuadrada");
		num = sn.nextDouble();
		numDoble = Math.pow(num, 2);
		numTriple = Math.pow(num, 3);
		numCuadrada = Math.sqrt(num);
		System.out.println("El numero en doble = "+numDoble);
		System.out.println("El numero en triple = "+numTriple);
		System.out.println("El numero al cuadrado = "+numCuadrada);
	}

}
