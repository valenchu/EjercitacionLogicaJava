package Mysql.Store.Entity;

public class Fabricante {
	// Attributes located of DB
	private Integer codigo;
	private String nombre;

	// Full constructor
	public Fabricante(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	// Empty Constructor
	public Fabricante() {
	}

	// Getters and Setters
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Method
	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
