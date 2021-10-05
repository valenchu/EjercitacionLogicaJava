package Exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SentenciasEjer5Y6Y8 {
//	Dado el método metodoA de la clase A, indique:
//	A) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
//		MioException?
//		 

//		
//	B) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción 
//		MioException?

	// Para la resp A se ejecuta la sentencia a1,a2 y si el error esta en a3 se a5 y
	// finalmente a6
	// si el error esta en a4 tonces se ejecuta a5 y finalmente a6.
	// veamos con errores escriba letras en ves de num!!
	// escriba letras en las variables que quiera el error para comprobar mi logica
	// de arriba
	// Para el caso de B si se inserta todo bien las sentencias se ejecutan todas
	// menos la
	// sentencia a5 que es la que esta dentro del catch ya que esta solo se activa
	// si ocurre un error
	static void metodoA() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Sentenncia a1");
		System.out.println("Sentenncia a2");
		int we, ce;
		try {
			we = sn.nextInt();
			System.out.println("Sentenncia a3 " + we);
			ce = sn.nextInt();
			System.out.println("Sentenncia a4");
		} catch (Exception e) {
			System.out.println("Sentenncia a5 " + e);
		}
		System.out.println("Sentenncia a6");
	}

//	Dado el método metodoB de la clase B, indique:
//		a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
//		MioException?
	// -Se ejecuta la b1,b2 si en la b2 esta el error salta a la b3 y muestra b4 al
	// final
//		b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción 
//		MioException?
	// - Se ejecutan todas en orden a exepcion de b3 que esta se ejecuta solo si hay
	// error
	static void metodoB() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Sentenncia b1");
		int we, ce;
		try {
			we = sn.nextInt();
			System.out.println("Sentenncia b2 " + we);

		} catch (Exception e) {
			System.out.println("Sentenncia b3 " + e);
		} finally {
			System.out.println("Sentenncia b4");
		}
	}

//	. Dado el método metodoC de la clase C, indique:
//		a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
//		MioException?
	// Se ejecutan la sentancia c1,c2 si el error es en c2 es c2 y salta a c4
	// finallmente c6
	// Se ejecutan la sentancia c1,c2,c3 si el error es en c3 es c3 y salta a c4
	// finallmente c6
//		b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción 
//		MioException?
	// Se ejecutan las sentencias c1, c2 , c3 y finallmente c6 pero los catch nunca
	// se muestran
//		c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
	// Se ejecuta c1, c2 si el error es c2 se ejecuta catch y sentencia c5 ,
	// finalmente c6
	// Se ejecuta c1, c2, c3 si el error es en c3 se ejecuta catch y sentencia c5,
	// finalmente c6
	static void metodoC() throws InputMismatchException {
		System.out.println("sentencia_c1");
		Scanner sn = new Scanner(System.in);
		int we, ce;
		try {
			we = sn.nextInt();
			System.out.println("sentencia_c2");
			System.out.println("sentencia_c3");
		} catch (NullPointerException e) {
			System.out.println("sentencia_c4");
		} catch (InputMismatchException e) {
			System.out.println("sentencia_c5");
			throw (e);
		} finally {
			System.out.println("sentencia_c6");
		}

	}
}
