package dao;

import entity.Arbitre;
import entity.Journee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 * Created by xontik on 18/01/2018.
 */
public class JourneeDAO {

    public ArrayList<Journee> getAll(){
        ArrayList<Journee> journees = new ArrayList<>();
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM Journee");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                journees.add(map(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionSQL.closeConnexion();
        return journees;
    }

    public Journee map(ResultSet rs) throws SQLException{
        Journee journee = new Journee();
        journee.setDateJournee(Instant.ofEpochMilli(rs.getDate("dateJournee").getTime()).atZone(ZoneId.systemDefault()).toLocalDate());
        journee.setIdJournee(rs.getInt("idJournee"));
        return  journee;
    }
}
