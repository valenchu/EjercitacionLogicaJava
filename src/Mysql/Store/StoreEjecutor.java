package Mysql.Store;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import Mysql.Conection.ConnectionPool;
import Mysql.Store.Service.ProductoService;

public class StoreEjecutor {

	public static void ejecutorStore() {
		boolean test = false;
		do {
			Connection con = ConnectionPool.getInstance().getConnection();
			try {
				ConnectionPool.getInstance().closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			head();
			Scanner sn = new Scanner(System.in);
			String data = sn.nextLine();
			test = selected(data);
		} while (test != true);
	}

	// Show the menu
	public static void head() {
		System.out.println("---MENU STORE---");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("WHAT DO YOU WISH DO?");
		System.out.println("SELECT A OPTION PLS. IF YOU WISH EXIT THE APP SELECT 0");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("A = TO LIST THE  NAME  OF ALL PRODUCT THERE IS IN THE PRODUCT TABLE");
		System.out.println("B = TO LIST THE  NAME AND THE PRICE OF ALL PRODUCT OF THE PRODUCT TABLE");
		System.out.println("C = TO LIST THOSE PRODUCT WHAT YOUR PRICE IS BETWEEN 120 AND 202");
		System.out.println("D = SEARCH AND TO LIST ALL THE LAPTOPS OF THE PRODUCT TABLE");
		System.out.println("E = LIST TO THE NAME AND THE PRICE OF PRODUCT MORE CHEAP");
		System.out.println("F = INSERT A PRODUCT IN THE DATA BASE TABLE PRODUCT");
		System.out.println("G = INSERT A MANUFACTURER IN THE DATA BASE TABLE MANUFACTURER");
		System.out.println("H = EDIT A PRODUCT WITH DATA TO ELECTION");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("EXIT APP = 0");
	}

	// Verific all data
	public static boolean selected(String data) {
		boolean verificNumber = false, verificLetter = false;
		if (isLetter(data)) {// if is a lleter call options
			System.out.println("is a letter");
			options(data);// option is te call all the consult solicited in the exercite
			verificLetter = true;
		}
		if (isNumber(data) && data.equals("0")) {// if is a number call exit menu
			System.out.println("is a number");
			verificNumber = true;
		}
		if (!verificLetter && !verificNumber) {// if isn't a number and letter repeat the menu
			System.out.println("----ERROR DATA, INSERT THE CORRECT VALUE PLS----");
		}
		return verificNumber;

	}

	// Menu options
	public static void options(String data) {
		ProductoService pro = new ProductoService();
		boolean ver = false;
		data = data.toLowerCase();
		switch (data) {
		case "a":
			pro.listAllNameProduct();// call the list producto name ubicated in the prodcut service
			break;
		case "b":
			pro.listAllNameAndPrecieProduct();// call the list producto name and precie ubicated in the prodcut service
			break;
		case "c":
			pro.toListProductBetween();// call the list producto what your precie between 120 and 202 ubicated in the
										// prodcut service
			break;
		case "d":
			pro.searchLaptopsProduct();// call the list producto name with portatil ubicated in the prodcut service
			break;
		case "e":
			pro.listNameAndPriceMoreCheap();// call the list producto name and price more cheap ubicated in the prodcut
											// service
			break;
		case "f":
			do {
				ver = pro.insertAProductInDB();// Call to insert product in the service
			} while (ver != true);
			break;
		case "g":
			pro.insertAManufactureInDB();// call to insert manufacturer in the service
			break;
		case "h":
			do {
				ver = pro.updateProduct();// call to update product in the service
			} while (ver != true);
			break;
		default:
			System.out.println("<<<<COMANDO INSERTADO INCORRECTO>>>>");
			break;
		}
	}

	// Method verific is a number
	public static boolean isNumber(String data) {
		boolean ver = false;
		return ver = data.matches("\\d{1}");
	}

	// Method verific is a letter
	public static boolean isLetter(String data) {
		data = data.toLowerCase();
		boolean ver = false;
		ver = data.matches("[a-z]{1}");
		return ver;
	}

}
