package Herencia.Figura;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MenuFigura {

	public static void menuFigura() {
		Scanner sn = new Scanner(System.in);
		NumberFormat fn = new DecimalFormat("0,00");
		String formato = "";
		System.out.println("Ingrese:: || 1 para crear CIRCULO || 2 para crear RECTANGULO ||");
		int num = sn.nextInt();
		if (num == 1) {
			System.out.println("----CREANDO CIRCULO----");
			Circulo c1 = new Circulo();
			System.out.println("Ingrese radio circulo");
			c1.setRadio(sn.nextDouble());
			System.out.println("Ingrese el diametro del circulo");
			c1.setDiametro(sn.nextDouble());
			System.out.println("---CALCULANDO AREA CIRCULO---");
			formato = fn.format(c1.calcularArea());
			System.out.println("El area del circulo ingresado es de == " + formato);
			System.out.println("---CALCULANDO PERIMETRO CIRCULO---");
			formato = fn.format(c1.calcularPerimetro());
			System.out.println("El perimetro del circulo ingresado es de == " + formato);
		} else if (num == 2) {
			System.out.println("----CREANDO RECTANGULO----");
			Rectangulo r1 = new Rectangulo();
			System.out.println("Ingrese altura del rectangulo");
			r1.setAltura(sn.nextDouble());
			System.out.println("Ingrese base del rectangulo");
			r1.setBase(sn.nextDouble());
			System.out.println("---CALCULANDO AREA RECTANGULO---");
			formato = fn.format(r1.calcularArea());
			System.out.println("El area del rectangulo ingresado es de == " + formato);
			System.out.println("---CALCULANDO PERIMETRO RECTANGULO---");
			formato = fn.format(r1.calcularPerimetro());
			System.out.println("El perimetro del rectangulo ingresado es de == " + formato);
		} else {
			System.out.println("INGRESO UN NUMERO FUERA DEL RANGO");
		}
	}

}
