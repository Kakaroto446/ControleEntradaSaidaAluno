package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static String connectionDriverClass="com.mysql.jdbc.Driver";			
	public static String connectionUrl = "jdbc:mysql://localhost/banco";
	public static String connectionUsername="root";
	public static String connectionPassword="";
	public static Connection conn;				
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException		
	{
		
		if(Conexao.conn != null) 
		{
			return Conexao.conn;
		}else
		{
			Class.forName(connectionDriverClass);		
			return DriverManager.getConnection(			
					Conexao.connectionUrl,
					Conexao.connectionUsername,					
					Conexao.connectionPassword);
		}
		}
}