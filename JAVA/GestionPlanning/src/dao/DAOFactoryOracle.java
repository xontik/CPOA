package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactoryOracle {
    private String url = "jdbc:oracle:thin:@134.214.112.67:1521:orcl";
    private String accountName = "p1601530";
    private String password = "266238";
    private Connection connexion;
    
    public DAOFactoryOracle() throws SQLException {
        this.connexion = DriverManager.getConnection(this.url, this.accountName, this.password);
    }
    
    public Connection getConnection() throws SQLException { 
        return this.connexion;
    }
    
    public void closeConnexion() throws SQLException {
        this.connexion.close();
    }
}
