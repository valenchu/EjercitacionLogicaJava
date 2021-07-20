package POO;

import java.util.Scanner;

public class Ejercicio1POO {
	private Integer numPag = 0;
	private String ISBN = "", autor = "", titulo = "";

	// Constructor vacio
	public Ejercicio1POO() {
	}

	// Constructor lleno
	public Ejercicio1POO(Integer numPag, String iSBN, String autor, String titulo) {
		this.numPag = numPag;
		this.ISBN = iSBN;
		this.autor = autor;
		this.titulo = titulo;
	}

	// Cargo los datos al libro
	private void cargarDatosLibro() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese Título del libro");
		String titulo = sc.nextLine();
		System.out.println("Ingrese Autor del libro");
		String autor = sc.nextLine();
		System.out.println("Ingrese ISBN del libro");
		String iSBN = sc.nextLine();
		System.out.println("Ingrese Numero de paginas del libro");
		Integer numPag = sc.nextInt();
		this.numPag = numPag;
		this.ISBN = iSBN;
		this.autor = autor;
		this.titulo = titulo;
	}

	// Metodo que muestra los datos del libro
	public void mostrarDatosLibro() {
		System.out.println("//////////////////////////////");
		System.out.println("El Título del libro es: " + titulo);
		System.out.println("//////////////////////////////");
		System.out.println("El Autor del libro es: " + autor);
		System.out.println("//////////////////////////////");
		System.out.println("Tiene " + numPag + " paginas");
		System.out.println("//////////////////////////////");
		System.out.println("Su ISBN es: " + ISBN);

	}

	// Llamo cargador
	public void llamarCargadorMostrador() {
		cargarDatosLibro();
		mostrarDatosLibro();
	}

}
