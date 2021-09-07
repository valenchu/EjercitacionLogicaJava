package Exeption;

public class ExepcionIdexejer2 {
//	Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
//	código para generar y capturar una excepción ArrayIndexOutOfBoundsException
//	(índice de arreglo fuera de rango).

	public static void exepcionIdex() {
		String[] ar = new String[10];
		try {
			for (int i = 0; i < ar.length + 2; i++) {
				ar[i] = "S" + i;

			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("COMO VEMOS SE GENERA UN ERROR DE INDEX FUERA DE RANGO\n" + e);

		}

	}
}
