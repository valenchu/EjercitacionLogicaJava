package Colecciones.PerrorsRazas;

import java.util.Comparator;

public class Perro {
	// Atributos
	private String raza, nombre;

	// Constructor
	public Perro(String raza, String nombre) {
		this.raza = raza;
		this.nombre = nombre;
	}

	public Perro() {
	}

	// Get And Set

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {// Metodo que imprime por pantalla
		return nombre + " es de raza: " + raza;
	}

	public static Comparator<Perro> compareName = new Comparator<Perro>() {// Metodo para comparar nombres
		@Override
		public int compare(Perro p1, Perro p2) {// Paso por parametros 2 objetos
			return p1.getNombre().compareToIgnoreCase(p2.getNombre());// Comparo los nombre iguales retorna 0
																		// p1 mayor que p2 retorna 1 p2 mayor que p1
																		// retorna -1

		}
	};

}
