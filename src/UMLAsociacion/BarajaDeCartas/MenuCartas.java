package UMLAsociacion.BarajaDeCartas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MenuCartas {
//	Realizar una baraja de cartas espa�olas orientada a objetos. Una carta tiene un n�mero
//	entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
//	clase debe contener un m�todo toString() que retorne el n�mero de carta y el palo. La
//	baraja estar� compuesta por un conjunto de cartas, 40 exactamente.
//	Las operaciones que podr� realizar la baraja son:
//	� barajar(): cambia de posici�n todas las cartas aleatoriamente.
//	� siguienteCarta(): devuelve la siguiente carta que est� en la baraja, cuando no
//	haya m�s o se haya llegado al final, se indica al usuario que no hay m�s cartas.
//	� cartasDisponibles(): indica el n�mero de cartas que a�n se puede repartir.
//	
//	� cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
//	ninguna indic�rselo al usuario
//	� mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
//	carta y luego se llama al m�todo, este no mostrara esa primera carta.

	public static void menuCartas() {
		Mazo ma = new Mazo();// Creo objeto
		int valor = 0;
		for (int i = 0; i < 2; i++) {// Creo for para llenar el mazo
			ma.llenarMazo();// Metodo de mazo que me lo llena
			valor = ma.getMazoOriginal().size();// compruebo tama�o del mazo
			if (valor != 40)// si el tama�o aun no es 40 i lo vuelvo 0 para completar el mazo a 40 cartas
				i = 0;
		}
		// El sistema implementado es de testeo rapido se puede implementar un menu
		// tranquilamente si lo desea
		ma.baraja();
		System.out.println("ABARAJE EL MAZO");
		ma.mostrarMazo();
		int numero = ma.darCartas(10);
		System.out.println(numero);
		ma.mostrarMazo();
		System.out.println("");
		ma.siguienteCarta();
		ma.mostrarMazo();
		System.out.println("");
		ma.cartasDisponibles();
		System.out.println("");
		ma.cartasMonton();

	}

}
