package App;

import dao.AuthentificationDAO;

import javax.swing.*;

/**
 * Created by xontik on 14/12/2017.
 */
public class MainTest {


    public static void main(String[] args) {
        ConnectionDialog dialog = new ConnectionDialog();
        //dialog.setVisible(true);
        if(dialog.getTypeConnected() == AuthentificationDAO.TypePersonne.admin || true){
            System.out.println("On fait la suite en tant qu'admin");
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    AdminGUI adminGui = new AdminGUI();
                }
            });


        }else if(dialog.getTypeConnected() == AuthentificationDAO.TypePersonne.joueur){
            System.out.println("On fait la suite en tant que joueur");

        }else if(dialog.getTypeConnected() == AuthentificationDAO.TypePersonne.jb){
            System.out.println("Jb the best");
        }


    }
}
