package Herencia.Electrodomestico;

import java.util.Scanner;

//Se debe crear también una subclase llamada Televisor con los siguientes
//atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
//atributos heredados
public final class Televisor extends Electrodomestico {
	private Integer resolucion;
	private Boolean sintonizarTDT;

	public Televisor() {
		// TODO Auto-generated constructor stub
	}

	public Televisor(Double precio, String color, Character consumoEnergetico, Integer peso, Integer resolucion,
			Boolean sintonizarTDT) {
		super(precio, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizarTDT = sintonizarTDT;
		this.nombre();
		this.precioFinal();
		// TODO Auto-generated constructor stub
	}

	public Integer getResolucion() {
		return resolucion;
	}

	public void setResolucion(Integer resolucion) {
		this.resolucion = resolucion;
	}

	public Boolean getSintonizarTDT() {
		return sintonizarTDT;
	}

	public void setSintonizarTDT(Boolean sintonizarTDT) {
		this.sintonizarTDT = sintonizarTDT;
	}

//	Método crearTelevisor(): este método llama a crearElectrodomestico() de la
//	clase padre, lo utilizamos para llenar los atributos heredados del padre y
//	después llenamos los atributos del televisor.
	public void crearTelevisor() {
		boolean verR = false, ver = false, verS = false;
		Scanner sn = new Scanner(System.in);
		super.crearElectrodomestico();
		do {
			try {
				System.out.println("Ingrese las PULGADAS del Televisor");
				this.resolucion = sn.nextInt();
				if (this.resolucion < 0) {
					verR = false;
					System.out.println("CARGA PULGADAS MENOR A 0");
				} else {
					verR = true;
				}
			} catch (Exception e) {
				System.out.println("CARGA ERRONEA " + e);
				sn.nextLine();
				verR = false;
			}
			try {
				System.out.println("Ingrese 1 para sintonizacion TDT si no ingrese 0");
				int num = sn.nextInt();
				this.sintonizarTDT = (num == 1) ? true : (num == 0) ? false : false;
				verS = true;
			} catch (Exception e) {
				System.out.println("CARGA ERRONEA " + e);
				sn.nextLine();
				verS = false;
			}
			if (verR == true && verS == true) {
				ver = true;
			} else {
				ver = false;
				System.out.println("INGRESO ALGO MAL");
			}
		} while (ver == false);
		System.out.println("----PROCESO DE CARGADO TERMINADO----");
		System.out.println("EL PRECIO FINAL DEL TELEVISOR ES DE == " + this.precioFinal());

	}

//	Método precioFinal(): este método será heredado y se le sumará la siguiente
//	funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//	incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
//	aumentará $500. Recuerda que las condiciones que hemos visto en la clase
//	Electrodomestico también deben afectar al precio.
	@Override
	public double precioFinal() {
		double m = super.precioFinal();
		double porcentaje = m * 1.30;
		this.precio = (this.resolucion > 40 && this.sintonizarTDT == true) ? (500 + porcentaje) : m;
		return this.precio;
	}

	@Override
	protected void nombre() {
		// TODO Auto-generated method stub
		super.nombre = "Televisor";
	}
}
