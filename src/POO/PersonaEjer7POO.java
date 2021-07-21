package POO;

import java.util.Scanner;

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
		System.out.println("---CREANDO PERSONA---");
		System.out.println("Ingrese nombre");
		this.nombre = sn.nextLine();
		try {
			System.out.println("Ingrese edad");
			this.edad = sn.nextInt();
		} catch (Exception e) {
			System.out.println("No ingreso un numero " + e);
			sn.next();
			sn.nextLine();
		}
		boolean prueba = false;
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
		System.out.println("Ingrese el peso");
		this.peso = sn.nextDouble();
		System.out.println("Ingrese la altura");
		this.altura = sn.nextDouble();
	}
}
