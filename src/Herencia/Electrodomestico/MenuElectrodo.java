package Herencia.Electrodomestico;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuElectrodo {

	public static void menuElectro() {
		// Desmarcar para ejercicio 2
//		Televisor tele1 = new Televisor();
//		tele1.crearTelevisor();
//		Lavadora l = new Lavadora();
//		l.crearLavadora();
		// Desmarcar para ejercicio 3
		boolean ver = false;
		Scanner sn = new Scanner(System.in);
		ArrayList<Electrodomestico> ele = new ArrayList<>();
		ele.add(new Lavadora(2000D, "Blanco", 'F', 40, 40));
		ele.add(new Lavadora(4000D, "Negro", 'E', 35, 50));
		ele.add(new Televisor(3000D, "Negro", 'A', 30, 44, true));
		ele.add(new Televisor(5000D, "Rojo", 'B', 35, 55, false));
		double suma = 0, sumaLava = 0, sumaTele = 0;
		for (Electrodomestico electrodomestico : ele) {
			System.out.println(
					electrodomestico.nombre + " " + electrodomestico.precio + " " + electrodomestico.consumoEnergetico);
			sumaLava = (electrodomestico.nombre.equals("Lavadora")) ? sumaLava + electrodomestico.precio
					: sumaLava + 0;
			sumaTele = (electrodomestico.nombre.equals("Televisor")) ? sumaTele + electrodomestico.precio
					: sumaTele + 0;
			suma = suma + electrodomestico.precio;
		}
		System.out.println("Precio de la suma total es de " + suma);
		System.out.println(sumaLava + " Son del LAVARROPAS");
		System.out.println(sumaTele + " Son del TELEVISOR");

	}
}
