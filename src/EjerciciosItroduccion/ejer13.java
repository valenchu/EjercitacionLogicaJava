package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer13 {
	public static void ejer13() {
//		Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
//		la nota se pedirá de nuevo hasta que la nota sea correcta.
		Integer nota;
		boolean result;
		Scanner sn = new Scanner(System.in);
		do {
		System.out.println("Ingrese la nota");
		nota = sn.nextInt();
		result = (nota > 0 && nota < 11)? true : false;
		System.out.println((result == false) ? "La nota no esta entre 0 y 10":"");
		}while(result == false );
		System.out.println("La nota se encuentra entre 0 y 10");
	}

}
