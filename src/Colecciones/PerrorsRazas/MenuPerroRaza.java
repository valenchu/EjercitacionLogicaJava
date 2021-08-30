package Colecciones.PerrorsRazas;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPerroRaza {

	public static void ejecutarRazaPerro() {
//		Dise�ar un programa que lea y guarde razas de perros en un ArrayList de tipo
//		String. El programa pedir� una raza de perro en un bucle, el mismo se guardar�
//		en la lista y despu�s se le preguntar� al usuario si quiere guardar otro perro o si
//		quiere salir. Si decide salir, se mostrar� todos los perros guardados en el ArrayList.
//		Continuando el ejercicio anterior, despu�s de mostrar los perros, al usuario se le
//		pedir� un perro y se recorrer� la lista con un Iterator, se buscar� el perro en la lista. 
//		Si el perro est� en la lista, se eliminar� el perro que ingres� el usuario y se mostrar�
//		la lista ordenada. Si el perro no se encuentra en la lista, se le informar� al usuario
//		y se mostrar� la lista ordenada.

		int decision = -1;
		Perro perrito;
		Scanner sn = new Scanner(System.in);

		ArrayList<Perro> p = new ArrayList<Perro>();
		do {
			System.out.println("----------||||----------");
			System.out.println("Ingrese nombre del perro a guardar");// Solicito nombre del perrito

			String raz = sn.nextLine();
			perrito = new Perro();
			perrito.setNombre(raz);// guardo nombre del perrito
			System.out.println("Ingrese raza de " + raz + " a guardar");// solicito raza perrito
			raz = sn.nextLine();
			perrito.setRaza(raz);// Paso el string a perro raza
			p.add(perrito);
			System.out.println("�Desea guardar otra raza de otro perro?");// Pregunto si quiere salir
			System.out.println("1- Si, 0-Salir");
			decision = sn.nextInt();// guardo decision
			sn.nextLine();
		} while (decision != 0);// Mientras sea distinto de cero repite bucle
		p.forEach(System.out::println);// Muestro los datos por pantalla
		System.out.println("Ingrese perro a buscar en la lista para eliminar si existe");
		String nombre = sn.nextLine();
		boolean ver = false;
		for (int i = 0; i < p.size(); i++) {// Elimino el nombre si existe
			if (p.get(i).getNombre().equalsIgnoreCase(nombre)) {
				p.remove(i);
				System.out.println(nombre + " REMOVIDO");
				i = p.size();
				ver = true;
			}
		}
		if (ver != true) {
			System.out.println("No se encontro " + nombre + " en la lista de Perros para eliminar");
		}
		p.sort(perrito.compareName);// Ordeno la lista por los nombres de los perros
		p.forEach(System.out::println);// Muestro la lista

	}

}
