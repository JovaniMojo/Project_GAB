package com.Gestion;

import java.sql.Connection;
import java.sql.DriverManager;

public class BDconnect {

	public static Connection obtenirConnexion() {
		// TODO Auto-generated method stub
		Connection connection = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/GAB";
			String user = "postgres";
			String passwd = "1234";
			connection  = DriverManager.getConnection(url, user,passwd);
			
			if(connection!=null) {
					
				System.out.println("Connection ok");
			}else {
				System.out.println("Connection failed");
			}
		}catch (Exception e) {
			e.printStackTrace();
			}
		return connection;

	}

}
