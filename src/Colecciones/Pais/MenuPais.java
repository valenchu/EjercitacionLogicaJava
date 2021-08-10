package Colecciones.Pais;

import java.util.Scanner;
import java.util.TreeSet;

public class MenuPais {

	public static void ejecutarMenuPais() {
//		Se requiere un programa que lea y guarde pa�ses, y para evitar que se ingresen
//		repetidos usaremos un conjunto. El programa pedir� un pa�s en un bucle, se
//		guardar� el pa�s en el conjunto y despu�s se le preguntar� al usuario si quiere
//		guardar otro pa�s o si quiere salir, si decide salir, se mostrar� todos los pa�ses
//		guardados en el conjunto.
//		Despu�s deberemos mostrar el conjunto ordenado alfab�ticamente para esto
//		recordar como se ordena un conjunto.
//		Y por ultimo, al usuario se le pedir� un pa�s y se recorrer� el conjunto con un
//		Iterator, se buscar� el pa�s en el conjunto y si est� en el conjunto se eliminar� el
//		pa�s que ingres� el usuario y se mostrar� el conjunto. Si el pa�s no se encuentra
//		en el conjunto se le informar� al usuario
		TreeSet<Pais> pai = new TreeSet<Pais>();
		Scanner sn = new Scanner(System.in);
		int ver = -1;
		String p;
		do {
			System.out.println("Ingrese un pais");
			p = sn.nextLine();
			pai.add(new Pais(p));
			System.out.println("Desea agregar otro pais digite 1 si no digite 0");
			ver = sn.nextInt();
			sn.nextLine();
		} while (ver != 0);
		System.out.println("--------------PAISES ORDENADOS ALFABETICAMENTE--------------");
		pai.forEach((f) -> System.out.println(f.getNombrePais()));
		System.out.println("Ingrese pais a eliminar del conjunto");
		String nom = sn.nextLine();
		Pais pin = new Pais();
		int a = pai.size();
		pin.eliminarPais(pai, nom);
		int b = pai.size();
		String con = (a != b) ? "Se elimino el pais " + nom.toUpperCase() + " de la lista"
				: "No se encontro el pais " + nom.toUpperCase() + " en la lista para eliminar";
		System.out.println(con);
		System.out.println("--------------PAISES ORDENADOS ALFABETICAMENTE--------------");
		pai.forEach((f) -> System.out.println(f.getNombrePais()));
	}

}
