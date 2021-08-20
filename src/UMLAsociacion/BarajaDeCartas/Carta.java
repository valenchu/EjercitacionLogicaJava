package UMLAsociacion.BarajaDeCartas;

import java.util.Random;

public class Carta {
	private Integer numero;
	private Palo palo;

	public Carta(Integer numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public Carta() {
		boolean verificador = false;
		Random ran = new Random();
		do {
			Integer num = (int) (Math.random() * 12 + 1);// Numero entre 1 y 12
			if ((num != 8) && (num != 9)) {
				this.numero = num;
				verificador = true;
			}
		} while (verificador == false);
		this.palo = this.palo.randomPalo();
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (palo != other.palo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.numero + " DE " + this.palo;
	}

}
