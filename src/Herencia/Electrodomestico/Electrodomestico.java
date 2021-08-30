package Herencia.Electrodomestico;

import java.util.Scanner;

public abstract class Electrodomestico {
//	Crear una superclase llamada Electrodom�stico con los siguientes atributos:
//		precio, color, consumo energ�tico (letras entre A y F) y peso.
	// Atributos
	protected Double precio;
	protected String color;
	protected Character consumoEnergetico;
	protected Integer peso;
	protected String nombre;

	// Constructores
	public Electrodomestico() {
		comprobarConsumoEnergetico(this.consumoEnergetico);
	}

	public Electrodomestico(Double precio, String color, Character consumoEnergetico, Integer peso) {
		this.precio = precio;

		comprobarColor(color);
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		

	}

	// GetterAndSetters
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Character getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(Character consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	// M�todo comprobarConsumoEnergetico(char letra): comprueba que la letra
//	es correcta, sino es correcta usara la letra F por defecto.
	private void comprobarConsumoEnergetico(Character letra) {
		if(letra.equals(null)) {
			letra ='F';
		}
		boolean ver = letra.toString().matches("[a-fA-F]{1}");// Verifico que ingrese de A a F o de a-f 1 solo caracter
		this.consumoEnergetico = (ver == true) ? letra : 'F';
	}

//	M�todo comprobarColor(String color): comprueba que el color es correcto, y
//	si no lo es, usa el color blanco por defecto. Los colores disponibles para los
//	electrodom�sticos son blanco, negro, rojo, azul y gris. No importa si el nombre
//	est� en may�sculas o en min�sculas. Este m�todo se invocar� al crear el
//	objeto y no ser� visible
	private void comprobarColor(String color) {
		color = color.toUpperCase();
		boolean ver = color.matches("BLANCO|NEGRO|ROJO|AZUL|GRIS");// Verifico colores
		this.color = (ver == true) ? color : "BLANCO";
	}

//	Metodo crearElectrodomestico(): le pide la informaci�n al usuario y llena el
//	electrodom�stico, tambi�n llama los m�todos para comprobar el color y el
//	consumo. Al precio se le da un valor base de $1000
	protected void crearElectrodomestico() {
		boolean ver = false, verPrecio = false, verPeso = false;
		Scanner sn = new Scanner(System.in);
		do {
			System.out.println("----METODO DE CARGA DE ELETRODOMESTICO----");
			System.out.println("INGRESE TODO METICULOSAMENTE \nO SE REPETIRA TODO EL PROCESO");
			try {

				System.out.println("Ingrese el PRECIO del electr�domestico");
				this.precio = sn.nextDouble();
				if (this.precio < 0) {
					verPrecio = false;
				} else {
					verPrecio = true;
				}
			} catch (Exception e) {
				System.out.println("PRECIO ERRONEO " + e);
				sn.nextLine();
				verPrecio = false;
			}
			try {
				System.out.println("Ingrese el PESO del electr�domestico");
				this.peso = sn.nextInt();
				if (this.peso < 0) {
					verPeso = false;
				} else {
					verPeso = true;
				}
			} catch (Exception e) {
				System.out.println("PESO ERRONEO " + e);
				sn.nextLine();
				verPeso = false;
			}
			try {
				System.out.println("Ingresa la LETRA de su consumo electr�nico");
				Character letra = sn.next().charAt(0);
				comprobarConsumoEnergetico(letra);
				ver = true;
			} catch (Exception e) {
				System.out.println("CARACTER ERRONEO " + e);
				sn.nextLine();
				ver = false;
			}
			sn.nextLine();
			try {
				System.out.println("Ingrese el COLOR del electr�domestico");
				String color = sn.nextLine();
				comprobarColor(color);
				ver = true;
			} catch (Exception e) {
				System.out.println("COLOR ERRONEO " + e);
				sn.nextLine();
				ver = false;
			}
			if (ver == true && verPeso == true && verPrecio == true) {
				ver = true;
			} else {
				ver = false;
				System.out.println("ERROR EN EL LLENADO INICIE DE VUELTA REVISE BIEN LOS DATOS INGRESADOS");
			}
		} while (ver == false);

	}

//	M�todo precioFinal(): seg�n el consumo energ�tico y su tama�o, aumentar�
//	el valor del precio. Esta es la lista de precios
	protected double precioFinal() {
		// Aumento el precio final con respecto al consumo electrico
		double precioFinal = (this.consumoEnergetico.equals('A')) ? (this.precio + 1000)
				: (this.consumoEnergetico.equals('B')) ? (this.precio + 800)
						: (this.consumoEnergetico.equals('C')) ? (this.precio + 600)
								: (this.consumoEnergetico.equals('D')) ? (this.precio + 500)
										: (this.consumoEnergetico.equals('E')) ? (this.precio + 300)
												: (this.precio + 100);
		// Aumento el precio final con respecto al peso del electrodomestico
		this.precio = precioFinal;
		precioFinal = (this.peso >= 1 && this.peso <= 19) ? (this.precio + 100)
				: (this.peso >= 20 && this.peso <= 49) ? (this.precio + 500)
						: (this.peso >= 50 && this.peso <= 79) ? (this.precio + 800)
								: (this.peso >= 80) ? (this.precio + 1000) : this.precio;
		this.precio = precioFinal;
		return this.precio;
	}

	protected abstract void nombre();
}
