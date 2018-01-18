package dao;

import entity.Arbitre;
import entity.Joueur;
import entity.Journee;
import entity.Nationalite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by xontik on 18/01/2018.
 */
public class JoueurDAO {

    public ArrayList<Joueur> getAll() {
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Joueur> list = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("SELECT * FROM Joueur JOIN Nationalite using(idNationalite) ORDER BY nom");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                list.add(map(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionSQL.closeConnexion();
        return list;
    }

    public static Joueur map(ResultSet rs) throws SQLException{

        Joueur joueur = new Joueur();

        joueur.setClassement(rs.getInt("classement"));
        joueur.setIdJoueur(rs.getInt("idJoueur"));
        joueur.setNationalite(NationaliteDAO.map(rs));
        joueur.setNom(rs.getString("nom"));
        joueur.setPrenom(rs.getString("prenom"));

        return joueur;
    }
}
