package com.ufc.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Factory {
	private final String Ip = "localhost";
	private final Integer Port = 5432;
	private final String User = "postgres";
	private final String Password = "9209";
	private final String Database = "JogoForca_PDS";

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:postgresql://" + Ip + ":" + Port + "/" + Database, User, Password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}