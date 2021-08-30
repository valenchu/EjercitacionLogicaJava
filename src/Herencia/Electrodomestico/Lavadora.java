package Herencia.Electrodomestico;

import java.util.Scanner;

//A continuación se debe crear una subclase llamada Lavadora, con el atributo
//carga, además de los atributos heredados.
public final class Lavadora extends Electrodomestico {
	private Integer carga;

	public Lavadora() {
		// TODO Auto-generated constructor stub
	}

	public Lavadora(Double precio, String color, Character consumoEnergetico, Integer peso, Integer carga) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;
		this.nombre();
		this.precioFinal();
		// TODO Auto-generated constructor stub
	}

	public Integer getCarga() {
		return carga;
	}

	public void setCarga(Integer carga) {
		this.carga = carga;
	}

//	Método crearLavadora (): este método llama a crearElectrodomestico() de la
//	clase padre, lo utilizamos para llenar los atributos heredados del padre y
//	después llenamos el atributo propio de la lavadora

	public void crearLavadora() {
		Scanner sn = new Scanner(System.in);
		boolean ver = false;
		super.crearElectrodomestico();
		do {
			try {
				System.out.println("Ingrese la CARGA de la Lavadora");
				this.carga = sn.nextInt();
				if (this.carga < 0) {
					ver = false;
					System.out.println("CARGA MENOR A 0");
				} else {
					ver = true;
				}
			} catch (Exception e) {
				System.out.println("CARGA ERRONEA " + e);
				sn.nextLine();
				ver = false;
			}
		} while (ver == false);
		System.out.println("----PROCESO DE CARGADO TERMINADO----");
		System.out.println("EL PRECIO FINAL DE LA LAVADORA ES DE == " + this.precioFinal());
	}

//	Método precioFinal(): este método será heredado y se le sumará la siguiente
//	funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
//	si la carga es menor o igual, no se incrementará el precio. Este método debe
//	llamar al método padre y añadir el código necesario. Recuerda que las
//	condiciones que hemos visto en la clase Electrodoméstico también deben
//	afectar al precio.
	@Override
	public double precioFinal() {
		double m = super.precioFinal();
		this.precio = (this.carga > 30) ? (m + 500) : m;
		return this.precio;
	}

	@Override
	protected void nombre() {
		// TODO Auto-generated method stub
		super.nombre = "Lavadora";
	}

}
