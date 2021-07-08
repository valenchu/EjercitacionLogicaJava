package EjerciciosItroduccion;

import java.util.Scanner;

public class ejer17 {
	public static void ejer17() {
//		Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
//		tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
//		con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
//		carácter tiene que ser X y el último tiene que ser una O. 
//		Las secuencias leídas que respeten el formato se consideran correctas, la 
//		secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
//		secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
//		Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
//		correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
//		se utilizan las siguientes funciones de Java Substring(), Length(), equals().
		String cadena = "", cadenaDo = "&&&&&".toUpperCase();
		Integer tamCadena = 0, sumaCorrecta = 0, sumaIncorrecta = 0;
		boolean log = false, logDo = false;
		Scanner sn = new Scanner(System.in);
		do {
			System.out.println("Ingrese la cadena");
			cadena = sn.nextLine();
			cadena = cadena.toUpperCase();
			tamCadena = cadena.length();
			// Verifico tamaño de la cadena
			log = (tamCadena < 5 || tamCadena > 5) ? false : true;
			if (!cadena.equals(cadenaDo)) {
				// Si es verdadero compruebo si el formato es correcto y sumo 1 correcta si no
				// sumo incorrecta
				if (log == true) {
					logDo = verCadena(cadena);
					if (logDo == true) {
						sumaCorrecta++;
					} else {
						sumaIncorrecta++;
					}
				} else {
					System.out.println("Tamaño cadena incorrecto debe ser 5 caracteres");
				}
			} else {
				System.out.println("Saliendo para mostrar resultados: ");
			}
		} while (!cadena.equals(cadenaDo));
		System.out.println("Suma de correctas = " + sumaCorrecta + " Suma de incorrectas = " + sumaIncorrecta);
	}

//Verifico que la cadena contenga X al princiopio y O al final
	public static boolean verCadena(String cad) {
		boolean verificacion = false, verificacionun = false, verificaciondo = false;
		String d;
		int lon = cad.length();
		d = cad.substring(0, 1);
		verificacionun = (d.equals("X")) ? true : false;
		d = cad.substring(lon - 1, lon);
		verificaciondo = (d.equals("O")) ? true : false;
		verificacion = (verificacionun == true && verificaciondo == true) ? true : false;
		return verificacion;
	}

}
