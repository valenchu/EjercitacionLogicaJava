package POO;

import java.util.Scanner;

public class OperacionEjer3POO {
	// Atributos
	private Double num1 = 0.0, num2 = 0.0;

	// Costructor lleno
	public OperacionEjer3POO(Double num1, Double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Construcotr vacio
	public OperacionEjer3POO() {
	}

	// GetterAndSetters
	public Double getNum1() {
		return num1;
	}

	public void setNum1(Double num1) {
		this.num1 = num1;
	}

	public Double getNum2() {
		return num2;
	}

	public void setNum2(Double num2) {
		this.num2 = num2;
	}

	// Metodos
	// Inserto datos en los atributos de la clase
	public void crearOperacion() {
		Scanner sc = new Scanner(System.in);
		// solicito numero 1
		System.out.println("Ingrese numero 1");
		// cargo en la variable
		double num1 = sc.nextDouble();
		// inserto variable en atributo de clase
		this.num1 = num1;
		// solicito numero 2
		System.out.println("Ingrese numero 2");
		// cargo en la variable
		double num2 = sc.nextDouble();
		// inserto variable en el atributo de clase
		this.num2 = num2;
	}

	// Suma de numeros
	public double sumar() {
		double suma;
		suma = ((this.num1 + this.num2));
		return suma;
	}

	// resta de numeros
	public double restar() {
		double resta;
		resta = ((this.num1 - this.num2));
		return resta;
	}

	// multiplicacion de los numeros
	public double multiplicar() {
		double multi = 0.0;
		if (this.num1 == 0.0 || this.num2 == 0.0) {
			return multi = 0.0;
		} else {
			multi = ((this.num1 * this.num2));
			return multi;
		}
	}

	// division de los numeros
	public double dividir() {
		double div = 0.0;
		if (this.num1 == 0.0 || this.num2 == 0.0) {
			return div = 0.0;
		} else {
			div = ((this.num1 / this.num2));
			return div;
		}
	}

	// Metodo llamada que realiza las operaciones dependiendo del numero que se
	// ingresa
	public int llamadas(int numero) {
		switch (numero) {
		case 1:
			System.out.println("La SUMA de los numeros es :" + sumar());
			break;

		case 2:
			System.out.println("La RESTA de los numeros es: " + restar());
			break;

		case 3:
			double result = multiplicar();
			if (result == 0.0) {
				System.out.println("Uno o mas numeros de los ingresados es igual a CERO");

			} else {
				System.out.println("La MULTIPLICACION de los numeros es: " + multiplicar());

			}
			break;
		case 4:
			double result2 = dividir();
			if (result2 == 0.0) {
				System.out.println("Uno o mas numeros de los ingresados es igual a CERO");

			} else {
				System.out.println("La DIVISION de los numeros es: " + dividir());

			}
			break;
		default:
			if (numero != 0) {
				System.out.println("No se encontro operacion a realizar con ese numero");
				return numero;
			}
		}
		return numero;

	}

}
