package Mysql.Store;

import java.util.Scanner;

import Mysql.Store.Service.ProductoService;

public class StoreEjecutor {
	

	public static void ejecutorStore() {
		boolean test = false;
		do {
			head();
			Scanner sn = new Scanner(System.in);
			String data = sn.nextLine();
			test = selected(data);
		} while (test != true);
	}
	//Show the menu
	public static void head() {
		System.out.println("---MENU STORE---");
		System.out.println("WHAT DO YOU WISH DO?");
		System.out.println("SELECT A OPTION PLS. IF YOU WISH EXIT THE APP SELECT 0");
		System.out.println("A = LIST THE  NAME  OF ALL PRODUCT THERE IS IN THE TABLE PRODUCT");
		System.out.println("EXIT APP = 0");
	}

	// Verific all data
	public static boolean selected(String data) {
		boolean verificNumber = false, verificLetter = false;
		if (isLetter(data)) {//if is a lleter call options 
			System.out.println("is a letter");
			options(data);//option is te call all the consult solicited in the exercite
			verificLetter = true;
		}
		if (isNumber(data) && data.equals("0")) {//if is a number call exit menu
			System.out.println("is a number");
			verificNumber = true;
		}
		if (!verificLetter && !verificNumber) {//if isn't a number and letter repeat the menu
			System.out.println("----ERROR DATA, INSERT THE CORRECT VALUE PLS----");
		}
		return verificNumber;

	}

	// Menu options
	public static void options(String data) {
		ProductoService pro = new ProductoService();
		data = data.toLowerCase();
		switch (data) {
		case "a":
			pro.listAllProduct();//call the list producto ubicated in the prodcut service
			break;

		default:
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
