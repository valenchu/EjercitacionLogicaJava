package UMLAsociacion.BarajaDeCartas;

import java.util.Random;

public enum Palo {
	ESPADA, ORO, COPA, BASTO;

	public static Palo randomPalo() {// Metodo que hace un palo random por carta
		Random rn = new Random();
		Palo palo = Palo.values()[rn.nextInt(Palo.values().length)];
		return palo;
	}
}
