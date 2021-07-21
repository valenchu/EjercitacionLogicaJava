package POO;

import java.util.Scanner;

public class CafeteraEjer6POO {
	// Atributos
	private Integer capacidadMaxima = 0, cantidadActual = 0;

	// Constructores
	// lleno
	public CafeteraEjer6POO(Integer capacidadMaxima, Integer cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
	}

	// Vacio
	public CafeteraEjer6POO() {
	}

	// GetterAndSetters
	public Integer getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Integer capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Integer getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(Integer cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

// METODOS LOGICOS -------------------------------------------------------------------
	// Hace que la cantidad actual sea igual a la maxima;
	public void llenarCafetera() {
		setCantidadActual(getCapacidadMaxima());
	}

	// Metodo que sirve una taza de cafe dependiendo de su tamaño
	public void servirTaza(int tamanoTaza) {
		int capAc = getCantidadActual();
		int calculo = capAc - tamanoTaza;

		System.out.println("Sirviendo taza");
		if (capAc < tamanoTaza) {
			System.out.println(
					"Se sirvio " + capAc + " de cafe en la taza porque es lo que hay actualmente en la cafetera");
			System.out.println("A la taza le faltaron " + Math.abs(calculo) + " mililitros por llenarse");
			setCantidadActual(0);
		} else if (capAc == tamanoTaza) {
			System.out.println("Se lleno la taza pero la cafetera quedo vacia");
			setCantidadActual(0);
		} else {
			System.out.println("La taza se lleno completamente");
			System.out.println("La cafetera quedo con una cantidad actual de " + calculo);
			setCantidadActual(calculo);
		}
	}

	// Metodo que vacia la cafetera
	public void vaciarCafetera() {
		setCantidadActual(0);
	}

	// Metodo que carga la cafetera con cafe
	public void agregarCafe(int carga) {
		int suma = (getCantidadActual() + carga);
		int capacidadIngresar = getCapacidadMaxima() - getCantidadActual();
		if (carga > getCapacidadMaxima()) {
			System.out.println("La carga supera la capacidad maxima de la cafetera ingrese una capacidad menor");
			System.out.println("CAPACIDAD ACTUAL DE CAFETERA " + getCantidadActual());
			System.out.println("CAPACIDAD MAXIMA DE LA CAFETERA " + getCapacidadMaxima());
			System.out.println("Usted puede ingresar un maximo de " + capacidadIngresar);
		} else if (carga > getCantidadActual()) {
			System.out.println("Ingreso una carga mayor a la que puede ingresarse en la cafetera");
			System.out.println("Intentelo de nuevo con menos carga");
		} else {
			setCantidadActual(suma);
			System.out.println("---CAFETERA CARGADA---");
		}

	}

//METODOS DEL MENU Y ACCION DEL MENU---------------------------------------------------
	// Mostrar menu
	public void menu() {
		System.out.println("///////////////////////////////////////////");
		System.out.println("CAFETERA DATOS");
		System.out.println("Capacidad MAXIMA " + getCapacidadMaxima() + " mililitros");
		System.out.println("Capacidad ACTUAL " + getCantidadActual() + " mililitros");
		System.out.println("MENU");
		System.out.println("1- Para llenar cafetera");
		System.out.println("2- Para servir taza");
		System.out.println("3- Para vaciar cafetera");
		System.out.println("4- Para agregar cafe a la cafetera");
		System.out.println("0- Para salir");
		System.out.println("///////////////////////////////////////////");
	}

	// accion del menu
	public void acciones(int accion) {
		Scanner sn = new Scanner(System.in);
		System.out.println("///////////////////////////////////////////");
		switch (accion) {
		case 1:
			System.out.println("---LLENANDO CAFETERA AL 100%---");
			llenarCafetera();
			break;
		case 2:
			System.out.println("Ingrese el tamaño de la taza vacia");
			int tam = sn.nextInt();
			servirTaza(tam);
			break;
		case 3:
			System.out.println("---VACIANDO LA CAFETERA---");
			vaciarCafetera();
			System.out.println("---CAFETERA AL 0%---");
			break;
		case 4:
			System.out.println("---CARGANDO CAFETERA---");
			System.out
					.println("Ingrese la capacidad a cargar en la cafetera.\nLa cafetera tiene una capacidad actal de "
							+ getCantidadActual());
			int carga = sn.nextInt();
			agregarCafe(carga);
			break;
		case 0:
			System.out.println("---SALIENDO DE CAFETERA---");
			break;

		default:
			System.out.println("Numero incorrecto, intentelo de nuevo");
			break;
		}

	}
}
