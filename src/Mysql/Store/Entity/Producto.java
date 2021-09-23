package Mysql.Store.Entity;

public class Producto {
	// Attributes located of DB
	private Integer codigo;
	private String nombre;
	private Double precio;
	private Integer codigoFabricante;

	// Full constructor
	public Producto(Integer codigo, String nombre, Double precio, Integer codigoFabricante) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.codigoFabricante = codigoFabricante;
	}

	// Empty Constructor
	public Producto() {
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCodigoFabricante() {
		return codigoFabricante;
	}

	public void setCodigoFabricante(Integer codigoFabricante) {
		this.codigoFabricante = codigoFabricante;
	}

	// Method
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", codigoFabricante="
				+ codigoFabricante + "]";
	}

}
