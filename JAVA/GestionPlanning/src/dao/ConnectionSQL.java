package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQL {
    private static String url = "jdbc:mysql://iutdoua-web.univ-lyon1.fr/p1502484";
    private static String accountName = "p1502484";
    private static String password = "240617";
    private static java.sql.Connection connexion;

    public static java.sql.Connection getConnection() {
        if (connexion == null){
            try {
                connexion = DriverManager.getConnection(url, accountName, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connexion ;
    }

    public static void closeConnexion() {
        try {
            connexion.close();
            connexion = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
