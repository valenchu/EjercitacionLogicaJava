package Mysql;

import java.sql.Connection;
import java.sql.SQLException;

import Mysql.Conection.ConnectionPool;
import Mysql.Store.StoreEjecutor;

public class MainEjecutor {

	public static void main(String[] args) {
		// TEST CONNECTION
//		try {
//
//			Connection c = ConnectionPool.getInstance().getConnection();
//			if (c != null) {
////				System.out.println("conectado ");
//				ConnectionPool.getInstance().closeConnection(c);
//			} else {
//				System.out.println("No conectado");
//			}
//
//		} catch (SQLException ex) {
//			System.out.println(ex.getMessage());
//		}
		StoreEjecutor.ejecutorStore();

	}

}
