package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.Test;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDAO implements DAO<Test> {
    public java.sql.Connection con;
    
    public TestDAO() throws SQLException {
        this.con = ConnectionSQL.getConnection();
    }
    
    @Override
    public Test[] findAll() throws SQLException {
        Statement stmt = this.con.createStatement();
        
        ResultSet result = stmt.executeQuery("SELECT COUNT(*) FROM Joueur");
        result.next();
        Test[] tests = new Test[result.getInt(1)];
        int i = 0;
        
        result = stmt.executeQuery("SELECT * FROM Joueur");
        
        while(result.next()) {
            tests[i] = new Test(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4),result.getString(5));
            i++;
        }
        
        return tests;
    }

    @Override
    public Test findById(int id) throws SQLException {
        Statement stmt = this.con.createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM Joueur WHERE idJoueur = " + id);
        
        result.next();
        Test place = new Test(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4),result.getString(5));

        return place;
    }

    @Override
    public void insert(Test place) throws SQLException {
    }
    
}
