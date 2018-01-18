package dao;

import entity.Competition;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by xontik on 18/01/2018.
 */
public class CompetitionDAO {

    public static Competition map(ResultSet rs) throws SQLException {
        Competition competition =  new Competition();
        competition.setIdCompetition(rs.getInt("idCompetition"));
        competition.setType(rs.getString("type"));
        return competition;
    }
}
