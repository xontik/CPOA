package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.Places;
import java.util.ArrayList;
import java.util.Scanner;

public class PlacesDAO implements DAO<Places> {
    public DAOFactoryOracle DAOFactory;
    
    public PlacesDAO() throws SQLException {
        this.DAOFactory = new DAOFactoryOracle();
    }
    
    @Override
    public Places[] findAll() throws SQLException {
        Statement stmt = this.DAOFactory.getConnection().createStatement();
        
        ResultSet result = stmt.executeQuery("SELECT COUNT(*) FROM F_Place");
        result.next();
        Places[] places = new Places[result.getInt(1)];
        int i = 0;
        
        result = stmt.executeQuery("SELECT * FROM F_Place");
        
        while(result.next()) {
            places[i] = new Places(result.getInt(1), result.getInt(2), result.getString(3), result.getDouble(4));
            i++;
        }
        
        return places;
    }

    @Override
    public Places findById(int id) throws SQLException {
        Statement stmt = this.DAOFactory.getConnection().createStatement();
        ResultSet result = stmt.executeQuery("SELECT * FROM F_Place WHERE IDPlace = " + id);
        
        result.next();
        Places place = new Places(result.getInt(1), result.getInt(2), result.getString(3), result.getDouble(4));
        
        return place;
    }

    @Override
    public void insert(Places place) throws SQLException {
        Statement stmt = DAOFactory.getConnection().createStatement();
        int nbLigne = stmt.executeUpdate("INSERT INTO F_Place VALUES (" + place.getIDPlace() + ", " + place.getIDProprietaire() + ", '" + place.getNomPlace() + "', " + place.getNoteMoyenne() + ")");
        
        if(nbLigne > 0)
            System.out.println("Ajout de la place \"" + place.getNomPlace() + "\" réalisé avec succès");
        else
            System.out.println("Problème lors de l'ajout");
    }
    
}
