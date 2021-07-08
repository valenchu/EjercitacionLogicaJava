package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer15 {
	public static void ejer15() {
//		. Realizar un programa que pida dos números enteros positivos por teclado y 
//		muestre por pantalla el siguiente menú:
//		MENU
//		1. Sumar
//		2. Restar
//		3. Multiplicar
//		4. Dividir
//		5. Salir
//		Elija opción:
//		El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
//		pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
//		opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
//		del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
//		¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
//		carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
		Integer valUno = 0, valDo = 0, valorMenu;
		boolean ver = false;
		String ca;
		Scanner sn = new Scanner(System.in);
		// Ingreso valores 1 y 2
		System.out.println("Ingrese valor Uno = ");
		valUno = sn.nextInt();
		System.out.println("Ingrese valor Dos = ");
		valDo = sn.nextInt();
		do {
			System.out.println("		MENU");
			System.out.println("		1. Sumar\n" + "		2. Restar\n" + "		3. Multiplicar\n"
					+ "		4. Dividir\n" + "		5. Salir");
			System.out.println("Seleccione un valor del menu");
			valorMenu = sn.nextInt();
			if (valorMenu == 1) {
				System.out.println("El resultado de " + valUno + " + " + valDo + " es = " + suma(valUno, valDo));
				ver = true;
				System.out.println("Saliendo!!!");
			} else if (valorMenu == 2) {
				System.out.println("El resultado de " + valUno + " - " + valDo + " es = " + resta(valUno, valDo));
				ver = true;
				System.out.println("Saliendo!!!");
			} else if (valorMenu == 3) {
				System.out.println("El resultado de " + valUno + " * " + valDo + " es = " + multi(valUno, valDo));
				ver = true;
				System.out.println("Saliendo!!!");
			} else if (valorMenu == 4) {
				System.out.println("El resultado de " + valUno + " / " + valDo + " es = " + divi(valUno, valDo));
				ver = true;
				System.out.println("Saliendo!!!");
			} else if (valorMenu == 5) {
				System.out.println("¿Está seguro que desea salir del programa (S/N)?");
				sn.nextLine();
				ca = sn.nextLine();
				ca = ca.toUpperCase();
				ver = (ca.equals("S")) ? true : false;
				System.out.println((ver == true) ? "Saliendo!!!" : "Retornando al MENU");
			} else {
				System.out.println("No ingreso un valor entre 1 y 5 INTENTELO DE NUEVO");
				System.out.println("Retornando al MENU");
			}
		} while (ver != true);
	}

	// Calculo la suma
	public static int suma(int valUno, int valDo) {
		int result;
		result = (valUno + valDo);
		return result;
	}

	// Calculo la resta
	public static int resta(int valUno, int valDo) {
		int result;
		result = (valUno - valDo);
		return result;
	}

	// Calculo la multiplicacion
	public static int multi(int valUno, int valDo) {
		int result;
		result = (valUno * valDo);
		return result;
	}

	// Calculo la division
	public static int divi(int valUno, int valDo) {
		int result;
		if (valUno > valDo) {
			result = (valUno / valDo);
		} else {
			result = (valDo / valUno);
		}
		return result;
	}
}
