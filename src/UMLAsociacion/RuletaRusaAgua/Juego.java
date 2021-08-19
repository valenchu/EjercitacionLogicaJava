package UMLAsociacion.RuletaRusaAgua;
//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de

//Jugadores) y Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
//sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
//tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.

import java.util.ArrayList;

public class Juego {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private RevolverDeAgua revolver;

	public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
		this.jugadores = jugadores;
		this.revolver = revolver;
	}

	public Juego() {
	}

	public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {

		this.jugadores = jugadores;
		this.revolver = r;
	}

	public void ronda() {
		this.revolver.llenarRevolver();// lleno el revolver de agua
		this.jugadores.forEach((p) -> {// Genero funcion lambda regorro la lista de jugadores y con la p traigo los
										// metodos
			p.disparo(this.revolver);// llamo a disparo de jugador lo cual activa el boolean de si se moja o no
			if (p.getMojado().equals(true)) {// si se moja retorna true tonces muestro quien se mojo
				System.out.println(p.getNomJudaor() + " Fue el que resulto MOJADO");
				System.out.println("---FIN DEL JUEGO---");
			}
			return;// Pongo return para cortar el proceso
		});

	}

	@Override
	public String toString() {
		return "Juego [jugadores=" + jugadores + ", revolver=" + revolver + "]";
	}

}
