package UMLAsociacion.PerroPersona1;

public class Perro {
//Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
	// Atributo
	private String nombre;
	private String raza;
	private Integer edad;
	private String tamano;

	// Costructor
	public Perro(String nombre, String raza, Integer edad, String tamano) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.tamano = tamano;
	}

	public Perro(String nombre, String raza, Integer edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public Perro() {
	}

	// GetterSetters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Perro [nombre= " + nombre + ", raza= " + raza + ", edad= " + edad + ", tamaño= " + tamano + "]";
	}

}
