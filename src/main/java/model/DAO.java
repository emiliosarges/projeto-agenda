package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/** Módulo de conexão **/
	// Parâmetros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver"; //funciona somente se o driver estiver na pasta lib
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";
	// Método de conexão
	private Connection conectar() { //ctrl + shift + O para importar uma classe no Eclipse
		Connection con = null;
		try {
			Class.forName(driver); //Busca informação da variável "driver" criado nos parâmetros. 
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	// teste de conexão
	public void testeConexao() {
		try {
			Connection con = conectar ();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
