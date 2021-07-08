package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer11 {

	public static void ejer11(){
//		Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
//		frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
//		pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
//		“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
		Scanner sn = new Scanner(System.in);
		String frase, result, letra;
		System.out.println("Ingrese una frase");
		frase = sn.nextLine();
		letra = frase.substring(0, 1);
		letra = letra.toUpperCase();
		System.out.println(letra);
		// Evaluo
		result = (letra.equals("A")) ? "CORRECTO" : "INCORRECTO";
		System.out.println(result + " primera letra " + letra);

	}

}
