package POO;

import java.util.Arrays;

public class DosArreglosEjer10POO {
	// Atributos
	// Dos arreglo. A de 50 elementos, B de 20 elementeos
	private double[] arregloA = new double[50];
	private double[] arregloB = new double[20];

	// Constructor lleno
	public DosArreglosEjer10POO(double[] arregloA, double[] arregloB) {
		this.arregloA = arregloA;
		this.arregloB = arregloB;
	}

	// Constructor vacio
	public DosArreglosEjer10POO() {
	}

	// GetterAndSetters
	public double[] getArregloA() {
		return arregloA;
	}

	public void setArregloA(double[] arregloA) {
		this.arregloA = arregloA;
	}

	public double[] getArregloB() {
		return arregloB;
	}

	public void setArregloB(double[] arregloB) {
		this.arregloB = arregloB;
	}

	// Metodos varios

	// Lleno arreglo A num aleatorios 1 a 100
	public void llenarArregloA() {
		int tamanoArregloA = this.arregloA.length;
		int tamanoArregloB = this.arregloB.length;
		for (int i = 0; i < tamanoArregloA; i++) {
			this.arregloA[i] = (int) ((Math.random() * 100) + 1);
		}
		System.out.println("---------ARRAY A LLENO DESORDENADO---------");
		System.out.println(Arrays.toString(this.arregloA));
	}

	// Ordeno de menor a mayor arreglo A
	public void ordenarMenorMayor() {
		Arrays.sort(this.arregloA);
		System.out.println("---------ARRAY A ORDENADO---------");
		System.out.println(Arrays.toString(this.arregloA));
	}

	// Metodo copiado a la antigua escuela
	public void copiarDiezPrimerosNumeros() {
		for (int i = 0; i < this.arregloB.length; i++) {
			if (i >= 0 && i <= 9) {
				this.arregloB[i] = this.arregloA[i];
			} else {
				this.arregloB[i] = 0.5;
			}

		}
		System.out.println("---------ARRAY B---------");
		System.out.println(Arrays.toString(this.arregloB));

	}

	// Metodo copiado actual
	public void copiar() {
		//
		this.arregloB = Arrays.copyOf(this.arregloA, 20);
		Arrays.fill(this.arregloB, 10, 20, 0.5);
		System.out.println("---------ARRAY B COPIADO V2---------");
		System.out.println(Arrays.toString(this.arregloB));
	}

}
