package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer8 {

	public static void ejer8(){
		// Crear un programa que dado un numero determine si es par o impar.
		Scanner sn = new Scanner(System.in);
		Integer num;
		String resp;
		System.out.println("Ingrese un numero entero");
		num = sn.nextInt();
		num = num % 2;
		resp = (num == 0) ? "Es Par" : "Es Impar";
		System.out.println(resp);
	}

}
