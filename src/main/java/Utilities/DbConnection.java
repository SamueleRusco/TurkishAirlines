package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

	private Connection connection;

	public static DbConnection shared;

	private DbConnection() {
	}

	// BLOCCO DI INIZIALIZZAZIONE STATICA
	// crea l'istanza condivisa della classe la prima
	// volta che viene chiamato e la memorizza nella variabile shared
	static {
		try {
			shared = new DbConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// create properties
	private Properties getProperties() throws IOException, ClassNotFoundException, SQLException {
		Properties prop = new Properties();
		FileInputStream in = new FileInputStream(
				"C:\\Users\\samue\\eclipse_workspace_3\\TurkishAirlines\\src\\main\\java\\Utilities\\dbConnection.properties");
		prop.load(in);
		in.close();

		return prop;
	}

	/**
	 * Connect to the database
	 * 
	 * @param req
	 * 
	 * @return Connection
	 */

	public Connection connect() {
		if (connection == null) {
			try {
				// Rimuovi questa riga
				// Class.forName(DATABASE_DRIVER);

				// Usa direttamente le chiavi dal file .properties
				Properties prop = getProperties();

				String drivers = prop.getProperty("Dname");
				String connectionURL = prop.getProperty("URL");
				String username = prop.getProperty("Uname");
				String password = prop.getProperty("password");
				String serverTimezone = prop.getProperty("serverTimezone");
				Class.forName(drivers);

				connection = DriverManager.getConnection(connectionURL + "?serverTimezone=" + serverTimezone, username,
						password);
				System.out.println("Connection Successful");
			} catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

	/**
	 * Disconnect database
	 */
	public void disconnect() {
		if (connection != null) {
			try {
				connection.close();

				connection = null;

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
