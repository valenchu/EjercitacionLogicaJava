package UMLAsociacion.RuletaRusaAgua;
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual

//(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
//posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
//aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
//valores deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)

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
