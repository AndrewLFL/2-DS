package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException {    
       
       String driver = "com.mysql.jdbc.Driver"; 
       String url = "jdbc:mysql://143.106.241.3:3306/cl202230";
       String usuario = "cl202230";
       String senha = "NamesCode";
       
       Class.forName(driver);
       return DriverManager.getConnection(url, usuario, senha); 
    }
}
