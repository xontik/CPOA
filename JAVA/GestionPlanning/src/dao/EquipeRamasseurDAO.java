package dao;

import entity.EquipeRamasseur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by xontik on 18/01/2018.
 */
public class EquipeRamasseurDAO {

    public ArrayList<EquipeRamasseur> getAll(){
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        ArrayList<EquipeRamasseur> list =  new ArrayList<>();
        try{
            stmt = conn.prepareStatement("SELECT * FROM EquipeRamasseur JOIN RamasseurDeBalle using(idEquipeRamasseur)");
            ResultSet rs = stmt.executeQuery();
            int lastId = 0;
            while(rs.next()) {
                int currentId = rs.getInt("idEquipeRamasseur");
                if(currentId != lastId){
                    list.add(map(rs));
                    lastId = currentId;
                }
                list.get(list.size()-1).addRamasseur(RamasseurDAO.map(rs));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ConnectionSQL.closeConnexion();
        return list;
    }

    public static EquipeRamasseur map(ResultSet rs) throws SQLException{
        EquipeRamasseur equipe = new EquipeRamasseur();
        equipe.setIdEquipe(rs.getInt("idEquipeRamasseur"));
        equipe.setNumEquipe(rs.getInt("numEquipe"));
        equipe.setRamasseurs(new ArrayList<>());

        return equipe;
    }
}
