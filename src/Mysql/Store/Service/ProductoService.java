package Mysql.Store.Service;

import java.util.ArrayList;

import Mysql.Store.Entity.Producto;
import Mysql.Store.Persistence.EntidadDaoExt;

public class ProductoService {
	EntidadDaoExt ent = new EntidadDaoExt();

	public void listAllNameProduct() {// call the consult ubicate in the EntidadDaoExt
		String sql = "SELECT nombre FROM producto";// Query consult
		ArrayList<String> proo = new ArrayList<>();// create arraylist to stock the producto
		ent.listAllNameProduct(sql, proo);// send sql and arraylist
		proo.forEach(p -> System.out.println(p));// print for the screen the list of product
	}

	public void listAllNameAndPrecieProduct() {// call the consult ubicate in the EntidadDaoExt
		String sql = "SELECT nombre,precio FROM producto";// Query consult
		ArrayList<String> proo = new ArrayList<>();// create arraylist to stock the producto
		ent.listAllNameAndPrecieProduct(sql, proo);// send sql and arraylist
		proo.forEach(p -> System.out.println(p));// print for the screen the list of product
	}

	public void toListProductBetween() {
		String sql = "SELECT nombre,precio FROM producto WHERE precio BETWEEN 120 and 202";// Query consult
		ArrayList<String> proo = new ArrayList<>();// create arraylist to stock the producto
		ent.toListProductBetween(sql, proo);// send sql and arraylist
		proo.forEach(p -> System.out.println(p));// print for the screen the list of product
	}

	public void searchLaptopsProduct() {
		String sql = "SELECT nombre FROM producto WHERE nombre LIKE 'portatil%'";// Query consult
		ArrayList<String> proo = new ArrayList<>();// create arraylist to stock the producto
		ent.searchLaptopsProduct(sql, proo);// send sql and arraylist
		proo.forEach(p -> System.out.println(p));// print for the screen the list of product
	}

	public void listNameAndPriceMoreCheap() {
		String sql = "SELECT nombre,precio FROM producto WHERE precio = "
				+ "(SELECT MIN(precio) FROM producto)";// Query consult
		ArrayList<String> proo = new ArrayList<>();// create arraylist to stock the producto
		ent.listNameAndPriceMoreCheap(sql, proo);// send sql and arraylist
		proo.forEach(p -> System.out.println(p));// print for the screen the list of product
	}
}
