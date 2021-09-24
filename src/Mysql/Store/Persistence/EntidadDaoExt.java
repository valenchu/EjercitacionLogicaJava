package Mysql.Store.Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import Mysql.Conection.ConnectionPool;
import Mysql.Store.Entity.Producto;

public class EntidadDaoExt {

	// A List the name of all the products in the product table
	public void listAllNameProduct(String sql, ArrayList<String> proo) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		try {
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ResultSet rs = ps.executeQuery();// Execute sql, for insert the execute is executeUpdate
			while (rs.next()) {// resort the all row of DB
				// down insert name data in the string
				String nombre = rs.getString("nombre");
				// add the string nombre at list
				proo.add(nombre);
			}
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	LIST THE  NAME AND THE PRICE OF ALL PRODUCT OF THE TABLE PRODUCT
	public void listAllNameAndPrecieProduct(String sql, ArrayList<String> proo) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		try {
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ResultSet rs = ps.executeQuery();// Execute sql, for insert the execute is executeUpdate
			while (rs.next()) {// resort the all row of DB
				// down insert name data in the string
				String nombre = rs.getString("nombre");
				String precie = String.valueOf(rs.getDouble("precio"));
				// add the string nombre at list
				proo.add(nombre + " // " + precie);
			}
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// TO LIST THOSE PRODUCT WHAT YOUR PRICE IS BETWEEN 120 AND 202
	public void toListProductBetween(String sql, ArrayList<String> proo) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		try {
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ResultSet rs = ps.executeQuery();// Execute sql, for insert the execute is executeUpdate
			while (rs.next()) {// resort the all row of DB
				// down insert name data in the string
				String nombre = rs.getString("nombre");
				String precie = String.valueOf(rs.getDouble("precio"));
				// add the string nombre at list
				proo.add(nombre + " // " + precie);

			}
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// SEARCH AND TO LIST ALL THE LAPTOPS OF THE PRODUCT TABLE
	public void searchLaptopsProduct(String sql, ArrayList<String> proo) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		try {
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ResultSet rs = ps.executeQuery();// Execute sql, for insert the execute is executeUpdate
			while (rs.next()) {// resort the all row of DB
				// down insert name data in the string
				String nombre = rs.getString("nombre");
				// add the string nombre at list
				proo.add(nombre);
			}
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// LIST TO THE NAME AND THE PRICE OF PRODUCT MORE CHEAP
	public void listNameAndPriceMoreCheap(String sql, ArrayList<String> proo) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		try {
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ResultSet rs = ps.executeQuery();// Execute sql, for insert the execute is executeUpdate
			while (rs.next()) {// resort the all row of DB
				// down insert name data in the string
				String nombre = rs.getString("nombre");
				String precie = String.valueOf(rs.getDouble("precio"));
				// add the string nombre at list
				proo.add(nombre + " // " + precie);
			}
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
