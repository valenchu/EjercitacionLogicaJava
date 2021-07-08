package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer16 {
	public static void ejer16() {
//	Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
//	salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
//	deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
//	número es negativo no debe sumarse. Nota: recordar el uso de la sentencia 

		Integer num = 0, suma = 0;
		boolean ver = false;
		Scanner sn = new Scanner(System.in);
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese un numero");
			num = sn.nextInt();
			ver = (num == 0) ? true : false;
			if (ver == true) {
				break;
			}
			suma = sumar(num, suma);
		}
		System.out.println("La suma de todos los numeros es = " + suma);
	}

//Sumo de todo los numero
	public static int sumar(int num, int sum) {
		if (num > 0) {
			sum = sum + num;
		} else {
			sum = sum;
		}
		return sum;
	}
}
