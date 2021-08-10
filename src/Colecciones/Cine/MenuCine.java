package Colecciones.Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuCine {

	public static void ejecutarMenuCine() {
//		Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
//		Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
//		película (en horas). Implemente las clases y métodos necesarios para esta
//		situación, teniendo en cuenta lo que se pide a continuación:
//		18
//		En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
//		usuario todos sus datos y guardándolos en el objeto Pelicula.
//		Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
//		si quiere crear otra Pelicula o no.
//		Después de ese bucle realizaremos las siguientes acciones:
//		• Mostrar en pantalla todas las películas.
//		• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//		• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
//		en pantalla.
//		• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
//		en pantalla.
//		• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
//		• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
		int ver;
		ServicioPelicula utilidadPeli = new ServicioPelicula();
		Scanner sn = new Scanner(System.in);
		Pelicula peli;
		ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>();
		do {
//			System.out.println("Ingrese el titulo de la pelicula");
//			peli = new Pelicula();
//			peli.setTitulo(sn.nextLine());
//			System.out.println("Ingrese director de la pelicula");
//			peli.setDirector(sn.nextLine());
//			System.out.println("Ingrese la hora de la pelicula en horas");
//			peli.setDuracionMin(sn.nextInt());
			peli = new Pelicula("La LLamada", "Morgan Freeman", 3);
			listaPelicula.add(peli);
			peli = new Pelicula("Un lugar en silencio", "Trues Mirion", 2);
			listaPelicula.add(peli);
			peli = new Pelicula("Lechuguita 777", "Nuria Paez", 1);
			listaPelicula.add(peli);
			// Agrego el objeto pelicula a la lista!!
			System.out.println("¿Desea insertar otra pelicula?");
			System.out.println("1- Otra peli, 0- Salir");
			ver = sn.nextInt();
			sn.nextLine();

		} while (ver != 0);
		System.out.println("---------------------||||---------------------");
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
		System.out.println("---------------------||||---------------------");
		utilidadPeli.mostrarHorasMayorAUno(listaPelicula);
		System.out.println("---------------------||||---------------------");
		System.out.println("ORDENO DE MENOR A MAYOR DURACION");
		listaPelicula.sort(ServicioPelicula.peliMenorToMayor);
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
		System.out.println("---------------------||||---------------------");
		System.out.println("ORDENO DE MAYOR A MENOR DURACION");
		listaPelicula.sort(ServicioPelicula.peliMayorToMenor);
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
		System.out.println("---------------------||||---------------------");
		System.out.println("ORDENO ALFABETICAMENTE TITULO");
		listaPelicula.sort(ServicioPelicula.alfabeticamenteTitulo);
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
		System.out.println("---------------------||||---------------------");
		System.out.println("ORDENO ALFABETICAMENTE DIRECTOR");
		listaPelicula.sort(ServicioPelicula.alfabeticamenteDirector);
		utilidadPeli.mostrarPelisCompletas(listaPelicula);
	}

}
