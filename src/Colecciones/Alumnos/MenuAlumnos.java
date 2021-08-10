package Colecciones.Alumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAlumnos {

	public static void ejecutarMenuAlumnos() {
//		
//		Crear una clase llamada Alumno que mantenga información sobre las notas de
//		distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
//		de tipo Integer con sus 3 notas.
//		En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
//		información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//		pregunta al usuario si quiere crear otro Alumno o no. 
//		Despues de ese bluce tendremos el siguiente método en la clase Alumno: 
//		Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
//		su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
//		método. Dentro del método se usará la lista notas para calcular el promedio final
//		de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
//		main.
		Scanner sn = new Scanner(System.in);
		Alumnos alum;
		ArrayList<Alumnos> listaDeAlumnos = new ArrayList<Alumnos>();
		int dato;
		do {
			System.out.println("Ingrese nombre del alumno");
			String nom = sn.nextLine();
			alum = new Alumnos();
			alum.setNombreAlumno(nom);
			int nota;
			for (int i = 0; i < 3; i++) {
				System.out.println("Ingrese la nota numero " + i + " del alumno " + nom);
				nota = sn.nextInt();
				alum.setNota(nota);
			}
			listaDeAlumnos.add(alum);
			System.out.println("¿Desea crear otro alumno?");
			System.out.println("Ingrese 1 para si 0 para no");
			dato = sn.nextInt();
			sn.nextLine();
		} while (dato != 0);
		listaDeAlumnos.forEach((p) -> p.imprimir());
		
		System.out.println("Ingrese nombre del alumno que desea saber su nota final");
		String nom = sn.nextLine();
		boolean ver = false;
		int notaFinal = 0;
		for (int i = 0; i < listaDeAlumnos.size(); i++) {
			if(listaDeAlumnos.get(i).getNombreAlumno().equalsIgnoreCase(nom)) {
				notaFinal = listaDeAlumnos.get(i).notaFinal();
				ver = true;
				i = listaDeAlumnos.size();
			}
		}
		if(ver == false) {
			System.out.println("No se encontro el nombre a buscar");
		}else {
			System.out.println("El promedio de la nota final de "+ nom.toUpperCase()+" es "+notaFinal);
		}
	}

}
