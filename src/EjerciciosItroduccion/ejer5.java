package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer5 {

	public static void ejer5(){
//		Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
//		grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
		Scanner sn = new Scanner(System.in);
		Integer grados;
		System.out.println("Ingrese cuantos grados hacen para pasarlo a Fahrenheit");
		grados = sn.nextInt();
		System.out.println("Usted ingreso = " + grados + " CONVIRTIENDO A FAHRENHEIT");
		grados = 32 + (9 * grados / 5);
		System.out.println("Los grados fueron transformados a " + grados + " Fahrenheit");

	}

}
