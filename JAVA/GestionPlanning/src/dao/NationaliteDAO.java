package dao;

import entity.Nationalite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by xontik on 16/01/2018.
 */
public class NationaliteDAO {

    public ArrayList<Nationalite> getAll(){
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Nationalite> list =  new ArrayList<>();
        try{
            stmt = conn.prepareStatement("SELECT * FROM Nationalite");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {

                list.add(map(rs));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ConnectionSQL.closeConnexion();
        return list;
    }

    public static Nationalite map(ResultSet rs) throws SQLException{
        Nationalite nat = new Nationalite();
        nat.setIdNationalite(rs.getInt("idNationalite"));
        nat.setShortName(rs.getString("shortName"));
        nat.setFullName(rs.getString("fullName"));

        return nat;
    }

}
