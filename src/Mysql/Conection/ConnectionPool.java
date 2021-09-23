package Mysql.Conection;

import java.awt.Window;
import java.io.Console;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.tools.JavaCompiler;

import org.apache.commons.dbcp2.BasicDataSource;

import com.mysql.cj.xdevapi.PreparableStatement;

import Mysql.MainEjecutor;

public class ConnectionPool {

	// Atributter for data of BD
	Scanner sn = new Scanner(System.in);

	private final String NAME_TABLE;
	private final String PORT = "3306";
	private final String URL;
	private final String USER = "root";
	private final String PASSWORD;

	// Object private connection pool
	private static ConnectionPool dataSource;
	// Create basic data source this permite creat the pool of connection
	private static BasicDataSource basicDataSource = null;

	public ConnectionPool() {
		System.out.println("Inserte the name of talbe BD");
		NAME_TABLE = sn.next();

		URL = "jdbc:mysql://localhost:" + PORT + "/" + NAME_TABLE
				+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		// Entry the parammeter of connection
		System.out.println("Insert the password, for connection");
		PASSWORD = sn.next();
		// Create object of basicdatasource
		basicDataSource = new BasicDataSource();
		// Get into the connector driver obtaing of the libraries
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		// Get into the user, password and url for generated the connection of the data
		// base
		basicDataSource.setUsername(USER);
		basicDataSource.setPassword(PASSWORD);
		basicDataSource.setUrl(URL);

		// ---- This options are optional ----
		// Minimum connections inactive that can there are setMinIdle(5)
		basicDataSource.setMinIdle(5);
		// Maximum connections inactive that can there are setMaxIdle(20);
		basicDataSource.setMaxIdle(20);
		// Total connections active and inactive that can there are
		basicDataSource.setMaxTotal(50);
		// Waiting time to release a connection -1 is infinite
		basicDataSource.setMaxWaitMillis(-1);

	}

	// Return a instance of the clase is this instance exist return the same
	// instance
	public static ConnectionPool getInstance() {
		if (dataSource == null) {
			return dataSource = new ConnectionPool();

		} else {
			return dataSource;
		}
	}

	// Method for obtain the connectio of the DB
	public Connection getConnection() {
		Connection connect = null;
		try {
			System.out.println("Connection CONNECTED");
			connect = this.basicDataSource.getConnection();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connect;
	}

	// Method for close the connection DB
	public void closeConnection(Connection connection) throws SQLException {
		System.out.println("Connection CLOSE");
		connection.close();
	}

	// Abilite the auto commit in bd
	public void autoCommit(boolean autoCommit) {
		try {
			getInstance().getConnection().setAutoCommit(autoCommit);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Send the information of query the DB
	public void commit() {
		try {
			getInstance().getConnection().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Undo the sql query send to DB
	public static void rollBack() {
		try {
			getInstance().getConnection().rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
