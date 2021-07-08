package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer12 {

	public static void ejer12(){
//		. Considera que estás desarrollando una web para una empresa que fabrica motores 
//		(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
//		Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
//		El programa debe mostrar lo siguiente:

//		o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una 
//		bomba de agua”. 
//		o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una 
//		bomba de gasolina”.
//		o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una 
//		bomba de hormigón”. 
//		o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una 
//		bomba de pasta alimenticia”.
//		o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No 
//		existe un valor válido para tipo de bomba”
		Scanner sn = new Scanner(System.in);
		Integer m = 0;
		boolean b = false;
		String resultPrin;

		do {
			System.out.println("Ingrese un valor entr  1 y 4");
			m = sn.nextInt();
			resultPrin = tipoDeMotor(m);
			System.out.println(resultPrin);
			b = (m >= 1 && m <= 4) ? false : true;
		} while (b);

	}

	public static String tipoDeMotor(Integer motor) {
		String result = null;
		switch (motor) {
		case 1:
			result = "La bomba es una bomba de AGUA";
			break;
		case 2:
			result = "La bomba es una bomba de GASOLINA";
			break;
		case 3:
			result = "La bomba es una bomba de HORMIGÓN";
			break;
		case 4:
			result = "La bomba es una bomba de ALIMENTICIA";
			break;

		default:
			result = "No se encontro una bomba ingrese numero del 1 al 4";
			break;
		}
		return result;
	}

}
