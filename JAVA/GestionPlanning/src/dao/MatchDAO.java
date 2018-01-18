package dao;

import entity.Arbitre;
import entity.Journee;
import entity.Match;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 * Created by xontik on 18/01/2018.
 */
public class MatchDAO {


    public static Match map(ResultSet rs) throws SQLException{
        Match match = new Match();
        match.setCompetition(CompetitionDAO.map(rs));
        match.setIdMatch(rs.getInt("idMatch"));

        match.setDebut(rs.getTimestamp("debut").toLocalDateTime());
        match.setResultat(rs.getString("resultat"));
        match.setJournee(JourneeDAO.map(rs));
        match.setTerrain(TerrainDAO.map(rs));



        return match;
    }

    public Match getArbitres(Match m){
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("SELECT * FROM Arbitre JOIN MatchArbitre using(idArbitre) JOIN Nationalite using(idNationalite) WHERE idMatch = ?");
            stmt.setInt(1,m.getIdMatch());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String type = rs.getString("type");
                if(type.equals("chaise")){
                    m.setChaise(ArbitreDAO.map(rs));
                }else{
                    m.setLigne(ArbitreDAO.map(rs));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionSQL.closeConnexion();
        return m;
    }
    public Match getRamasseurs(Match m){
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("SELECT * FROM RamasseurDeBalle JOIN EquipeRamasseur using(idEquipeRamasseur) JOIN EquipeRamasseurMatch using(idEquipeRamasseur) WHERE idMatch = ?");
            stmt.setInt(1,m.getIdMatch());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            m.setEquipe1(EquipeRamasseurDAO.map(rs));
            rs.next();
            m.setEquipe2(EquipeRamasseurDAO.map(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ConnectionSQL.closeConnexion();
        return m;
    }

    public ArrayList<Match> getAll(){
        Connection conn = ConnectionSQL.getConnection();
        PreparedStatement stmt = null;
        ArrayList<Match> list = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Match` JOIN Competition using(idCompetition) JOIN Journee using(idJournee) JOIN Terrain using(idTerrain) ORDER BY idMatch");
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
}
