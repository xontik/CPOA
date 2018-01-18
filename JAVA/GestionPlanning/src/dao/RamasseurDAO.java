package dao;

import entity.Ramasseur;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by xontik on 18/01/2018.
 */
public class RamasseurDAO {

    public static Ramasseur map(ResultSet rs) throws SQLException{
        Ramasseur ramasseur = new Ramasseur();
        ramasseur.setIdEquipe(rs.getInt("idEquipeRamasseur"));
        ramasseur.setIdRamasseur(rs.getInt("idRamasseur"));
        ramasseur.setNom(rs.getString("nom"));
        ramasseur.setPrenom(rs.getString("prenom"));

        return ramasseur;
    }
}
