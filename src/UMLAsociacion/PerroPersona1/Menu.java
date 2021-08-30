package UMLAsociacion.PerroPersona1;

import java.util.Scanner;

public class Menu {
//	Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
//	dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
//	Persona con atributos: nombre, apellido, edad, documento y Perro.
//	Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
//	que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
//	mostrar desde la clase Persona, la información del Perro y de la Persona

	public static void menuAccion() {
		Scanner sn = new Scanner(System.in);
		// Creo los objetos de perro
		Perro perro1 = new Perro("Chilo", "Pitbull", 1, "Mediano");
		Perro perro2 = new Perro("Mono", "Chiguagua", 1, "Pequeño");
		Perro perroDecisivo;
		// Creo instancia personas
		Persona per1 = null;
		Persona per2 = null;
		// lleno la intancia persona
		System.out.println("----LLENADO DE FORM PARA ADQUIRIR UN PERRO----");
		for (int i = 0; i < 2; i++) {
			System.out.println("Ingrese nombre de la persona " + (i + 1));
			String nombre = sn.next();
			System.out.println("Ingrese apellido de la persona" + (i + 1));
			String apellido = sn.next();
			System.out.println("Ingrese edad de la persona" + (i + 1));
			Integer edad = sn.nextInt();
			System.out.println("Ingrese documento de la persona" + (i + 1));
			Integer documento = sn.nextInt();
			System.out.println("¿Que perro desea adquirir?");
			System.out.println("Numero 1 = " + perro1.toString());
			System.out.println("Numero 2 = " + perro2.toString());
			Integer numero = sn.nextInt();
			if (numero == 1) {// Si el numero elegido es 1 guardo perro 1 si no el 2
				perroDecisivo = perro1;
			} else {
				perroDecisivo = perro2;
			}
			if (i == 0) {// Cargo todos los datos dentro de persona dependiendo cual sea
				per1 = new Persona(nombre, apellido, edad, documento, perroDecisivo);
			} else {
				per2 = new Persona(nombre, apellido, edad, documento, perroDecisivo);
			}
		}
		// Muestro los datos por pantalla de la persona
		System.out.println(per1.toString());
		System.out.println(per2.toString());

	}

}
