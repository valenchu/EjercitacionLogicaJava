package Colecciones.Cine;

public class Pelicula {
	// Articulo
	private String titulo;
	private String director;
	private int duracionMin;

	// Constructor lleno vacio
	public Pelicula(String titulo, String director, int duracionMin) {
		this.titulo = titulo;
		this.director = director;
		this.duracionMin = duracionMin;
	}

	public Pelicula() {
	}

	// GetterAndSetter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}
	
}
