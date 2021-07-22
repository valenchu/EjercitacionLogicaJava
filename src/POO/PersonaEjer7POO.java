package POO;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class PersonaEjer7POO {
	// Atributos
	private String nombre;
	private int edad;
	private String sexo;
	private double peso, altura;

	// Constructores
	// lleno
	public PersonaEjer7POO(String nombre, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	// vacio
	public PersonaEjer7POO() {
	}

	// Getters AND Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Metodos varios
	public void crearPersona() {
		Scanner sn = new Scanner(System.in);
		boolean prueba = false;
		System.out.println("---CREANDO PERSONA---");
		System.out.println("Ingrese nombre");
		this.nombre = sn.nextLine();
		// Verifico edad mayor que cero y con el catch q no mande letras
		do {
			try {
				System.out.println("Ingrese edad");
				this.edad = sn.nextInt();
				prueba = (this.edad < 0) ? false : true;
			} catch (Exception e) {
				System.out.println("No ingreso un numero " + e);
				sn.next();
				sn.nextLine();
			}
		} while (prueba == false);
		// Verifico que ingrese bien el sexyo
		do {
			System.out.println("Ingrese su sexo (H = Hombre,M = Mujer, O = Otro)");
			this.sexo = sn.next();
			sn.nextLine();
			this.sexo = this.sexo.toUpperCase();
			prueba = ((this.sexo.equals("M")) || (this.sexo.equals("H")) || (this.sexo.equals("O"))) ? true : false;
			if (prueba == false) {
				System.out.println("Dato sexo incorrecto recuerde ingresar H = Hombre,M = Mujer, O = Otro ");
			}
		} while (prueba == false);
		// Verifico tanto que el peso y altura sean mayor a 0
		// Y verifico que ingrese numeros
		do {
			try {
				System.out.println("Ingrese el peso(EJEMPLO 75,5)");
				this.peso = sn.nextDouble();
				System.out.println("Ingrese la altura(EJEMPLO 1,75)");
				this.altura = sn.nextDouble();
				if (this.peso < 0) {
					prueba = false;
					System.out.println("Peso incorrecto debe ser mayor a 0 ");
				} else if (this.altura < 0) {
					prueba = false;
					System.out.println("Altura incorrecta debe ser mayor a 0 ");
				} else {
					prueba = true;
				}
			} catch (Exception e) {
				System.out.println("Datos ERRONEOS intentelo de nuevo " + e);
				sn.next();
				sn.nextLine();
			}
		} while (prueba == false);
	}

	// Metodo que calcula el IMC de la persona
	public Integer calcularIMC() {
		final int debajoPeso = -1;
		final int normalPeso = 0;
		final int sobrePeso = 1;
		double calculo = this.peso / (this.altura * this.altura);
		if ((calculo > 0) && (calculo < 20)) {
			return debajoPeso;
		} else if ((calculo > 20) && (calculo < 25)) {
			return normalPeso;
		} else {
			return sobrePeso;
		}
	}

	public boolean esMayorDeEdad() {
		boolean result = false;
		int eda = this.edad;
		result = (eda >= 18)?true:false;
		return result;
	}
}
