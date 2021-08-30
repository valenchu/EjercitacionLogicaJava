package Colecciones.Pais;

import java.util.TreeSet;

public class Pais implements Comparable<Pais> {// Implemento comparable para comparar datos
	// Atributos
	private String nombrePais;

	// Construuctor
	public Pais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public Pais() {
	}

	// GeterAndSetter
	public String getNombrePais() {
		return nombrePais;
	}

	@Override
	public int hashCode() {// Cambia el hshcode del objheto para que no hallan iguales
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombrePais == null) ? 0 : nombrePais.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {// Si 2 objetos son iguales muestra solamente uno
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (nombrePais == null) {
			if (other.nombrePais != null)
				return false;
		} else if (!nombrePais.equals(other.nombrePais))
			return false;
		return true;
	}

	@Override
	public int compareTo(Pais o) {// Comparo los objetos para ordenarlos alfabeticamente!
		// TODO Auto-generated method stub
		return this.nombrePais.compareToIgnoreCase(o.getNombrePais());
	}

	public TreeSet<Pais> eliminarPais(TreeSet<Pais> pi, String n) {// Metodo que elimina pis de la lista
		java.util.Iterator<Pais> it = pi.iterator();// Creo un iterator para recorrer la lista
		while (it.hasNext()) {// Recorro la lista
			Pais nom = it.next();// Guardo los datos mientras recorro
			if (nom.getNombrePais().equalsIgnoreCase(n)) {// en la recorrica comparo con n que es el nombre del pais a
															// eliminar
				it.remove();// Si se cumple elimina el pais de la lista
			}

		}
		return pi;// Retorno la lista para tenerla actualizada en el main

	}

}
