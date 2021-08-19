package UMLAsociacion.RuletaRusaAgua;
//Clase Revolver de agua: esta clase posee los siguientes atributos: posici�n actual

//(posici�n del tambor que se dispara, puede que est� el agua o no) y posici�n agua (la
//posici�n del tambor donde se encuentra el agua). Estas dos posiciones, se generar�n
//aleatoriamente.
//M�todos:
//� llenarRevolver(): le pone los valores de posici�n actual y de posici�n del agua. Los
//valores deben ser aleatorios.
//� mojar(): devuelve true si la posici�n del agua coincide con la posici�n actual
//� siguienteChorro(): cambia a la siguiente posici�n del tambor
//� toString(): muestra informaci�n del revolver (posici�n actual y donde est� el agua)

public class RevolverDeAgua {
	private Integer posActual;
	private Integer posAgua;

	public RevolverDeAgua(Integer posActual, Integer posAgua) {
		this.posActual = posActual;
		this.posAgua = posAgua;
	}

	public RevolverDeAgua() {
	}

	public void llenarRevolver() {
		this.posActual = (int) (Math.random() * 7 + 1);//Numeros entre 1 y 6 genero
		this.posAgua = (int) (Math.random() * 7 + 1);
	}

	public boolean mojar() {
		if (this.posActual == this.posAgua) {
			toString();
			return true;
		}
		return false;
	}

	public void siguienteChorro() {
		if (this.posActual != 6) {
			this.posActual++;
		} else {
			this.posActual = 1;
		}
	}

	@Override
	public String toString() {
		String devolver = "La posicion actual es = " + this.posActual + "\nEl agua se encuentra en la posicion = "
				+ this.posAgua;
		return devolver;
	}
}
