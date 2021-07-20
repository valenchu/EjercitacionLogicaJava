package POO;

import java.util.Scanner;

public class CircunferenciaEjer2POO {
	// Atributos
	private Double radio;
	private Double area = 0.0;
	private Double perimetro = 0.0;

	// Constructor
	public CircunferenciaEjer2POO(Double radio) {
		this.radio = radio;
	}

	// Getter AND Setters
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	// Metodos

	// Cargo radio
	public void crearCircunferencia() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Ingrese el radio de la CIRCUNFERENCIA");
		// Guardo el radio en la variable cir y lo inserto en el atributo radio de la
		// clase
		double cir = sn.nextDouble();
		this.radio = cir;
	}

	// Calculo Area
	public void area() {
		// Guardo en area el area de la circunferencia
		// Math.PI me da el numero pi
		// Math.pow me calcula un numero en el primer parametro y la potencia de ese
		// numero
		// en este caso pow lo que hace es el radio de la circunferencia al cuadrado por
		// pi
		double area = (Math.PI * (Math.pow(this.radio, 2)));
		this.area = area;
	}

	// Calculo perimetro
	public void perimetro() {
		// Calculo perimetro hago 2 por pi por radio y lo guardo en perimetro que es el
		// atributo de la clase
		double per = ((2 * (Math.PI * this.radio)));
		this.perimetro = per;
	}

	// Mostrar datos
	public void mostrarDatos() {
		System.out.println("////////////////////////////////////////////");
		System.out.println("El radio de la circunferencia es: " + radio);
		System.out.println("El area de la circunferencia es: " + area);
		System.out.println("El perimetro de la circunferencia es: " + perimetro);
	}
}
