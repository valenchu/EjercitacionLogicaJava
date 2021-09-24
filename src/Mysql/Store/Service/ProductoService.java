package Mysql.Store.Service;

import java.util.ArrayList;
import java.util.Scanner;

import Mysql.Store.Entity.Producto;
import Mysql.Store.Persistence.EntidadDaoExt;

public class ProductoService {
	EntidadDaoExt ent = new EntidadDaoExt();
	Scanner sn = new Scanner(System.in);

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
		String sql = "SELECT nombre,precio FROM producto WHERE precio = " + "(SELECT MIN(precio) FROM producto)";// Query
																													// //
																													// consult
		ArrayList<String> proo = new ArrayList<>();// create arraylist to stock the producto
		ent.listNameAndPriceMoreCheap(sql, proo);// send sql and arraylist
		proo.forEach(p -> System.out.println(p));// print for the screen the list of product
	}

	public boolean insertAProductInDB() {
		boolean result = false;
		System.out.println("Insert the name of product to input in the table");
		String name = sn.nextLine();
		double price = 0D;
		int manufactureID = 0;
		do {
			try {// verify is a number double and no letter

				System.out.println("Insert the price of product to input in the table");
				price = sn.nextDouble();
				result = true;
			} catch (Exception e) {
				System.out.println("Error in the number, insert another one");
				result = false;
				sn.nextLine();
			}
		} while (result != true);
		do {
			try {// verify is a number in and no letter
				sn.nextLine();
				System.out.println("Select a manufacturers the next list");
				callListManufacture();
				System.out.println("Insert a manufacturers id in the next var");
				manufactureID = sn.nextInt();
				result = true;
			} catch (Exception e) {
				System.out.println("Error in the number, insert another one");
				result = false;
				sn.next();
			}
		} while (result != true);
		// create query
		String sql = "INSERT INTO producto (nombre,precio,codigo_fabricante) VALUES (?,?,?)";
		// send query with parametters
		ent.insertAProductInDB(sql, name, price, manufactureID);
		return result;
	}

	public void callListManufacture() {// call this method for show the id manufacture and name manufacture
		String sql = "SELECT * FROM fabricante";// Query // consult
		ArrayList<String> proo = new ArrayList<>();// create arraylist to stock the producto
		ent.listOfManufacture(sql, proo);// send sql and arraylist
		proo.forEach(p -> System.out.println(p));// print for the screen the list of product
	}

	public void insertAManufactureInDB() {
		System.out.println("Insert the name of manufacturer to add");
		String name = sn.nextLine();
		String sql = "INSERT INTO fabricante (nombre) VALUES (?)";
		ent.insertAManufactureInDB(sql, name);
	}

	public void callListProduct() {// call this method for show the product list
		String sql = "SELECT * FROM producto";// Query // consult
		ArrayList<String> proo = new ArrayList<>();// create arraylist to stock the producto
		ent.listOfProduct(sql, proo);// send sql and arraylist
		proo.forEach(p -> System.out.println(p));// print for the screen the list of product
	}

	public boolean updateProduct() {
		boolean result = false;
		callListProduct();
		int idCodeManufacture = 0, idCode = 0;
		double price = 0;
		System.out.println("Insert the name to modify");// solicite the name of product to modify
		String name = sn.nextLine();
		do {
			try {// Solicite the price of producto to modify
				System.out.println("Insert the price of product to modify");
				price = sn.nextDouble();
				result = true;
			} catch (Exception e) {
				result = false;
				System.out.println("Error in the number, insert another one " + e.getMessage());
				sn.nextLine();
			}
		} while (result != true);
		do {
			try {// Solicite the idcode of producto to modify
				System.out.println("Insert id code  of the row to modify");
				idCode = sn.nextInt();
				result = true;
			} catch (Exception e) {
				result = false;
				System.out.println("Error in the number, insert another one " + e.getMessage());
				sn.next();
			}
		} while (result != true);
		do {
			try {// Solicite the code manudacturer of producto to modify
				callListManufacture();// i call the manufacturers list for i view which one am I going to modify
				System.out.println("Insert code of manufacture to modify");
				idCodeManufacture = sn.nextInt();
				result = true;
			} catch (Exception e) {
				result = false;
				System.out.println("Error in the number, insert another one " + e.getMessage());
				sn.next();
			}
		} while (result != true);
		String sql = "UPDATE producto set nombre = ?, precio = ?, codigo_fabricante = ? WHERE codigo = ?";
		ent.updateProduct(sql, name, price, idCodeManufacture, idCode);
		return result;
	}
}
