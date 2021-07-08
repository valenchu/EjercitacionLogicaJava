package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer4 {

	public static void ejer4(){
//		Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
//		después toda en minúsculas. Nota: investigar la función toUpperCase() y 
//		toLowerCase() en Java
		Scanner sn = new Scanner(System.in);
		String nom;

		System.out.println("Ingrese una frase");
		nom = sn.nextLine();
		System.out.println("Original Frase = " + nom);
		nom = nom.toUpperCase();
		System.out.println("Te muestro la frase en MAYUSCULAS = " + nom);
		nom = nom.toLowerCase();
		System.out.println("Te muestro la frase en MINUSCULAS = " + nom);

	}

}
