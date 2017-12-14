package dao;

import java.sql.SQLException;

public interface DAO <T>{
    public T[]findAll() throws SQLException;
    public T findById(int id) throws SQLException;
    public void insert(T objet) throws SQLException;
}
