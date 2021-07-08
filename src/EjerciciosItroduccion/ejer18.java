package EjerciciosItroduccion;

public class ejer18 {
	public static void ejer18() {
//		Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
//		del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
//		por una E. Ejemplo:
//		0-0-0
//		0-0-1
//		0-0-2
//		0-0-E
//		0-0-4
//		.
//		.
//		0-1-2
//		0-1-E
//		Nota: investigar función equals() y como convertir números a String.
		String a, b, c;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					a = (i == 3) ? "(E)" : "" + i;
					b = (j == 3) ? "(E)" : "" + j;
					c = (k == 3) ? "(E)" : "" + k;
					System.out.println("Resultado de la muestra con E [" + a + "-" + b + "-" + c + "]");
				}
			}
		}

	}
}
