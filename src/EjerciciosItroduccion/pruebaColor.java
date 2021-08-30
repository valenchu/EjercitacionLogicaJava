package EjerciciosItroduccion;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class pruebaColor {
	static double[] arf = new double[] {1,2,3,4,5,6,7};
	public static double[] clasedo() {
		return arf;
	}

	public static void llamarColor() {
		
		System.out.println(Arrays.toString(clasedo()));
		double a = 1.2;
		String letra = "E";
		System.out.println("letra antes del valueOf " + letra);
		letra = String.valueOf(a);
		System.out.println("letra desp del valueOF " + letra);
		Scanner leer = new Scanner(System.in).useDelimiter("\n");
		// genera un rango de números
		IntStream stream = IntStream.range(0, 81);
		// el método range devuelve un objeto de tipo IntStream, por lo que se debe
		// convertir a Array.
		int[] arr = stream.toArray();
		// Se imprime sin hacer uso de for mediante la claseArray y su método toString()
		System.out.print(Arrays.toString(arr));

		int random;
		Random r = new Random();
		int i = 0;
		int j = 0;
		int[][] matriz = new int[4][4]; // definimos la matriz y el tamaño de la matriz

		for (i = 0; i < 4; i++) {// rellenamos
			for (j = 0; j < 4; j++) {
				matriz[i][j] = (int) (Math.random() * 16);

			}
		}
		

	}

}
