package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer10 {

	public static void ejer10(){
//		. Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
//		largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
//		un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
//		imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java
		Scanner sn = new Scanner(System.in);
		String frase, result;
		Integer tam;
		System.out.println("Ingrese una frase para comprobar");
		frase = sn.nextLine();
		tam = frase.length();
		result = (tam == 8) ? "CORRECTO" : "INCORRECTO";
		System.out.println(result);

	}

}
