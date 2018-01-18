package dao;

import entity.Arbitre;
import entity.Terrain;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by xontik on 18/01/2018.
 */
public class TerrainDAO {


    public ArrayList<Terrain> getAll(){
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Terrain> list = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("SELECT * FROM Terrain");
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

    public Terrain map(ResultSet rs) throws SQLException{
        Terrain terrain = new Terrain();
        terrain.setCapacite(rs.getInt("capacite"));
        terrain.setIdTerrain(rs.getInt("idTerrain"));
        terrain.setNom(rs.getString("nom"));
        terrain.setNumero(rs.getInt("numero"));
        return terrain;
    }
}
