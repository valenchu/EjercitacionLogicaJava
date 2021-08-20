package UMLAsociacion.BarajaDeCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Mazo {

	private Set<Carta> mazoOriginal = new HashSet<Carta>();
	private Set<Carta> mazoSalida = new HashSet<Carta>();

	public Mazo() {
	}

	public Set<Carta> getMazoOriginal() {
		return mazoOriginal;
	}

	public void setMazoOriginal(HashSet<Carta> mazoOriginal) {
		this.mazoOriginal = mazoOriginal;
	}

	public Set<Carta> getmazoSalida() {
		return mazoSalida;
	}

	public void setmazoSalida(HashSet<Carta> mazoSalida) {
		this.mazoSalida = mazoSalida;
	}

	// Este metodo lo que hace es llenar el mazo de cartas con 40 cartas distintas
	// sin 8 ni 9
	public void llenarMazo() {
		this.mazoOriginal.add(new Carta());
	}

	// barajar() : cambia de posición todas las cartas aleatoriamente.
	public void baraja() {
		List<Carta> li = new ArrayList<Carta>(this.mazoOriginal); // transformo el hsset a lista
		Collections.shuffle(li);// mezclo la lista con shuffle
		this.mazoOriginal = new HashSet<Carta>(li);// Inserto la lista de nuevo en el mazo original
	}

//	mostrarBaraja() : muestra todas las cartas hasta el final. 
//	Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
	public void mostrarMazo() {
		int cont = 0;
		for (Carta carta : mazoOriginal) {
			System.out.print(carta.toString() + " || ");
			cont++;
			if (cont == 4) {// genero salto de linea para que me aparezcan uno debajo del otro desp de 4
							// datos
				System.out.println("");
				cont = 0;
			}
		}
	}

	// • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
//	número de cartas. En caso de que haya menos cartas que las pedidas, no
//	devolveremos nada, pero debemos indicárselo al usuario.
	public int darCartas(int cantCartas) {
		int cantidadDeCartas = this.mazoOriginal.size();// inserto el tamaño que tiene actualmente el mazo
		int numeroDeCartas = 0, cont = 0;
		List<Carta> l = new ArrayList<Carta>(this.mazoOriginal);// Creo lista para manejar mejor los indices
		if (cantidadDeCartas >= cantCartas) {// Si la cantidad pediad es menor q la que hay en mazo hace for si no
												// madnamensaje
			for (int i = 0; i < cantCartas; i++) {
				System.out.println("Obvtuviste = " + l.get(0));// Muestro la carta que saca
				this.mazoOriginal.remove(l.get(0));// saco la carta del mazo original
				this.mazoSalida.add(l.get(0));// Guardo la carta en el mazo de salida
				l.remove(0); // elimino la carta de la lista
			}
			numeroDeCartas = cantCartas;
		} else {
			System.out.println("Le quedan solo " + cantidadDeCartas + " por sacar nomas!!!!");
			numeroDeCartas = -1;
		}
		return numeroDeCartas;
	}

//	• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
//	haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
	public void siguienteCarta() {
		List<Carta> l = new ArrayList<Carta>(this.mazoOriginal);// Creo lista
		System.out.println("Obtuviste la carta = " + l.get(0));// Muestro la carta que obtendra
		this.mazoOriginal.remove(l.get(0));// la saco de mazo original
		this.mazoSalida.add(l.get(0)); // La pongo en mazo de salida donde estan las eliminadas
	}

//	• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
	public void cartasDisponibles() {
		System.out.println("Aun tiene disponible " + this.mazoOriginal.size() + " cartas en su mazo para repartir");
	}

	// cartasMonton() : mostramos aquellas cartas que ya han salido (es necesario ir
	// guardándolas en otra lista a
	// medida que salgan), si no ha salido ninguna indicárselo al usuario.
	public void cartasMonton() {
		System.out.println("Han salido del mazo un total de " + this.mazoSalida.size() + " cartas");
	}
}
