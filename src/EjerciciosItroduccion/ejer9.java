package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer9 {

	public static void ejer9(){
//		Crear un programa que pida una frase y si esa frase es igual a �eureka� el programa 
//		pondr� un mensaje de Correcto, sino mostrar� un mensaje de Incorrecto. Nota: 
//		investigar la funci�n equals() en Java
		Scanner sn = new Scanner(System.in);
		String frase, result;
		System.out.println("Ingrese una frase");
		frase = sn.nextLine();
		result = (frase.equals("eureka")) ? "CORRECTO" : "INCORRECTO";
		System.out.println(result);
	}

}
