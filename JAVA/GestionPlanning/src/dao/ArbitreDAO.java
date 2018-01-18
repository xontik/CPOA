package dao;

import entity.Arbitre;
import entity.Nationalite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by xontik on 16/01/2018.
 */
public class ArbitreDAO {

    public static Arbitre map(ResultSet rs) throws SQLException{
        Arbitre arbitre = new Arbitre();
        arbitre.setIdArbitre(rs.getInt("idArbitre"));
        arbitre.setNationalite(NationaliteDAO.map(rs));
        arbitre.setNom(rs.getString("nom"));
        arbitre.setType(rs.getString("type"));
        arbitre.setPrenom(rs.getString("prenom"));
        return arbitre;
    }
    public ArrayList<Arbitre> getAll() {
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Arbitre> list = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("SELECT * FROM Arbitre JOIN Nationalite using(idNationalite) ORDER BY nom");
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

    public boolean update(ArrayList<Arbitre> arbitres){

        return true;

    }



}
