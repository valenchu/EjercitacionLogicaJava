package Mysql.Store.Service;

import java.util.ArrayList;

import Mysql.Store.Entity.Producto;
import Mysql.Store.Persistence.EntidadDaoExt;

public class ProductoService {
	EntidadDaoExt ent = new EntidadDaoExt();

	public void listAllProduct() {//call the consult ubicate in the EntidadDaoExt
		String sql = "SELECT * FROM producto";//Query consult
		ArrayList<Producto> proo = new ArrayList<>();//create arraylist to stock the producto
		ent.listAllProduct(sql, proo);//send sql and arraylist
		proo.forEach(p -> System.out.println(p));//print for the screen the list of product
	}

}
