package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer21 {
	public static void ejer21() {
//		. Crea una aplicación que a través de una función nos convierta una cantidad de 
//		euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
//		libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
//		converir que será una cadena, este no devolverá ningún valor y mostrará un 
//		mensaje indicando el cambio (void).
//		El cambio de divisas es: 
//		* 0.86 libras es un 1 €
//		* 1.28611 $ es un 1 €
//		* 129.852 yenes es un 1 €
		double euros = 0;
		int mon;
		String moneda = "";
		Scanner sn = new Scanner(System.in);
		do {
			System.out.println("  INGRESE\n ->1 para transformar EUROS a DOLARES \n"
					+ " ->2 para transformar EUROS a YENES\n" + " ->3 para transformar EUROS a LIBRAS");
			mon = sn.nextInt();
			switch (mon) {
			case 1:
				moneda = "dolares";
				do {
					try {
						System.out.println("Ingrese la cantidad de EUROS a pasar a DOLARES");
						euros = sn.nextDouble();
					} catch (Exception e) {
						System.out.println("Ingreso numero ERRONEO");
						euros = -1;
						sn.next();
					}
					;
				} while (euros < 0);
				break;
			case 2:
				moneda = "yenes";
				do {
					try {
						System.out.println("Ingrese la cantidad de EUROS a pasar a YENES");
						euros = sn.nextDouble();
					} catch (Exception e) {
						System.out.println("Ingreso numero ERRONEO");
						euros = -1;
						sn.next();
					}
					;
				} while (euros < 0);
				break;
			case 3:
				moneda = "libras";
				do {
					try {
						System.out.println("Ingrese la cantidad de EUROS a pasar a LIBRAS");
						euros = sn.nextDouble();
					} catch (Exception e) {
						System.out.println("Ingreso numero ERRONEO");
						euros = -1;
						sn.next();
					}
					;
				} while (euros < 0);
				break;
			default:
				System.out.println("Ingreso un numero incorrecto, se repetira el proceso");
				System.out.println("---------------------------------------------------");
				break;
			}
		} while (moneda != "yenes" && moneda != "dolares" && moneda != "libras");
		convertirEuros(moneda, euros);
	}

	public static void convertirEuros(String m, double eur) {
		double dolar = 1.28611, yen = 129.852, lib = 0.86, result;

		switch (m) {
		case "dolares":
			result = dolar * eur;
			System.out.println(eur + " EUROS a DOLARES es = " + result + " DOLARES");
			break;
		case "yenes":
			result = yen * eur;
			System.out.println(eur + " EUROS a YENES es = " + result + " YENES");
			break;
		case "libras":
			result = lib * eur;
			System.out.println(eur + " EUROS a LIBRAS es = " + result + " LIBRAS");
			break;
		default:
			System.out.println("No se encontro moneda de cambio");
			break;
		}
	}
}
