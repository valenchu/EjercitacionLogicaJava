package UMLAsociacion.RuletaRusaAgua;
//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del

//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
//(indica si está mojado o no el jugador). El número de jugadores será decidido por el
//usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:

//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
public class Jugador {

	private Integer idJugador;
	private String nomJudaor;
	private Boolean mojado ;

	public Jugador(Integer idJugador, String nomJudaor, Boolean mojado) {
		this.idJugador = idJugador;
		this.nomJudaor = nomJudaor;
		this.mojado = mojado;
	}

	public Jugador(Integer idJugador, String nomJudaor) {
		if(idJugador.equals(null) || idJugador.equals(0)) {
			idJugador = 6;
		}
		this.idJugador = idJugador;
		this.nomJudaor = nomJudaor + " " + idJugador;
		this.mojado = false;
	}

	public Jugador() {
	}

	public Integer getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(Integer idJugador) {
		this.idJugador = idJugador;
	}

	public String getNomJudaor() {
		return nomJudaor;
	}

	public void setNomJudaor(String nomJudaor) {
		this.nomJudaor = nomJudaor + " " + this.idJugador;
	}

	public Boolean getMojado() {
		return mojado;
	}

	public void setMojado(Boolean mojado) {
		this.mojado = mojado;
	}

	public void disparo(RevolverDeAgua r) {// Si el metodo mojar es igual a true significa que se mojeo
		// tonces pongo mojado en true si no dejo mojado en false y paso al siguiente
		// chorro
		if (r.mojar() == true) {
			this.mojado = r.mojar();
		} else {
			r.siguienteChorro();
		}
	}

	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", nomJudaor=" + nomJudaor + ", mojado=" + mojado + "]";
	}
	
}
