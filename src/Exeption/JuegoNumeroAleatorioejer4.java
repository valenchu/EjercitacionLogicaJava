package Exeption;

import java.util.Random;
import java.util.Scanner;

public class JuegoNumeroAleatorioejer4 {
//	Escribir un programa en Java que juegue con el usuario a adivinar un n�mero. La 
//	computadora debe generar un n�mero aleatorio entre 1 y 500, y el usuario tiene 
//	que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la 
//	computadora debe decirle al usuario si el n�mero que tiene que adivinar es mayor 
//	o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe 
//	indic�rselo e imprimir en pantalla el n�mero de veces que el usuario ha intentado 
//	adivinar el n�mero. Si el usuario introduce algo que no es un n�mero, se debe 
//	controlar esa excepci�n e indicarlo por pantalla. En este �ltimo caso tambi�n se 
//	debe contar el car�cter fallido como un intento.
	public static void numAleatorio() {
		int aleatorio = numRandom(500, 1);
		int num, contador = 0;
		boolean verificar = false;
		Scanner sn = new Scanner(System.in);
		do {
			try {
				contador++;
				System.out.println("Intente adivinar el numero que se genero aleatoriamente");
				num = sn.nextInt();
				if (num > 0) {
					if (aleatorio > num) {
						System.out.println("El numero a adivinar es mayor que el que ingreso");
					} else if (aleatorio < num) {
						System.out.println("El numero a adivinar es menor que el que ingreso");
					} else {
						System.out.println("CORRECTO EL NUMERO A ADIVINAR ERA " + aleatorio + "\nUSTED LO LOGRO EN "
								+ contador + " INTENTOS!!!");
						verificar = true;
					}
				} else {
					System.out.println("Esta ingresando un numero negativo");
				}
			} catch (Exception e) {
				System.out.println("ERROR EN DATOS INGRESADOS INTENTELO DE NUEVO " + e);
				sn.nextLine();
			}
		} while (verificar == false);
		System.out.println("!!FIN DEL JUEGO��");

	}

	// Method that generate aleatori number
	public static int numRandom(int max, int min) {
		int result;
		Random rand = new Random();
		result = rand.nextInt(max + min) + min;
		return result;
	}

}
