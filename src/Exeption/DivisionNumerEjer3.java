package Exeption;

import java.util.Scanner;

public class DivisionNumerEjer3 {
//	 Defina una clase llamada DivisionNumero. En el m�todo main utilice un Scanner 
//	 para leer dos n�meros en forma de cadena. A continuaci�n, utilice el m�todo 
//	 parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en 
//	 dos variables de tipo int. Por ultimo realizar una divisi�n con los dos numeros y 
//	 mostrar el resultado. 
//	 Todas estas operaciones puede tirar excepciones a manejar, el ingreso por 
//	 teclado puede causar una excepci�n de tipo InputMismatchException, el m�todo 
//	 Integer.parseInt() si la cadena no puede convertirse a entero, arroja una 
//	 NumberFormatException y adem�s, al dividir un n�mero por cero surge una 
//	 ArithmeticException. Manipule todas las posibles excepciones utilizando bloques 
//	 try/catch para las distintas excepciones
	public static void divisionNum() {
		String a, b;
		Integer c, d;
		Double result;
		Scanner sn = new Scanner(System.in);
		try {
			System.out.println("Ingrese numero A");
			a = sn.nextLine();
			System.out.println("Ingrese numero B");
			b = sn.nextLine();
			c = Integer.parseInt(a);
			d = Integer.parseInt(b);
			if (c > d) {
				result = (double) (c / d);
			} else {
				result = (double) (d / c);
			}

			System.out.println("El resultado es = " + result);
		} catch (Exception e) {// Si usamos exeption general engloba todas las exeption solicitadas en el
								// ejercicio
			System.out.println("MUESTRO LA EXEPCION POR PANTALLA \n" + e);
		}
	}

}
