package UMLAsociacion.RuletaRusaAgua;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRuso {
//	Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
//	trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
//	carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:
//	Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
	public static void menuRuso() {
		Scanner sn = new Scanner(System.in);
		boolean veri = false, veri2 = false;
		Juego j = new Juego();
		int contador = 1, elec = 0, valor = 0;
		ArrayList<Jugador> ju = new ArrayList<Jugador>();
		do {
			do {
				System.out.println("---CARGANDO JUGADOR ---");
				System.out.println("Ingrese el nombre del jugador " + contador);
				String nombre = sn.nextLine();
				ju.add(new Jugador(contador, nombre));// Creo una lista para pasarlo por parametros al llenar el Juego
				do {
					System.out.println("¿Desea agregar otro jugador solo puede agregar 6?");// Le digo si quiere meter
																							// otro
																							// jugador
					System.out.println("Ingrese [1] para [SI] [0] para [NO]");
					System.out.println("Actualmente posee " + contador + " en el juego");
					elec = sn.nextInt();
					if (elec != 0 && elec != 1) {// Si elige mal tira mensaje error y repite proceso
						System.out.println("Ingreso un numero que nada que ver");
					} else {
						veri2 = true;
					}
				} while (veri2 == false);
				if (elec == 0 || contador == 6) {// si puso 0 sale si contador es == a 6 sale porque maximo 6 jugadore
					System.out.println("Saliento ya sea porque puso salir o porque llego a 6 jugadores");
					veri = true;
				}
				sn.nextLine();
				contador++;
			} while (veri == false);
			RevolverDeAgua r = new RevolverDeAgua();
			j.llenarJuego(ju, r);
			j.ronda();
			System.out.println("DESEA VOLVER A JUGAR INGRESE 1 SI NO 0");
			valor = sn.nextInt();
		} while (valor == 1);
		System.out.println("Salio del juego");
	}

}
