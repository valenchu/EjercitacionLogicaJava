package Mysql.Store.Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Mysql.Conection.ConnectionPool;

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

	public void insertAProductInDB(String sql, String name, double price, int manufactureID) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		try {
			ConnectionPool.getInstance().autoCommit(con, false);
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ps.setString(1, name);// insert data for parameters
			ps.setDouble(2, price);
			ps.setInt(3, manufactureID);
			// Execute sql, for insert the execute is executeUpdate
			ps.executeUpdate();
			ConnectionPool.getInstance().commit(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ConnectionPool.getInstance().rollBack(con);
			e.printStackTrace();
		}
		ConnectionPool.getInstance().autoCommit(con, true);
		try {
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// List of manufacture
	public void listOfManufacture(String sql, ArrayList<String> proo) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		System.out.println("-----LIST MANUFACTURE-----");
		try {
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ResultSet rs = ps.executeQuery();// Execute sql, for insert the execute is executeUpdate
			while (rs.next()) {// resort the all row of DB
				// down insert name data in the string
				int idManufacture = rs.getInt("codigo");
				String name = rs.getString("nombre");
				// add the string nombre at list
				proo.add("Codigo: " + String.valueOf(idManufacture) + " Fabricante: " + name);
			}
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// List of product
	public void listOfProduct(String sql, ArrayList<String> proo) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		System.out.println("-----LIST PRODUCT-----");
		try {
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ResultSet rs = ps.executeQuery();// Execute sql, for insert the execute is executeUpdate
			while (rs.next()) {// resort the all row of DB
				// down insert name data in the string
				String idProducto = rs.getString(String.valueOf("codigo"));
				String name = rs.getString("nombre");
				String price = rs.getString(String.valueOf("precio"));
				String codMan = rs.getString(String.valueOf("codigo_fabricante"));
				// add the string nombre at list
				proo.add("Codigo: " + idProducto + " Producto: " + name + " Precio: " + price + " CodFab: " + codMan);
			}
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// INSERT A MANUFACTURER IN THE DATA BASE TABLE MANUFACTURER
	public void insertAManufactureInDB(String sql, String name) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		try {
			ConnectionPool.getInstance().autoCommit(con, false);
			PreparedStatement ps = con.prepareStatement(sql);// prepare sentence SQL
			ps.setString(1, name);// insert data for parameters
			// Execute sql, for insert the execute is executeUpdate
			ps.executeUpdate();
			ConnectionPool.getInstance().commit(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ConnectionPool.getInstance().rollBack(con);
			e.printStackTrace();
		}
		ConnectionPool.getInstance().autoCommit(con, true);
		try {
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// EDIT A PRODUCT WITH DATA TO ELECTION
	public void updateProduct(String sql, String name, double price, int idCodeManufacture, int idCode) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		PreparedStatement ps;
		try {
			// "UPDATE producto set nombre = ?, precio = ?, codigo_fabricante = ? WHERE
			// codigo = ?";
			// prepare sentence SQL
			ps = con.prepareStatement(sql);
			// insert data for parameters
			ps.setString(1, name);
			ps.setDouble(2, price);
			ps.setInt(3, idCodeManufacture);
			ps.setInt(4, idCode);
			// Execute sql, for insert the execute is executeUpdate
			ps.executeUpdate();
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
