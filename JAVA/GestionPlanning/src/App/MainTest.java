package App;

import dao.AuthentificationDAO;
import dao.TestDAO;
import models.Test;

import java.sql.SQLException;

/**
 * Created by xontik on 14/12/2017.
 */
public class MainTest {


    public static void main(String[] args) {
        ConnectionDialog dialog = new ConnectionDialog();
        dialog.setVisible(true);
        if(dialog.getTypeConnected() == AuthentificationDAO.TypePersonne.admin){
            System.out.println("On fait la suite en tant qu'admin");

        }else if(dialog.getTypeConnected() == AuthentificationDAO.TypePersonne.joueur){
            System.out.println("On fait la suite en tant que joueur");

        }else if(dialog.getTypeConnected() == AuthentificationDAO.TypePersonne.jb){
            System.out.println("Jb the best");
        }

        System.exit(0);
    }
}
