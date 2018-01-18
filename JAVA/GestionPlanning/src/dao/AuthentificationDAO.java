package dao;

import App.Hasher;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by xontik on 15/01/2018.
 */
public class AuthentificationDAO {
    public enum TypePersonne {admin, joueur, jb}

    public boolean isAdmin(String login, String pwd){
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        boolean admin = false;
        try{
            stmt = conn.prepareStatement("SELECT * FROM Admin WHERE login = ? AND password = ?");
            stmt.setString(1, login);
            stmt.setString(2, pwd);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                admin =  true;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ConnectionSQL.closeConnexion();
        return admin;
    }
    public boolean isJoueur(String nom, String prenom, String pwd){
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        boolean joueur = false;
        try{
            stmt = conn.prepareStatement("SELECT * FROM Joueur WHERE UPPER(nom) = UPPER(?) AND UPPER(prenom) = UPPER(?) AND password = ?");
            stmt.setString(1, nom);
            stmt.setString(2, prenom);
            stmt.setString(3, pwd);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                joueur =  true;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ConnectionSQL.closeConnexion();
        return joueur;
    }



    public TypePersonne getPrivilege(String login, String pwd) {
        pwd = Hasher.sha256(pwd);
        if (!login.contains(".")){
            if (isAdmin(login,pwd)) {
                return TypePersonne.admin;
            }
        } else{
            String[] splitted = login.split("\\.");
            String nom = splitted[0];
            String prenom = splitted[1];

            if (isJoueur(nom,prenom,pwd)){
                return TypePersonne.joueur;
            }
        }
        if(login.equals("JB")){
            return TypePersonne.jb;
        }
        return null;
    }
}
