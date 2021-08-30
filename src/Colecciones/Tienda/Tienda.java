package Colecciones.Tienda;

import java.util.HashMap;
import java.util.Map;

public class Tienda {
	// Atributos
	private String producto;
	private double precio;
	static HashMap<String, Double> listaTienda = new HashMap<>();
	// Costructores

	public Tienda() {
	}

	public Tienda(String producto, double precio, HashMap<String, Double> listaTienda) {
		this.producto = producto;
		this.precio = precio;
		this.listaTienda = listaTienda;
	}

	public Tienda(String producto, double precio) {
		this.producto = producto;
		this.precio = precio;
		this.listaTienda.put(producto, precio);
	}

	// GetterSetter
	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public HashMap<String, Double> getListaTienda() {
		return listaTienda;
	}

	public void setListaTienda(HashMap<String, Double> listaTienda) {
		this.listaTienda = listaTienda;
	}
	// MetodoHasYEqual

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listaTienda == null) ? 0 : listaTienda.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tienda other = (Tienda) obj;
		if (listaTienda == null) {
			if (other.listaTienda != null)
				return false;
		} else if (!listaTienda.equals(other.listaTienda))
			return false;
		if (Double.doubleToLongBits(precio) != Double.doubleToLongBits(other.precio))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		return true;
	}

	public void mostrarProductos() {// Muestro los productos
		this.listaTienda.forEach((k, v) -> System.out.println("Nombre: " + k + " Precio: " + v));
	}

	public void modificarPrecioProducto(double precio, String nom) {
		nom = nom.toLowerCase();
		for (Map.Entry<String, Double> entr : this.listaTienda.entrySet()) {// Uso un for entry para recorrer y
																			// modificar producto
			String clave = entr.getKey().toLowerCase();
			if (clave.equals(nom)) {// Si la clave es igual al nombre que pase por parametro cambio el precio del
									// producto
				this.listaTienda.put(entr.getKey(), precio);
				return;
			}
		}
	}

	public void eliminarProducto(String nom) {
		nom = nom.toLowerCase();
		for (Map.Entry<String, Double> entr : this.listaTienda.entrySet()) {
			String clave = entr.getKey().toLowerCase();
			if (clave.equals(nom)) {// Si la clave es igual al nombre pasado por parametro
				// Borro los datos de la lista
				this.listaTienda.remove(entr.getKey());
				return;
			}
		}
	}

}
