package Colecciones.Pais;

import java.util.Scanner;
import java.util.TreeSet;

public class MenuPais {

	public static void ejecutarMenuPais() {
//		Se requiere un programa que lea y guarde países, y para evitar que se ingresen
//		repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
//		guardará el país en el conjunto y después se le preguntará al usuario si quiere
//		guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
//		guardados en el conjunto.
//		Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
//		recordar como se ordena un conjunto.
//		Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
//		Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
//		país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
//		en el conjunto se le informará al usuario
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
