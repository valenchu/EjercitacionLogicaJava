package Colecciones.Tienda;

import java.util.HashMap;
import java.util.Scanner;

public class MenuTienda {
	static Scanner sn = new Scanner(System.in);

	static Tienda tien;

	public static void ejecutarTiendaMenu() {
//		Se necesita una aplicación para una tienda en la cual queremos almacenar los
//		distintos productos que venderemos y el precio que tendrán. Además, se necesita
//		que la aplicación cuente con las funciones básicas.
//		Estas las realizaremos en el main. Como, introducir un elemento, modificar su
//		precio, eliminar un producto y mostrar los productos que tenemos con su precio
//		(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
//		el precio. Realizar un menú para lograr todas las acciones previamente
//		mencionadas
		tien = new Tienda("Leche la serenicima", 3.33);
		tien = new Tienda("Queso rokefor", 4.43);
		tien = new Tienda("Lechuga", 5.66);
		tien = new Tienda("Tomate", 6.36);
		tien = new Tienda("Yogurt", 10.6);
		int ver;
		do {// Menu de la app si clikeas 0 se cierra
			System.out.println("BIENVENIDO AL MENU DE LA TIENDA");
			System.out.println("¿QUE DESEA HACER?");
			System.out.println("1- Seleccionar para itroducir un nuevo producto a la tienda");
			System.out.println("2- Mostrar la lista de productos y precios");
			System.out.println("3- Modificar precio producto");
			System.out.println("4- Eliminar producto");
			System.out.println("0- Para salir de la tienda");
			ver = sn.nextInt();
			accionMenu(ver);

		} while (ver != 0);
	}

	public static void accionMenu(int ac) {// Acciones de la app. Dependiendo del numero realiza accion

		boolean ver = false;
		sn.nextLine();
		switch (ac) {
		case 1:
			System.out.println("INSERTANDO EL PRODUCTO EN LA LISTA");
			System.out.println("Ingrese el nombre del producto");// Pido los datos nombre y precio para guardar en lista
			String nom = sn.nextLine();
			System.out.println("Ingrese precio del producto(eje 1,29)");
			Double pre = sn.nextDouble();
			tien = new Tienda(nom, pre);// Tengo un constructor en tienda que al pasar estos 2 datos intancia una lista
										// tamb
			break;
		case 2:
			System.out.println("MOSTRANDO LOS PRODUCTOS");
			if (tien != null) {
				tien.mostrarProductos();// Metodo en lista que muestra todos los productos
			} else {
				System.out.println("No datos en el objeto");
			}
			break;
		case 3:
			System.out.println("MOSTRANDO LOS PRODUCTOS");
			if (tien != null) {
				tien.mostrarProductos();
				System.out.println("MODIFICANDO PRECIO DE PRODUCTO A SELECCIONAR");
				System.out.println("Ingrese nombre del producto a modificar");
				nom = sn.nextLine();
				System.out.println();
				System.out.println("Ingrese el precio que le quiere agregar a dicho producto(ejem: 2,33)");
				pre = sn.nextDouble();
				tien.modificarPrecioProducto(pre, nom);// Metodo en lista que modifica los productos
				System.out.println("----Precio modificado con exito----");
			} else {
				System.out.println("No datos en el objeto");
			}
			break;
		case 4:
			System.out.println("ELIMINACION DE PRODUCTOS");
			if (tien != null) {
				tien.mostrarProductos();
				System.out.println("Ingrese el nombre del producto a eliminar");
				nom = sn.nextLine();
				tien.eliminarProducto(nom);
			} else {
				System.out.println("No datos en el objeto");
			}
			break;
		case 0:
			System.out.println("SALIENDO DE LA APLICACION TIENDA");
			break;
		default:
			System.out.println("Accion erronea intentelo de nuevo");
			break;
		}

	}

}
