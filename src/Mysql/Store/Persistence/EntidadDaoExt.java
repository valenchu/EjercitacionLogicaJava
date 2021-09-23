package Mysql.Store.Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Mysql.Conection.ConnectionPool;
import Mysql.Store.Entity.Producto;

public class EntidadDaoExt {

	// List the name of all the products in the product table
	public void listAllProduct(String sql, ArrayList<Producto> proo) {
		Connection con = ConnectionPool.getInstance().getConnection(); // Obtain the connection
		try {
			Producto pro = null;//Create object of the product

			PreparedStatement ps = con.prepareStatement(sql);//prepare sentence SQL
			ResultSet rs = ps.executeQuery();//Execute sql, for insert the execute is executeUpdate
			while (rs.next()) {//resort the all row of DB
				pro = new Producto();//inicialize objet
				//down insert all the data in the object
				pro.setCodigo(rs.getInt("codigo"));
				pro.setCodigoFabricante(rs.getInt("codigo_fabricante"));
				pro.setNombre(rs.getString("nombre"));
				pro.setPrecio(rs.getDouble("precio"));
				// add the object the list
				proo.add(pro);
			}
			ConnectionPool.getInstance().closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
