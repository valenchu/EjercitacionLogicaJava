package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer3 {

	public static void ejer3(){
//		. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
//		por pantalla.
		
		String nom ;
		Scanner sn = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		nom = sn.nextLine();
		System.out.println("Su nombre es = "+nom);

	}

}
