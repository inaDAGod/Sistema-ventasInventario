package ventasInventario.BD;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
	static final String DB_URL = "jdbc:postgresql://localhost/Nea"; 
	static final String USER = "postgres";
	static final String PASS = "admi";
	//siempre se debe crear el path descargando de https://jdbc.postgresql.org/download/
	//para java version 8 y agregar el jar al proyecto :)
	//Conexion c = new Conexion();
	//c.getConexionPostgres();

	public Connection getConexionPostgres()  {
		Connection conn = null;
		try {
			conn =  DriverManager.getConnection(DB_URL, USER, PASS);
			
		}catch(SQLException ex){
			System.out.println("No se pudo conectar con la base de datos" +ex);
			return null;
		}
		System.out.println("Conexion exitosa");
		return conn;
		
	}

}
