package POO;

import java.util.Scanner;

public class RectangulosEje4POO {
	// Atributos
	private Double base = 0.0, altura = 0.0;
	Scanner sc = new Scanner(System.in);

	// Constructor lleno
	public RectangulosEje4POO(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	// Constructor Vacio
	public RectangulosEje4POO() {
	}

	// GetterAndSetters
	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	// Metodos
	// lleno atributos de la clase
	public void crearRectangulo() {
		System.out.println("Ingrese base del rectangulo");
		double b = sc.nextDouble();
		System.out.println("Ingrese altura del rectangulo");
		double a = sc.nextDouble();
		this.base = b;
		this.altura = a;
	}

	// Calculo el perimetro
	public double perimetroRec() {
		double per = 0.0;
		per = ((this.base + this.altura) * 2);
		return per;
	}

	// Calculo la superficie de un rectangulo
	public double superficieRec() {
		double sup = 0.0;
		sup = ((this.base * this.altura) / perimetroRec());
		return sup;

	}

	// Dibujar rectangulo
	public void dibujarRec() {
		// Fila superior
		for (int i = 0; i < this.base; i++) {
			System.out.print("*");
		}
		System.out.println();

		// Centro del cuadrado
		for (int i = 0; i < this.altura; i++) {
			System.out.print("*");

			for (int j = 0; j < this.base - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		// Fila inferior
		for (int i = 0; i < this.base; i++) {
			System.out.print("*");
		}
	}
}
