package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer14 {
	
	public static void ejer14(){
//		Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n 
//		solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere 
//		el l�mite inicial.
		
		Integer valorLimite=0,numero=0,suma=0;
		Scanner sn = new Scanner(System.in);
		System.out.println("Ingrese valor limite positivo");
		valorLimite = sn.nextInt();
		do {
			System.out.println("Ingrese un numero a sumar");
			numero = sn.nextInt();
			suma = suma+numero;
		}while(suma < valorLimite);
		System.out.println("La suma de los valores ingresado supero el valor limite "+suma);
	}

}
