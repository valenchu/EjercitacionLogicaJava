package Colecciones.Cine;

import java.util.ArrayList;
import java.util.Comparator;

public class ServicioPelicula {

	public void mostrarPelisCompletas(ArrayList<Pelicula> peli) {// Muestro todas las peliculas
		for (int i = 0; i < peli.size(); i++) {// Recorro datos de todas las pelis
			System.out.println("DATOS PELICULA " + i);
			System.out.println("Titulo: " + peli.get(i).getTitulo());// Obtengo titulo
			System.out.println("Director " + peli.get(i).getDirector());// Obtengo direccion
			System.out.println("Duracion " + peli.get(i).getDuracionMin() + " h");// Obtengo duracion peli
		}
	}

	public void mostrarHorasMayorAUno(ArrayList<Pelicula> peli) {// Verifica la duracion peli mayor 1 hora}
		for (int i = 0; i < peli.size(); i++) {
			if (peli.get(i).getDuracionMin() > 1) {// Verifico que la duracion de la peli sea mayor a 1 hora
				System.out.println("DATOS PELICULA CON DURACION MAYOR 1 HS");
				System.out.println("Titulo: " + peli.get(i).getTitulo());// Obtengo titulo
				System.out.println("Director " + peli.get(i).getDirector());// Obtengo Direccion
				System.out.println("Duracion " + peli.get(i).getDuracionMin() + " h");// Obtengo duracion peli
			}
		}
	}

	public static Comparator<Pelicula> peliMenorToMayor = new Comparator<Pelicula>() {// Metodo que compara los dos
																						// objetos

		@Override
		public int compare(Pelicula o1, Pelicula o2) {// comparo los dos objetos
			Integer hora1 = o1.getDuracionMin();// Los paso a string para compararlos
			Integer hora2 = o2.getDuracionMin();
			return hora1.compareTo(hora2);// Si hora1 mayor que hora dos retorna 1
		}
	};

	public static Comparator<Pelicula> peliMayorToMenor = new Comparator<Pelicula>() {// Metodo que ordena

		@Override
		public int compare(Pelicula o1, Pelicula o2) {// comparo los dos objetos
			Integer hora1 = o1.getDuracionMin();// Los paso a string para compararlos
			Integer hora2 = o2.getDuracionMin();
			return hora2.compareTo(hora1);// Si hora2 mayor que hora dos retorna 1
		}
	};

	public static Comparator<Pelicula> alfabeticamenteTitulo = new Comparator<Pelicula>() {// Metodo que compara los dos
																							// objetos

		@Override
		public int compare(Pelicula o1, Pelicula o2) {// comparo los dos objetos
			String dato1 = o1.getTitulo();
			String dato2 = o2.getTitulo();
			return dato1.compareTo(dato2);// Ordeno alfabeticamente el titulo
		}
	};

	public static Comparator<Pelicula> alfabeticamenteDirector = new Comparator<Pelicula>() {// Metodo que compara los
																								// dos
		// objetos

		@Override
		public int compare(Pelicula o1, Pelicula o2) {// comparo los dos objetos
			String dato1 = o1.getDirector();
			String dato2 = o2.getDirector();
			return dato1.compareTo(dato2);// Ordeno alfabeticamente el director
		}
	};
}
