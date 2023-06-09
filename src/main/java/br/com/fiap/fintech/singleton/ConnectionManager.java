package br.com.fiap.fintech.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	public static Connection createConnection() {
		Connection conexao = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM97550",
					"030523");
			System.out.println("Conectou!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
}