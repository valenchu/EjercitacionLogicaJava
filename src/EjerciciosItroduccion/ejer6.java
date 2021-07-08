package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer6 {

	public static void ejer6() {
//		Escribir un programa que lea un número entero por teclado y muestre por pantalla 
//		el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
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
